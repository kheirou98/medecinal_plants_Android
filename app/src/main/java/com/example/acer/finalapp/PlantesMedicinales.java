package com.example.acer.finalapp;

public class PlantesMedicinales {

    private int id;
    private String name;
    private String image;
    private String nomLatin;
    private String famille;
    private String type;
    private String proprietes;
    private String posologie;
    private String precautions;
    private String partieUtilises;

    public PlantesMedicinales(String name, String image, int id, String nomLatin, String famille,String type, String proprietes, String partieUtilises,
                              String posologie, String precautions) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.nomLatin = nomLatin;
        this.famille = famille;
        this.type = type;
        this.proprietes = proprietes;
        this.partieUtilises = partieUtilises;
        this.posologie = posologie;
        this.precautions = precautions;


    }

    public PlantesMedicinales(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNomLatin() {
        return nomLatin;
    }

    public void setNomLatin(String nomLatin) {
        this.nomLatin = nomLatin;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getProprietes() {
        return proprietes;
    }

    public void setProprietes(String proprietes) {
        this.proprietes = proprietes;
    }

    public String getPosologie() {
        return posologie;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public String getPrecautions() {
        return precautions;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }

    public String getPartieUtilises() {
        return partieUtilises;
    }

    public void setPartieUtilises(String partieUtilises) {
        this.partieUtilises = partieUtilises;
    }

    @Override
    public String toString() {
        return
                "Nom:"+ name + '\n' +
                        nomLatin + '\n' +
                        famille + '\n' +
                        type + '\n'+
                        proprietes + '\n' +
                        posologie + '\n' +
                        partieUtilises + '\n'+
                        precautions + '\n'
                ;
    }
}

