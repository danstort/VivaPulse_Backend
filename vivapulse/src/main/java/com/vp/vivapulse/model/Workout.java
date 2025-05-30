package com.vp.vivapulse.model;
import jakarta.persistence.*;


@Entity
@Table(name = "training")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUser;
    private Long idTraining;
    private int totalCalories;
    private int time;

   
  
    // Constructors
    public Workout() {}

    public Workout(Long idUser, Long idTraining, int totalCalories, int time) {
        this.idUser = idUser;
        this.idTraining = idTraining;
        this.totalCalories = totalCalories;
        this.time = time;
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
    public Long getIdTraining() {
        return idTraining;
    }
    public void setIdTraining(Long idTraining) {
        this.idTraining = idTraining;
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
    


}
