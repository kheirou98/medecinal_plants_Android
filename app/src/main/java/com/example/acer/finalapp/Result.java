package com.example.acer.finalapp;


public class Result {
    int imgaeId ;
    String nom;
    float taux;


    public void setImgaeId(int image){
        this.imgaeId = image;
    }

    public void setNom(String name){
        this.nom = name;
    }

    public void setTaux(float tau){
        this.taux = tau ;
    }

    public int getImgaeId(){
        return this.imgaeId;
    }

    public String getNom(){
        return this.nom;
    }
    public float getTaux(){
        return this.taux;
    }

    public void copy(Result resulta){
        this.imgaeId= resulta.getImgaeId();
        this.nom= resulta.getNom();
        this.taux= resulta.getTaux();
    }
}
