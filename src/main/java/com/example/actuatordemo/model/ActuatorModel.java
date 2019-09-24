package com.example.actuatordemo.model;


public class ActuatorModel {
    private final String serviceStatus;

    public ActuatorModel(String content) {
        this.serviceStatus = content;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

}