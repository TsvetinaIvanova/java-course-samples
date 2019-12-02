package com.tsveti.javacourse;

public class Service implements Product {
    private String name;
    private int estimatedTaskDuration;
    private boolean timeAndMaterials;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstimatedTaskDuration() {
        return estimatedTaskDuration;
    }

    public void setEstimatedTaskDuration(int estimatedTaskDuration) {
        this.estimatedTaskDuration = estimatedTaskDuration;
    }

    public boolean hasTimeAndMaterials() {
        return timeAndMaterials;
    }

    public void setTimeAndMaterials(boolean timeAndMaterials) {
        this.timeAndMaterials = timeAndMaterials;
    }

    public String toString(){
        return name + "(a " + estimatedTaskDuration + " day service)";
    }
}
