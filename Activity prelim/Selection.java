import java.util.Scanner;

public class Selection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("======================================");
            System.out.println("Which function do you wish to use?");
            System.out.println("======================================");
            
            System.out.println();
            System.out.println("1. Number Analysis");
            System.out.println("2. Sorting");
            System.out.println("3. Delete Element");
            System.out.println("4. Even & Odd");
            System.out.println("5. Stairs");
            System.out.println("6. Salary calculator");
            System.out.println("7. Exit");

            System.out.println();
            System.out.println("======================================");
            
            if(sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1: 
                    System.out.println("======================================");
                    System.out.println();
                    System.out.println("You selected 1. Number analysis.");
                    NumberAnalysis.Analyze(sc);
                    break;

                case 2:
                    System.out.println("======================================");
                    System.out.println();
                    System.out.println("You selected 2. Sorting.");
                    Sorting.SortArrays(sc);
                    break;

                case 3:
                    System.out.println("======================================");
                    System.out.println();
                    System.out.println("You selected 3. Delete Element.");
                    DeleteElement.Delete(sc);
                    break;

                case 4:
                    System.out.println("======================================");
                    System.out.println();
                    System.out.println("You selected 4. Even & Odd.");
                    EvenOdd.GetEvenAndOdd(sc);
                    break;

                case 5:
                    System.out.println("======================================");
                    System.out.println();
                    System.out.println("You selected 5. Stairs.");
                    Stairs.CreateStairs(sc);
                    break;

                case 6:
                    System.out.println("======================================");
                    System.out.println();
                    System.out.println("You selected 6. Salary Calculator.");
                    Salary.SalaryCalculator(sc);
                    break;

                default:
                    System.out.println("======================================");
                    System.out.println();
                    System.out.println("Wrong choice. Please try again.");
            }
            System.out.println();
           
        } while (choice != 7);
        sc.close();
    }  
}
