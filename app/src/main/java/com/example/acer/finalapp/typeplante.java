package com.example.acer.finalapp;

public class typeplante {
    String nom;
    int img;
    public typeplante(String nom, int img)
    {
        this.nom=nom;
        this.img=img;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}