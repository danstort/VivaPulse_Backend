package com.vp.vivapulse.seeder;

import org.springframework.boot.CommandLineRunner;

import com.vp.vivapulse.model.Nutrition;
import com.vp.vivapulse.repository.NutritionRepository;

//@Component
public class NutritionSeeder implements CommandLineRunner {

    private final NutritionRepository nutritionRepository;

    public NutritionSeeder(NutritionRepository alimentRepository) {
        this.nutritionRepository = alimentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (nutritionRepository.count() == 0) {
            // Ejemplo para insertar en tu seeder o test
            nutritionRepository.save(new Nutrition(1L, 1L, 120));
            nutritionRepository.save(new Nutrition(1L, 2L, 89));
            nutritionRepository.save(new Nutrition(2L, 3L, 47));
            nutritionRepository.save(new Nutrition(2L, 4L, 57));
            nutritionRepository.save(new Nutrition(3L, 5L, 30));
            nutritionRepository.save(new Nutrition(3L, 6L, 34));
            nutritionRepository.save(new Nutrition(4L, 7L, 69));
            nutritionRepository.save(new Nutrition(4L, 8L, 33));
            nutritionRepository.save(new Nutrition(5L, 9L, 50));
            nutritionRepository.save(new Nutrition(5L, 10L, 60));

        } else {
            System.out.println("Aliments already seeded.");
        }
    }
}
