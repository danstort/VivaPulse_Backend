package com.vp.vivapulse.controller;

import com.vp.vivapulse.model.Training;
import com.vp.vivapulse.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainings")
@CrossOrigin(origins = "http://localhost:5173") // Para permitir solicitudes desde React
public class TrainigController {

    @Autowired
    private TrainingService trainingService;

    // Obtener todos los entrenamientos
    @GetMapping
    public List<Training> getAllTrainings() {
        return trainingService.getAllTrainings();
    }

    // Guardar un nuevo entrenamiento
    @PostMapping
    public Training saveTraining(@RequestBody Training training) {
        return trainingService.saveTraining(training);
    }

    // Endpoint de testeo
    @GetMapping("/test")
    public String testEndpoint() {
        return "El endpoint de trainings funciona!";
    }

    // Obtener un entrenamiento por su ID
    @GetMapping("/{id}")
    public Training getTrainingById(@PathVariable Long id) {
        return trainingService.getTrainingById(id);
    }

    // Actualizar un entrenamiento existente
    @PutMapping("/{id}")
    public Training updateTraining(@PathVariable Long id, @RequestBody Training training) {
        return trainingService.updateTraining(id, training);
    }

    // Eliminar un entrenamiento por su ID
    @DeleteMapping("/{id}")
    public void deleteTraining(@PathVariable Long id) {
        trainingService.deleteTraining(id);
    }
}
