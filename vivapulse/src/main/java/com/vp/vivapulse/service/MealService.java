package com.vp.vivapulse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.vivapulse.model.Meal;
import com.vp.vivapulse.repository.MealRepository;



@Service
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
        if (meal.getIdUser() == null || meal.getIdAliment() == null || meal.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid meal data");
        }
        meal.setVersion(1L); // Establece la versión inicial
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
    @Transactional
public Meal updateMeal(Long id, Meal updatedMeal) {
    try {
        Meal existingMeal = mealRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Meal not found with id: " + id));

        existingMeal.setName(updatedMeal.getName());
        existingMeal.setCalories(updatedMeal.getCalories());
        existingMeal.setIdAliment(updatedMeal.getIdAliment());
        existingMeal.setCreatedAt(updatedMeal.getCreatedAt());
        existingMeal.setIdUser(updatedMeal.getIdUser());

        return mealRepository.save(existingMeal);

    } catch (ObjectOptimisticLockingFailureException ex) {
        throw new RuntimeException("La comida fue modificada por otro usuario. Por favor, recarga los datos e inténtalo de nuevo.", ex);
    }
}

    // Eliminar una comida por su ID
    public void deleteMeal(Long id) {
        if (!mealRepository.existsById(id)) {
            throw new RuntimeException("Meal not found with id: " + id);
        }
        mealRepository.deleteById(id);
    }

}
