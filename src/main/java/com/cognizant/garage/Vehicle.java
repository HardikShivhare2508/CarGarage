package com.cognizant.garage;

public class Vehicle {

    public Vehicle(String model, String regplate){
        super();
        this.model = model;
        this.regplate = regplate;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegplate() {
        return regplate;
    }

    public void setRegplate(String regplate) {
        this.regplate = regplate;
    }

    private String model;
    private String regplate;


    public Vehicle(){

    }

}
