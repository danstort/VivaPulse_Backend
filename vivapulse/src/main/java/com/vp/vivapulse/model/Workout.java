package com.vp.vivapulse.model;


import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalCalories;
    private int time;
    private Date createdAt = new Date();



    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    // Constructors
    public Workout() {}

    public Workout(User user, Training training, int totalCalories, int time, Date createdAt) {
        this.user = user;
        this.training = training;
        this.totalCalories = totalCalories;
        this.time = time;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Training getTraining() {
        return training;
    }
    public void setTraining(Training training) {
        this.training = training;
    }
    public int getTotalCalories() {
        return totalCalories;
    }
    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
  
}
