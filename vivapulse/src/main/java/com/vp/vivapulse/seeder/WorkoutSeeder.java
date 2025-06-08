package com.vp.vivapulse.seeder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vp.vivapulse.model.Training;
import com.vp.vivapulse.model.User;
import com.vp.vivapulse.model.Workout;
import com.vp.vivapulse.repository.WorkoutRepository;

@Component
public class WorkoutSeeder implements CommandLineRunner{
    
    private final WorkoutRepository workoutRepository;

    public WorkoutSeeder(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (workoutRepository.count() == 0) {
            
            // Instanciar usuarios con solo el id
            User user1 = new User();
            user1.setId(1L);
            User user2 = new User();
            user2.setId(2L);
            User user3 = new User();
            user3.setId(3L);

            //Instanciar training con solo el id
            Training training1 = new Training();
            training1.setId(1L);
            Training training2 = new Training();
            training2.setId(2L);
            Training training3 = new Training();
            training3.setId(3L);

            workoutRepository.save(new Workout(user1, training1, 500, 30));
            workoutRepository.save(new Workout(user1, training2, 600, 45));
            workoutRepository.save(new Workout(user1, training3, 700, 60));
            workoutRepository.save(new Workout(user2, training1, 450, 25));
            workoutRepository.save(new Workout(user2, training2, 550, 35));
            workoutRepository.save(new Workout(user2, training3, 650, 50));
            workoutRepository.save(new Workout(user3, training1, 400, 20));
            workoutRepository.save(new Workout(user3, training2, 500, 30));
            workoutRepository.save(new Workout(user3, training3, 600, 40));
            
            System.out.println("Workouts seeded successfully.");
        } else {
            System.out.println("Workouts already seeded.");
        }
    }

}
