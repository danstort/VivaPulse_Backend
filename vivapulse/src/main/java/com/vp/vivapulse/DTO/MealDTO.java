package com.vp.vivapulse.DTO;

import java.util.Date;

public class MealDTO {

    private Long id;
    private Long[] idAliment;
    private int calories;
    private Date createdAt= new Date();
    private String name;
    private UserDTO user;

    public MealDTO() {}

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    
}
