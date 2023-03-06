import java.lang.*;
import java.util.Scanner;
public class Lab3Point1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        String variable = scanner.nextLine();

        int count = Integer.parseInt(variable);

        for ( int i = 0; i < count; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
            case 'a': case 'e': case 'i':
            case 'o': case 'u':
            System.out.println("glasnaia");
            break;
            case 'y': case 'w':
            System.out.println("inogda glasnaia");
            break;
            default:
            System.out.println("soglasnaia");
            }
            }
           
    }
}
