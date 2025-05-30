package com.vp.vivapulse.controller;



import com.vp.vivapulse.model.Aliment;
import com.vp.vivapulse.service.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aliments")
@CrossOrigin(origins = "http://localhost:5173") // Para permitir solicitudes desde React
public class AlimentController {

    @Autowired
    private AlimentService alimentService;

    // Obtener todos los alimentos
    @GetMapping
    public List<Aliment> getAllAliments() {
        return alimentService.getAllAliments();
    }

    // Guardar un nuevo alimento
    @PostMapping
    public Aliment saveAliment(@RequestBody Aliment aliment) {
        return alimentService.saveAliment(aliment);
    }

    // Prueba con este endpoint de testeo
    @GetMapping("/test")
    public String testEndpoint() {
        return "El endpoint funciona!";
    }

    // Obtener un alimento por su ID
    @GetMapping("/{id}")
    public Aliment getAlimentById(@PathVariable Long id) {
        return alimentService.getAlimentById(id);
    }

    // Actualizar un alimento existente
    @PutMapping("/{id}")
    public Aliment updateAliment(@PathVariable Long id, @RequestBody Aliment aliment) {
        return alimentService.updateAliment(id, aliment);
    }

    // Eliminar un alimento por su ID
    @DeleteMapping("/{id}")
    public void deleteAliment(@PathVariable Long id) {
        alimentService.deleteAliment(id);
    }
}

