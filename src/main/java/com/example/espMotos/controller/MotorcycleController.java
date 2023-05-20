package com.example.espMotos.controller;

import com.example.espMotos.motorcylce.Motorcycle;
import com.example.espMotos.motorcylce.MotorcycleRepository;
import com.example.espMotos.motorcylce.MotorcycleRequestDTO;
import com.example.espMotos.motorcylce.MotorcycleResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("motorcycles")
@CrossOrigin()
public class MotorcycleController {
    @Autowired
    private MotorcycleRepository repository;

    @PostMapping
    public void saveMotorcycle(@RequestBody MotorcycleRequestDTO data) {
        Motorcycle motorcycleData = new Motorcycle(data);
        repository.save(motorcycleData);
    }

    @GetMapping
    public List<MotorcycleResponseDTO> getAll() {
        List<MotorcycleResponseDTO> motorcycles = repository.findAll().stream().map(MotorcycleResponseDTO::new).toList();
        return motorcycles;
    }
}
