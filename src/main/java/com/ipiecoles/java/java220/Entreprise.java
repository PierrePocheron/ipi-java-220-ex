package com.ipiecoles.java.java220;
import org.joda.time.LocalDate;

public final class Entreprise {
    public static final Double SALAIRE_BASE = 1480.27;
    public static final Integer NB_CONGES_BASE = 25;
    public static final Double INDICE_MANAGER = 1.3;
    public static final Double PRIME_MANAGER_PAR_TECHNICIEN = 250d;
    public static final Double PRIME_ANCIENNETE = 100d;

    public static Double primeAnnuelleBase()
    {
        Double PRIME = LocalDate.now().getYear()*0.5d;
        return PRIME;
    }

    public static Double getSalaireBase() {
        return SALAIRE_BASE;
    }

    public static Integer getNbCongesBase() {
        return NB_CONGES_BASE;
    }

    public static Double getIndiceManager() {
        return INDICE_MANAGER;
    }

    public static Double getPrimeManagerParTechnicien() {
        return PRIME_MANAGER_PAR_TECHNICIEN;
    }

    public static Double getPrimeAnciennete() {
        return PRIME_ANCIENNETE;
    }
}
