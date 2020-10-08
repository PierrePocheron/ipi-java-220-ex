package com.ipiecoles.java.java220;
import java.util.Objects;
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




    //region Méthodes
    public void setSalaire(Double salaire) {
        super.setSalaire( salaire * (1 + garde / 10));
    }


    public Integer getNbConges()
    {
        return super.getNbConges() + super.getNombreAnneeAnciennete();
    }

    public Double getPrimeAnnuelle(){
        Double primeAnnuelleBase = Entreprise.primeAnnuelleBase();
        return primeAnnuelleBase + primeAnnuelleBase *((double) garde / 10) + (Entreprise.PRIME_ANCIENNETE * this.getNombreAnneeAnciennete());
    }
    //endregion



}
