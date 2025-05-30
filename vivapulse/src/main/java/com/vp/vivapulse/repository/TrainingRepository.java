package com.vp.vivapulse.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vp.vivapulse.model.Training;

@Repository

public interface TrainingRepository extends JpaRepository<Training, Long> {
}
