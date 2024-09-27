package prelim;

public class Employee {
    public static void main(String[] args) {
        Professor Prof = new Professor("Cymon", 50000);
        Dean dean = new Dean("J", 70000, "Computer Science");
        Executive Exec = new Executive("Kyle", 90000, "Executive");

        System.out.println("Professor Name: " + Prof.getName() + ", Salary: " + Prof.getSalary());
        System.out.println(dean.Info());
        System.out.println(Exec.Info());
    }
}