package com.spring.springproject.controller;

import com.spring.springproject.entities.TrainingCenter;
import com.spring.springproject.services.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@Validated
public class TrainingCenterController {
	 @Autowired
	    private TrainingCenterService trainingCenterService;

	    @PostMapping
	    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
	        TrainingCenter savedCenter = trainingCenterService.createTrainingCenter(trainingCenter);
	        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
	        List<TrainingCenter> centers = trainingCenterService.getAllTrainingCenters();
	        return new ResponseEntity<>(centers, HttpStatus.OK);
	    }
}
