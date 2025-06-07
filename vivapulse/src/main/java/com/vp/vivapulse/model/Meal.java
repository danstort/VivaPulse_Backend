package com.vp.vivapulse.model;


import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long[] idAliment;
    private int calories;
    private Date createdAt = new Date();

    @Column(nullable = true) // Indica que este campo es opcional
    private String name;

    @Version
    private Long version;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    // Constructors
    public Meal() {}


    public Meal(User user, Long[] idAliment, int calories, Date createdAt, String name) {
        this.user = user;
        this.idAliment = idAliment;
        this.calories = calories;
        this.createdAt = createdAt;
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long[] getIdAliment() {
        return idAliment;
    }
    public void setIdAliment(Long[] idAliment) {
        this.idAliment = idAliment;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
