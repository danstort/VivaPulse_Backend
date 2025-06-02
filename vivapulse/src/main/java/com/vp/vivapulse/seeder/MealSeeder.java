package com.vp.vivapulse.seeder;

import org.springframework.boot.CommandLineRunner;

import com.vp.vivapulse.model.Meal;
import com.vp.vivapulse.repository.MealRepository;

//@Component
public class MealSeeder implements CommandLineRunner {

    private final MealRepository mealRepository;

    public MealSeeder(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (mealRepository.count() == 0) {
            // Ejemplo para insertar en tu seeder o test
            mealRepository.save(new Meal(1L, 1L, 120));
            mealRepository.save(new Meal(1L, 2L, 89));
            mealRepository.save(new Meal(2L, 3L, 47));
            mealRepository.save(new Meal(2L, 4L, 57));
            mealRepository.save(new Meal(3L, 5L, 30));
            mealRepository.save(new Meal(3L, 6L, 34));
            mealRepository.save(new Meal(4L, 7L, 69));
            mealRepository.save(new Meal(4L, 8L, 33));
            mealRepository.save(new Meal(5L, 9L, 50));
            mealRepository.save(new Meal(5L, 10L, 60));

        } else {
            System.out.println("Meals already seeded.");
        }
    }
}
