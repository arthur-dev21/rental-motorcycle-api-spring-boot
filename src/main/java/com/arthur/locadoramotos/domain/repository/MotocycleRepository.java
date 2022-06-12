package com.arthur.locadoramotos.domain.repository;

import com.arthur.locadoramotos.domain.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotocycleRepository extends JpaRepository<Motorcycle,Long> {
}
