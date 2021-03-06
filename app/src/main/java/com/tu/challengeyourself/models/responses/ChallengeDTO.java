package com.tu.challengeyourself.models.responses;

public class ChallengeDTO {

    private int id;
    private int target;
    private String name;
    private String measurement;
    private String category;
    private String description;

    public ChallengeDTO() {
    }

    public ChallengeDTO(int id, int target, String name, String measurement, String category, String description) {
        this.id = id;
        this.target = target;
        this.name = name;
        this.measurement = measurement;
        this.category = category;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
