package com.vp.vivapulse.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vp.vivapulse.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    // Custom query methods can be defined here if needed
}
