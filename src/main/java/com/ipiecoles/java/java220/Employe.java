package com.ipiecoles.java.java220;
import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * Created by PierrePocheron on 08/10/2020.
 */
public  class Employe {

    //region Attributs
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;
    //endregion


    //region Constructeurs
    public Employe(){}

    public Employe(String nom,String prenom,String matricule,LocalDate dateEmbauche,Double salaire)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }
    //endregion

    //region Getter - Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) throws Exception{
        if(dateEmbauche != null && dateEmbauche.isAfter(LocalDate.now())){
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
        }

        this.dateEmbauche = dateEmbauche;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
    //endregion


    //region Méthodes

//    public final Integer getNombreAnneeAnciennete()
//    {
//        int nbAnneeAnciennete = 0;
//
//        if (dateEmbauche.getYear() == LocalDate.now().getYear()){ }
//        else
//        {
//            int anneeAnciennete = dateEmbauche.getYear();
//            int anneeEnCours = LocalDate.now().getYear();
//
//            nbAnneeAnciennete = anneeAnciennete - anneeEnCours;
//        }
//        return nbAnneeAnciennete;
//    }



    public Integer getNbConges()
    {
        return Entreprise.getNbCongesBase();
    }

    public final Integer getNombreAnneeAnciennete() {
        return LocalDate.now().getYear() - dateEmbauche.getYear();
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(nom, employe.nom) &&
                Objects.equals(prenom, employe.prenom) &&
                Objects.equals(matricule, employe.matricule) &&
                Objects.equals(dateEmbauche, employe.dateEmbauche) &&
                Objects.equals(salaire, employe.salaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
    }

    public void augmenterSalaire(Double pourcentage){
        this.salaire = this.getSalaire() * (1 + pourcentage);
    }


    public Double getPrimeAnnuelle(){
        return Entreprise.primeAnnuelleBase();
    }

    //endregion







}





