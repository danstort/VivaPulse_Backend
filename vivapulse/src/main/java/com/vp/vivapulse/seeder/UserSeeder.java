package com.vp.vivapulse.seeder;

import com.vp.vivapulse.model.User;
import com.vp.vivapulse.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;



@Component
@Order(1)
public class UserSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserSeeder(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User user1 = new User();
            user1.setFirstName("Juan");
            user1.setLastName("Pérez");
            user1.setEmail("user@mail.com");
            user1.setPassword(passwordEncoder.encode("user"));            // Set isAdmin to true for the first user
            user1.setIsAdmin(true);


            User user2 = new User();
            user2.setFirstName("Ana");
            user2.setLastName("Gómez");
            user2.setEmail("ana.gomez@example.com");
            user2.setPassword(passwordEncoder.encode("password456"));

            User user3 = new User();
            user3.setFirstName("Carlos");
            user3.setLastName("López");
            user3.setEmail("carlos.lopez@example.com");
            user3.setPassword(passwordEncoder.encode("password789"));

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }
    }
}