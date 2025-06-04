package com.vp.vivapulse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vp.vivapulse.model.Meal;
import com.vp.vivapulse.service.MealService;

@RestController
@RequestMapping("/api")
public class MealController {

    @Autowired
    MealService mealService;

    @GetMapping("/meals")
    public List<Meal> getAllMeals() {
        return mealService.getAllMeals();
    }

    @GetMapping("/meals/{id}")
    public Meal getMealById(@PathVariable Long id) {
        return mealService.getMealById(id);
    }

    @GetMapping("/meals/user/{userId}")
    public List<Meal> getMealsByUserId(@PathVariable Long userId) {
        return mealService.getMealsByUserId(userId);
    }

    
    @PostMapping("/meals")
    public Meal saveMeal(@RequestBody Meal meal) {
        return mealService.saveMeal(meal);
    }

    @PutMapping("/meals/{id}")
    public Meal updateMeal(@PathVariable Long id, @RequestBody Meal meal) {
        return mealService.updateMeal(id, meal);
    }

    @DeleteMapping("/meals/{id}")
    public void deleteMeal(@PathVariable Long id) {
        mealService.deleteMeal(id);
    }

}
