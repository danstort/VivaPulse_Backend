package com.vp.vivapulse.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vp.vivapulse.model.Meal;
import com.vp.vivapulse.model.User;
import com.vp.vivapulse.service.MealService;
import com.vp.vivapulse.DTO.MealDTO;
import com.vp.vivapulse.DTO.UserDTO;

@RestController
@RequestMapping("/api")
public class MealController {

    @Autowired
    MealService mealService;

    @GetMapping("/meals")
    public List<MealDTO> getAllMeals() {
        return mealService.getAllMeals().stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
    }

    @GetMapping("/meals/{id}")
    public MealDTO getMealById(@PathVariable Long id) {
        Meal meal = mealService.getMealById(id);
        return convertToDTO(meal);
    }

    @GetMapping("/meals/user/{userId}")
    public List<MealDTO> getMealsByUserId(@PathVariable Long userId) {
        return mealService.getMealsByUserId(userId).stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
    }

    @PostMapping("/meals")
    public MealDTO saveMeal(@RequestBody MealDTO mealDTO) {
        Meal meal = convertToEntity(mealDTO);
        Meal saved = mealService.saveMeal(meal);
        return convertToDTO(saved);
    }

    @PutMapping("/meals/{id}")
    public MealDTO updateMeal(@PathVariable Long id, @RequestBody MealDTO mealDTO) {
        Meal meal = convertToEntity(mealDTO);
        Meal updated = mealService.updateMeal(id, meal);
        return convertToDTO(updated);
    }

    @DeleteMapping("/meals/{id}")
    public void deleteMeal(@PathVariable Long id) {
        mealService.deleteMeal(id);
    }

    // Conversion methods
    private MealDTO convertToDTO(Meal meal) {
        if (meal == null) return null;
        MealDTO dto = new MealDTO();
        dto.setId(meal.getId());
        dto.setName(meal.getName());
        dto.setCalories(meal.getCalories());
        dto.setCreatedAt(meal.getCreatedAt());
        dto.setIdAliment(meal.getIdAliment());
        // Convert User to UserDTO
        if (meal.getUser() != null) {
            User user = meal.getUser();
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            
            // Agregar más campos si es necesario
            dto.setUser(userDTO);
        }
        return dto;
    }

    private Meal convertToEntity(MealDTO dto) {
        if (dto == null) return null;
        Meal meal = new Meal();
        meal.setId(dto.getId());
        meal.setName(dto.getName());
        meal.setCalories(dto.getCalories());
        meal.setCreatedAt(dto.getCreatedAt());
        meal.setIdAliment(dto.getIdAliment());

        // Convert UserDTO to User
        if (dto.getUser() != null) {
            UserDTO userDTO = dto.getUser();
            User user = new User();
            user.setId(userDTO.getId());
            
            meal.setUser(user);
        }
        return meal;
    }

}
