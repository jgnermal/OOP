    import java.util.Scanner;

    public class NumberAnalysis {
        public static void Analyze(Scanner sc) {

            System.out.println();
            System.out.println("======================================");

            int[] numbers = new int[10];

            System.out.println("Enter 10 2-digits number:");

            for (int i=0;i<10;i++) {
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
            
            int positiveSum = 0;
            int positiveCount = 0;
            int negativeCount = 0;
            int minValue = numbers[0];

            for (int num : numbers) {
                if (num > 0) {
                    positiveSum += num;
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                }

            if (num < minValue) {
                minValue = num;
            }
        }
            
            int positiveAverage;
            if (positiveCount > 0) {
              positiveAverage = positiveSum / positiveCount;
            } else {
                positiveAverage = 0;
            }
            System.out.println();
            System.out.println("======================================");
            System.out.println();

            System.out.println("Sum of positive numbers: " + positiveSum);
            System.out.println("Average of positive numbers: " + positiveAverage);
            System.out.println("There are " + negativeCount + " negatives numbers.");
            System.out.println("Minimum value in the array: " + minValue);
    
            System.out.println();
            System.out.println("======================================");
    }
}