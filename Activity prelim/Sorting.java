import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void SortArrays(Scanner sc) {

        int[] numbers = new int[8];

        System.out.println();
        System.out.println("======================================");
        System.out.println();

        System.out.println("Enter 8, 1 or 2-digits number:");

        for (int i=0;i<8;i++) {
            while (true) {
                int input = sc.nextInt();
                if (input >= -99 && input <= 99) {
                    numbers[i] = input;
                    break;
                } else {
                    System.out.println("Please enter a valid number:");
                }
            }
        }
        
        int[] Special = new int[8];
        int SpecialCount = 0;


        for (int i = 0; i < 8; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < SpecialCount; j++) {
                if (numbers[i] == Special[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                Special[SpecialCount] = numbers[i];
                SpecialCount++;
            }
        }

        if (SpecialCount < 2) {
            System.out.println("Not enough unique numbers.");
            sc.close();
            return;
        }

        Arrays.sort(Special, 0, SpecialCount);

        int secondSmallest = Special[1];
        int secondLargest = Special[SpecialCount-2];

        System.out.println();

        for (int num : Special) {
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        
        System.out.println("Second Smallest element: " + secondSmallest);
        System.out.println("Second Smallest element: " + secondLargest);

        System.out.println();
        System.out.println("======================================");
    }
}