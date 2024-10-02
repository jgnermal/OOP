import java.util.Scanner;

public class Stairs {
    public static void CreateStairs(Scanner sc) {

        System.out.println();
        System.out.println("======================================");
        System.out.println();

        System.out.print("How big do you want the Stairs? ");
        int size = sc.nextInt();

        System.out.println("======================================");

        System.out.println("*");
        
        for (int i = 1; i < size; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*A*");
            }
            System.out.println(); 
        }
            System.out.println("======================================");
    }
}
