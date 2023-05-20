package com.example.espMotos.motorcylce;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "motorcycles")
@Entity(name = "motorcycles")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String title;
    private Integer year;
    private String img;

    public Motorcycle(MotorcycleRequestDTO data) {
        this.brand = data.brand();
        this.model = data.model();
        this.title = data.title();
        this.year = data.year();
        this.img = data.img();
    }
}