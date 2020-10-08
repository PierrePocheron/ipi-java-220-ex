import com.ipiecoles.java.java220.Employe;
import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Employe emp1 = new Employe("Joe", "Simpson","M12345", LocalDate.now(),500d);
        Employe emp2 = new Employe("Joe", "Simpson","M12345", LocalDate.now(),500d);

        System.out.println(emp1.toString());
        System.out.println(emp1.equals(emp2));

        System.out.println(emp1.hashCode());
        System.out.println(emp1.augmenterSalaire(1.5));

    }


}
