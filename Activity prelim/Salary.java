import java.util.Scanner;

public class Salary {
    public static void SalaryCalculator(Scanner sc) {

        System.out.println();
        System.out.println("======================================");

        System.out.print("What is your salary $? ");
        int Salary = sc.nextInt();

        System.out.println("======================================");

        double DA = Salary * 0.12;
        int TA = 120;
        int HRA = 150;
        int Others = 450;
        double PF = Salary * 0.14;
        double IT = Salary * 0.15;

        double Tax = PF + IT;

        double FinSalary = Salary + DA + HRA + TA + Others - Tax;

        System.out.println();
        System.out.println("======================================");
        System.out.println();

        System.out.println("Your final Salary is: " + FinSalary);

        System.out.println();
        System.out.println("======================================");

    }
}

