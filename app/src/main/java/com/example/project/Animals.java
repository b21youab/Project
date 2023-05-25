package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Animals {

     String ID;
     String name;
     String location;


    @SerializedName("size")
    int weight;
    @SerializedName ("cost")

     int population;
     String company;



    public  Animals (String ID, String name, String location, int Size, int population,
                     String company) {
        this.ID= ID;
        this.name = name;
        this.location=location;
        this.weight = weight;
        this.population = population;
        this.company = company;
     }



    public String getID() {

        return ID;
    }

    public String getName() {

        return name;
    }
    public String getLocation() {

        return location;
    }
    public int getWeight() {

        return weight;
    }
    public int getPopulation() {

        return population;
    }
    public String getCompany() {

        return company;
    }



}




