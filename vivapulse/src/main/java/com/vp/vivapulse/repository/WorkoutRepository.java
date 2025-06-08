package com.vp.vivapulse.repository;

import org.springframework.stereotype.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.vp.vivapulse.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    List<Workout> findByUserId(Long userId);
    
}
