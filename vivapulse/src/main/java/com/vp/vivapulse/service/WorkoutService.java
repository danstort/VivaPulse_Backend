package com.vp.vivapulse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vp.vivapulse.model.Workout;
import com.vp.vivapulse.repository.WorkoutRepository;

@Service
public class WorkoutService {

    @Autowired
    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }


    public Workout getWorkoutById(Long id) {
        return workoutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Workout not found with id: " + id));
    }

    public List<Workout> getWorkoutsByUserId(Long userId) {
        List<Workout> workouts = workoutRepository.findByUserId(userId);
        if (workouts.isEmpty()) {
            throw new RuntimeException("No workouts found for user with id: " + userId);
        }
        return workouts;
    }

    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public Workout updateWorkout(Long id, Workout updatedWorkout) {
        Workout existingWorkout = workoutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Workout not found with id: " + id));
        existingWorkout.setTotalCalories(updatedWorkout.getTotalCalories());
        existingWorkout.setTime(updatedWorkout.getTime());
        existingWorkout.setUser(updatedWorkout.getUser());
        existingWorkout.setTraining(updatedWorkout.getTraining());
        existingWorkout.setCreatedAt(updatedWorkout.getCreatedAt());
        
        return workoutRepository.save(existingWorkout);
    }

    public void deleteWorkout(Long id) {
        Workout workout = workoutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Workout not found with id: " + id));
        workoutRepository.delete(workout);
    }

}