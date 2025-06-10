package com.vp.vivapulse.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vp.vivapulse.DTO.UserDTO;
import com.vp.vivapulse.DTO.TrainingDTO;
import com.vp.vivapulse.DTO.WorkoutDTO;
import com.vp.vivapulse.model.Training;
import com.vp.vivapulse.model.User;
import com.vp.vivapulse.model.Workout;
import com.vp.vivapulse.service.WorkoutService;

@RestController
@RequestMapping("/api")
public class WorkoutController {

    @Autowired
    WorkoutService workoutService;

    @GetMapping("/workouts")
    public List<WorkoutDTO> getAllWorkouts() {
        return workoutService.getAllWorkouts().stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
    }

    @GetMapping("/workouts/{id}")
    public WorkoutDTO getWorkoutById(@PathVariable Long id) {
        Workout workout = workoutService.getWorkoutById(id);
        return convertToDTO(workout);
    }

    @GetMapping("/workouts/user/{userId}")
    public List<WorkoutDTO> getWorkoutsByUserId(@PathVariable Long userId) {
        return workoutService.getWorkoutsByUserId(userId).stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
    }

    @PostMapping("/workouts")
    public WorkoutDTO saveWorkout(@RequestBody WorkoutDTO workoutDTO) {
        Workout workout = convertToEntity(workoutDTO);
        Workout saved = workoutService.saveWorkout(workout);
        return convertToDTO(saved);
    }

    @PutMapping("/workouts/{id}")
    public WorkoutDTO updateWorkout(@PathVariable Long id, @RequestBody WorkoutDTO workoutDTO) {
        Workout workout = convertToEntity(workoutDTO);
        Workout updated = workoutService.updateWorkout(id, workout);
        return convertToDTO(updated);
    }

    @DeleteMapping("/workouts/{id}")
    public void deleteWorkout(@PathVariable Long id) {
        workoutService.deleteWorkout(id);
    }

    // Conversion methods
    private WorkoutDTO convertToDTO(Workout workout) {
        if (workout == null) return null;
        WorkoutDTO dto = new WorkoutDTO();
        dto.setId(workout.getId());
        dto.setTotalCalories(workout.getTotalCalories());
        dto.setTime(workout.getTime());
        dto.setCreatedAt(workout.getCreatedAt()); // <-- Añade esto

        // Convert User to UserDTO
        if (workout.getUser() != null) {
            User user = workout.getUser();
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            
            // Agregar más campos si es necesario
            dto.setUser(userDTO);
        }
        // Convert Training to TrainingDTO if needed
        if (workout.getTraining() != null) {
            
            TrainingDTO trainingDTO = new TrainingDTO();

            trainingDTO.setId(workout.getTraining().getId());
            // Agregar más campos si es necesario
            dto.setTraining(trainingDTO);
        }
        return dto;
    }

    private Workout convertToEntity(WorkoutDTO dto) {
        if (dto == null) return null;
        Workout workout = new Workout();
        workout.setId(dto.getId());
        workout.setTotalCalories(dto.getTotalCalories());
        workout.setTime(dto.getTime());
        workout.setCreatedAt(dto.getCreatedAt()); // <-- Añade esto

        // Convert UserDTO to User
        if (dto.getUser() != null) {
            UserDTO userDTO = dto.getUser();
            User user = new User();
            user.setId(userDTO.getId());

            workout.setUser(user);
        }
        // Convert TrainingDTO to Training if needed
        if (dto.getTraining() != null) {
            TrainingDTO trainingDTO = dto.getTraining();
            Training training = new Training();
            training.setId(trainingDTO.getId());
            workout.setTraining(training);
        }
        return workout;
    }
}
