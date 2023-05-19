package com.example.project;

public class Animals {

     String ID;
     String name;
     String location;
     int Size;
     int population;
     String company;
     String audaxdata;


    public  Animals (String ID, String name, String location, int Size, int population,
                     String company, String audaxdata) {
        this.ID= ID;
        this.name = name;
        this.location=location;
        this.Size = Size;
        this.population = population;
        this.company = company;
        this.audaxdata = audaxdata;


        }



    public String ID() {

        return ID;
    }

    public String getName() {

        return name;
    }
    public String getLocation() {

        return location;
    }
    public int getSize() {

        return Size;
    }
    public int getPopulation() {

        return population;
    }
    public String getCompany() {

        return company;
    }

    public String getAudaxdata() {

        return audaxdata;
    }


}




