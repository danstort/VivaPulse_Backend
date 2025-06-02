package com.vp.vivapulse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vp.vivapulse.model.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
