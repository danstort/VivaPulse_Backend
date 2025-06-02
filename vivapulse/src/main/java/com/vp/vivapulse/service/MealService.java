package com.vp.vivapulse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vp.vivapulse.model.Meal;
import com.vp.vivapulse.repository.MealRepository;



public class MealService {
    @Autowired
    private MealRepository mealRepository;

    // Obtener todas las comidas
    public List<Meal> getAllMeals() {
        List<Meal> meals = mealRepository.findAll();
        System.out.println("Meals en la BD: " + meals);
        return meals;
    }

    // Guardar una nueva comida
    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    // Obtener una comida por su ID
    public Meal getMealById(Long id) {
        return mealRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Meal not found with id: " + id));
    }

    // Obtener comidas por ID de usuario
    public List<Meal> getMealsByUserId(Long userId) {
        List<Meal> meals = mealRepository.findByIdUser(userId);
        if (meals.isEmpty()) {
            throw new RuntimeException("No meals found for user with id: " + userId);
        }
        return meals;
    }

    // Actualizar una comida existente
    public Meal updateMeal(Long id, Meal updatedMeal) {
        Meal existingMeal = mealRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Meal not found with id: " + id));
        existingMeal.setName(updatedMeal.getName());
        existingMeal.setCalories(updatedMeal.getCalories());
        // Agrega aquí otros campos que quieras actualizar
        return mealRepository.save(existingMeal);
    }

    // Eliminar una comida por su ID
    public void deleteMeal(Long id) {
        if (!mealRepository.existsById(id)) {
            throw new RuntimeException("Meal not found with id: " + id);
        }
        mealRepository.deleteById(id);
    }

}
