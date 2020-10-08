package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Technicien extends Employe{

    //region Attributs
    private Integer garde;
    //endregion



    //region Constructeurs
    public Technicien(){}

    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer garde)
    {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.garde = garde;
    }
    //endregion


    //region Getters and Setters
    public Integer getGarde() {
        return garde;
    }

    public void setGarde(Integer garde) {
        this.garde = garde;
    }
    //endregion
}
