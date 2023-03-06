import java.lang.*;
import java.util.Scanner;
public class Lab3Point2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        String variable = scanner.nextLine();

        double katet1 = Double.parseDouble(variable);

        variable = scanner.nextLine();

        double katet2 = Double.parseDouble(variable);

        double gipot = Math.hypot(katet1,katet2);

        double s1 = Math.asin (katet1/gipot);

        double s2 = Math.asin (katet2/gipot);

        System.out.println(Math.toDegrees (s1) );
        System.out.println(Math.toDegrees (s2) );

    }
}
