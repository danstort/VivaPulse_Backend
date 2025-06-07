package com.vp.vivapulse.model;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "trainings")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int caloriesBurned;
    private int nivelDificulta; 
    private String categoria;
    private String image;

    @OneToMany(mappedBy = "training")
    private List<Workout> workouts;
  
    // Constructors
    public Training() {}

    public Training( String name, int caloriesBurned, int nivelDificulta, String image, String categoria) {
        this.name = name;
        this.caloriesBurned = caloriesBurned;
        this.nivelDificulta = nivelDificulta; 
        this.image = image;
        this.categoria = categoria;

    }

    // Getters and Setters
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Long getId() {
        return id;
    }   
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCaloriesBurned() {
        return caloriesBurned;
    }
    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    public int getNivelDificulta() {
        return nivelDificulta;
    }
    public void setNivelDificulta(int nivelDificulta) {
        this.nivelDificulta = nivelDificulta;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    


}
