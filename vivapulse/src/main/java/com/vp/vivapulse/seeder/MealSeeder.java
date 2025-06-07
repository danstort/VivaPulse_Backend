package com.vp.vivapulse.seeder;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vp.vivapulse.model.Meal;
import com.vp.vivapulse.model.User;
import com.vp.vivapulse.repository.MealRepository;

@Component
public class MealSeeder implements CommandLineRunner {

    private final MealRepository mealRepository;

    public MealSeeder(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (mealRepository.count() == 0) {
            // Instanciar usuarios con solo el id
            User user1 = new User();
            user1.setId(1L);
            User user2 = new User();
            user2.setId(2L);
            User user3 = new User();
            user3.setId(3L);

            mealRepository.save(new Meal(user1, new Long[]{1L, 2L}, 500, convertToDate(LocalDateTime.now()), "Desayuno"));
            mealRepository.save(new Meal(user1, new Long[]{3L, 4L}, 600, convertToDate(LocalDateTime.now()), "Almuerzo"));
            mealRepository.save(new Meal(user1, new Long[]{5L, 6L}, 700, convertToDate(LocalDateTime.now()), "Cena"));
            mealRepository.save(new Meal(user2, new Long[]{7L, 8L}, 450, convertToDate(LocalDateTime.now()), "Desayuno"));
            mealRepository.save(new Meal(user2, new Long[]{9L, 10L}, 550, convertToDate(LocalDateTime.now()), "Almuerzo"));
            mealRepository.save(new Meal(user2, new Long[]{11L, 12L}, 650, convertToDate(LocalDateTime.now()), "Cena"));
            mealRepository.save(new Meal(user3, new Long[]{13L, 14L}, 400, convertToDate(LocalDateTime.now()), "Desayuno"));
            mealRepository.save(new Meal(user3, new Long[]{15L, 16L}, 500, convertToDate(LocalDateTime.now()), "Almuerzo"));
            mealRepository.save(new Meal(user3, new Long[]{17L, 18L}, 600, convertToDate(LocalDateTime.now()), "Cena"));
        } else {
            System.out.println("Meals already seeded.");
        }
    }

    private Date convertToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
