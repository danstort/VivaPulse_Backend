package com.vp.vivapulse.service;



import com.vp.vivapulse.model.Aliment;
import com.vp.vivapulse.repository.AlimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentService {

    @Autowired
    private AlimentRepository alimentRepository;

    // Obtener todos los alimentos
    public List<Aliment> getAllAliments() {
        List<Aliment> aliments = alimentRepository.findAll();
        System.out.println("📢 Aliments en la BD: " + aliments);
        return aliments;    }

    // Guardar un nuevo alimento
    public Aliment saveAliment(Aliment aliment) {
        return alimentRepository.save(aliment);
    }
    // Obtener un alimento por su ID
    public Aliment getAlimentById(Long id) {
        return alimentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aliment not found with id: " + id));
    }

    // Actualizar un alimento existente
    public Aliment updateAliment(Long id, Aliment updatedAliment) {
        Aliment existingAliment = alimentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aliment not found with id: " + id));
        existingAliment.setName(updatedAliment.getName());
        existingAliment.setCalories(updatedAliment.getCalories());
        return alimentRepository.save(existingAliment);
    }

    // Eliminar un alimento por su ID
    public void deleteAliment(Long id) {
        if (!alimentRepository.existsById(id)) {
            throw new RuntimeException("Aliment not found with id: " + id);
        }
        alimentRepository.deleteById(id);
    }
}

