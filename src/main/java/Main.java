import com.ipiecoles.java.java220.Commercial;
import com.ipiecoles.java.java220.Employe;
import com.ipiecoles.java.java220.Technicien;
import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Employe emp1 = new Employe("Joe", "Simpson","M12345", LocalDate.now(),500d);
        Employe emp2 = new Employe("Joe", "Simpson","M12345", LocalDate.now(),500d);

        Commercial com1 = new Commercial("Joe", "Simpson","M12345", LocalDate.now(),500d, 500000d, 5);
        Commercial com2 = new Commercial("Joe", "Simpson","M12345", LocalDate.now(),500d, 500000d, 8);

        Technicien tec1 = new Technicien("Joe", "Simpson","M12345", LocalDate.now(),500d,  3);
        Technicien tec2 = new Technicien("Joe", "Simpson","M12345", LocalDate.now(),500d,  5);

        System.out.println("-------------------------------");

        System.out.println(emp1.toString());
        System.out.println(emp1.equals(emp2));
        System.out.println("-------------------------------");

        System.out.println(emp1.hashCode());
        System.out.println("-------------------------------");

        System.out.println("La prime annuelle de l'employé est : " + emp1.getPrimeAnnuelle());
        System.out.println("-------------------------------");


        System.out.println("La salaire annuelle de l'entreprise de l'employé est : " + emp1.getPrimeAnnuelle());

        System.out.println("-------------------------------");
        System.out.println("test methode Commercial.performanceEgale : " + com1.performanceEgale(10));


        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(emp1);
        employes.add(emp2);
        employes.add(com1);
        employes.add(com2);
        employes.add(tec1);
        employes.add(tec2);

        for(Employe e : employes)
        {
            System.out.println("Prime : " + e.getSalaire());
        }
    }


}
