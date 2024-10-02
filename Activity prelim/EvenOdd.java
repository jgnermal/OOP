import java.util.Scanner;

public class EvenOdd {
    public static void GetEvenAndOdd(Scanner sc) {

        System.out.println();
        System.out.println("======================================");

        System.out.print("Enter how many numbers you will place: ");
        int amount = sc.nextInt();

        int[] numbers = new int[amount];
        int[] even = new int[amount];
        int[] odd = new int[amount];
        int evenCount = 0; int oddCount = 0;

        System.out.println("Enter " + amount + " numbers:");
        for (int i = 0; i < amount; i++) {
            numbers[i] = sc.nextInt();
        }

            System.out.println("======================================");
        for (int num : numbers) {
            if (num % 2 == 0) {
                even[evenCount] = num;
                evenCount++;
            } else {
                odd[oddCount] = num;
                oddCount++;
            }
        }
        
            System.out.println();
            System.out.println("======================================");
            System.out.println();

            System.out.print("Odd elements: ");
            for (int i=0; i < oddCount; i++){
                System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.print("Even elements: ");
            for (int i=0; i < evenCount; i++){
                System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("======================================");
    }
}