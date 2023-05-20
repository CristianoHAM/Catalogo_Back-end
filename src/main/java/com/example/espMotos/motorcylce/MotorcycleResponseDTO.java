package com.example.espMotos.motorcylce;

public record MotorcycleResponseDTO(Long id, String brand, String model, String title, Integer year, String img ) {
    public MotorcycleResponseDTO(Motorcycle motorcycle){
        this(motorcycle.getId(), motorcycle.getBrand(), motorcycle.getModel(), motorcycle.getTitle(), motorcycle.getYear(), motorcycle.getImg());



    }
}
