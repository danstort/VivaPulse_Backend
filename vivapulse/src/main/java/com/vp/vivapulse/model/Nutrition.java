package com.vp.vivapulse.model;


import jakarta.persistence.*;


@Entity
@Table(name = "training")
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUser;
    private Long idAliment;
    private int calories;
  
    // Constructors
    public Nutrition() {}

   
    public Nutrition(Long idUser, Long idAliment, int calories) {
        this.idUser = idUser;
        this.idAliment = idAliment;
        this.calories = calories;
    }   
    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdUser() {
        return idUser;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
    public Long getIdAliment() {
        return idAliment;
    }
    public void setIdAliment(Long idAliment) {
        this.idAliment = idAliment;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    


}
