package com.vp.vivapulse.service;

import com.vp.vivapulse.model.Training;
import com.vp.vivapulse.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    // Obtener todos los entrenamientos
    public List<Training> getAllTrainings() {
        List<Training> trainings = trainingRepository.findAll();
        System.out.println("📢 training en la BD: " + trainings);
        return trainings;
    }

    // Guardar un nuevo entrenamiento
    public Training saveTraining(Training training) {
        return trainingRepository.save(training);
    }

    // Obtener un entrenamiento por su ID
    public Training getTrainingById(Long id) {
        return trainingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Training not found with id: " + id));
    }

    // Actualizar un entrenamiento existente
    public Training updateTraining(Long id, Training updatedTraining) {
        Training existingTraining = trainingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Training not found with id: " + id));
        existingTraining.setName(updatedTraining.getName());
        existingTraining.setDuration(updatedTraining.getDuration());
        return trainingRepository.save(existingTraining);
    }

    // Eliminar un entrenamiento por su ID
    public void deleteTraining(Long id) {
        if (!trainingRepository.existsById(id)) {
            throw new RuntimeException("Training not found with id: " + id);
        }
        trainingRepository.deleteById(id);
    }
}
