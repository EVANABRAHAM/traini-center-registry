package com.spring.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.spring.springproject.entities.TrainingCenter;
import com.spring.springproject.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TrainingCenterService {
	 @Autowired
	    private TrainingCenterRepository trainingCenterRepository;

	    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
	        return trainingCenterRepository.save(trainingCenter);
	    }

	    public List<TrainingCenter> getAllTrainingCenters() {
	        return trainingCenterRepository.findAll();
	    }
}
