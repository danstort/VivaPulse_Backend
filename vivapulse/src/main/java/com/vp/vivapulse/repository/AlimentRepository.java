package com.vp.vivapulse.repository;


import com.vp.vivapulse.model.Aliment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentRepository extends JpaRepository<Aliment, Long> {
}

