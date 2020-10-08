package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.HashSet;

public class Manager extends Employe{

    //region Attributs
    private HashSet<Technicien> equipe = new HashSet();
    //endregion


    //region Constructeur
    public Manager() {
    }

    public Manager(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, HashSet equipe) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.equipe = equipe;
    }
    //endregion

    //region Getters and Setters
    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }
    //endregion




    //region Méthodes
    public void ajoutTechnicienEquipe(Technicien technicien)
    {
        equipe.add(technicien);
    }

    @Override
    public void setSalaire(Double salaire)
    {
        super.setSalaire(salaire * Entreprise.INDICE_MANAGER + (salaire * (double)equipe.size() / 10));
    }

    @Override
    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase() + (Entreprise.PRIME_MANAGER_PAR_TECHNICIEN * equipe.size());
    }


    public void augmenterSalaireEquipe(Double pourcentageAugmentation)
    {
        for (Technicien technicien : equipe)
        {
            technicien.augmenterSalaire(pourcentageAugmentation);
        }
    }

    @Override
    public void augmenterSalaire(Double pourcentage){
        super.augmenterSalaire(pourcentage);
        augmenterSalaireEquipe(pourcentage);

    }

    //endregion

}
