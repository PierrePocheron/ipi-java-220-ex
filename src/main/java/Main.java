import com.ipiecoles.java.java220.Commercial;
import com.ipiecoles.java.java220.Employe;
import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Employe emp1 = new Employe("Joe", "Simpson","M12345", LocalDate.now(),500d);
        Employe emp2 = new Employe("Joe", "Simpson","M12345", LocalDate.now(),500d);

        Commercial com1 = new Commercial("Joe", "Simpson","M12345", LocalDate.now(),500d, 50000d, 10);
        Commercial com2 = new Commercial("Joe", "Simpson","M12345", LocalDate.now(),500d, 50000d, 10);

        System.out.println("-------------------------------");

        System.out.println(emp1.toString());
        System.out.println(emp1.equals(emp2));
        System.out.println("-------------------------------");

        System.out.println(emp1.hashCode());
        System.out.println("Le salaire augmenter de l'employé est : " +emp1.augmenterSalaire(1.5));
        System.out.println("-------------------------------");

        System.out.println("La prime annuelle de l'employé est : " + emp1.getPrimeAnnuelle());
        System.out.println("-------------------------------");


        System.out.println("La salaire annuelle de l'entreprise de l'employé est : " + emp1.getPrimeAnnuelle());

        System.out.println("-------------------------------");
        System.out.println("test methode Commercial.performanceEgale : " + com1.performanceEgale(10));



    }


}
