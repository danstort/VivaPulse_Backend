package com.vp.vivapulse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vp.vivapulse.model.Nutrition;

@Repository
public interface NutritionRepository extends JpaRepository<Nutrition, Long> {
}
