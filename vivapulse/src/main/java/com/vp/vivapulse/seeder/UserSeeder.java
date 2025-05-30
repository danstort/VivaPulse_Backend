// package com.vp.vivapulse.seeder;

// import com.vp.vivapulse.model.User;
// import com.vp.vivapulse.repository.UserRepository;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;




// //@Component
// public class UserSeeder implements CommandLineRunner {

//     private final UserRepository userRepository;

//     public UserSeeder(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @Override
//     public void run(String... args) throws Exception {
//         if (userRepository.count() == 0) {
//             User user1 = new User();
//             user1.setFirstName("Juan Pérez");
//             user1.setEmail("juan.perez@example.com");
//             user1.setPassword("password123");

//             User user2 = new User();
//             user2.setFirstName("Ana Gómez");
//             user2.setEmail("ana.gomez@example.com");
//             user2.setPassword("password456");

//             userRepository.save(user1);
//             userRepository.save(user2);
//         }
//     }
// }