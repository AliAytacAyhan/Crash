package com.crash.repository;

import com.crash.model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<Disease , Integer>
{
}
