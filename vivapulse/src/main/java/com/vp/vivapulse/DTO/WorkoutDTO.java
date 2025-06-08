package com.vp.vivapulse.DTO;

public class WorkoutDTO {
    
    private Long id;
    private int totalCalories;
    private int time;
    private UserDTO user;
    private TrainingDTO training;

    public WorkoutDTO() {}

    public WorkoutDTO(Long id, int totalCalories, int time, UserDTO user, TrainingDTO training) {
        this.id = id;
        this.totalCalories = totalCalories;
        this.time = time;
        this.user = user;
        this.training = training;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public TrainingDTO getTraining() {
        return training;
    }

    public void setTraining(TrainingDTO training) {
        this.training = training;
    }

    
}
