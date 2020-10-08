package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Commercial extends Employe{

    //region Attributs
    private Double caAnnuel = 0d;
    private Integer performance = 10;
    //endregion

    //region Constructeur
    public Commercial(){}

    public Commercial(String nom,String prenom,String matricule, LocalDate dateEmbauche,Double salaire, Double caAnnuel){
        super(nom,prenom,matricule,dateEmbauche,salaire);
        this.caAnnuel = caAnnuel;

    }

    public Commercial(String nom,String prenom,String matricule, LocalDate dateEmbauche,Double salaire, Double caAnnuel, Integer performance){
        super(nom,prenom,matricule,dateEmbauche,salaire);
        this.caAnnuel = caAnnuel;
        this.performance = performance;

    }
    //endregion

    //region Getters Setters
    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        performance = performance;
    }
    //endregion




    //region Méthodes
    public Double getPrimeAnnuelle(){
        Double leCaAnnuelle = caAnnuel*0.05;
        if (leCaAnnuelle < 500d ){leCaAnnuelle = 500d;}
        return leCaAnnuelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Commercial that = (Commercial) o;

        return Objects.equals(caAnnuel, that.caAnnuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caAnnuel);
    }

    public boolean performanceEgale(Integer unePerformance)
    {
        return getPerformance().equals(unePerformance);
    }
    //endregion
















}
