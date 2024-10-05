package com.spring.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.springproject.entities.TrainingCenter;


public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {

}
