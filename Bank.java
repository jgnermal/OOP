package prelim;
import java.util.Scanner;

class ATM {
        private double balance;

        public ATM(double currentbalance){
                this.balance = currentbalance;
        }

        public void getbalance(double currentbalance) {
                System.out.println("Your current balance is: " + balance);
        }
        public void withdraw(double withdrawamount) {
                if (withdrawamount < balance && withdrawamount > 0){
                balance -= withdrawamount;
                System.out.println("Your new balance is: " + balance);
        } else {
                System.out.println("Invalid withdraw amount. Please try again.");
        }
}

        public void deposit(double depositamount) {
                if (depositamount > 0) {
                balance += depositamount;
                System.out.println("Your new balance is: " + balance);
        } else {
                System.out.println("Invalid deposit amount. Please try again.");
        }
}
}

public class Bank {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Welcome to Temmie's Bank!");
                System.out.print("Enter your balance: ");
                double currentbalance = sc.nextDouble();
                ATM atm = new ATM(currentbalance);

                int transfer = 0;
                
                do{    
                System.out.println("-----------------------------------");
                System.out.println("Select an option:");
                System.out.println("1. Deposit amount");
                System.out.println("2. Withdraw amount");
                System.out.println("3. exit");
                System.out.println("-----------------------------------");
                        
                        if(sc.hasNextInt()) {
                                transfer = sc.nextInt();
                            } else {
                                System.out.println("Invalid input.");
                                sc.next();
                                continue;
                            }

                        switch (transfer){
                                case 1:
                                System.out.println("How much do you want to deposit from your account?");
                                System.out.print("Amount: ");
                                double depositamount = sc.nextDouble();
                                atm.deposit(depositamount);
                                break;

                                case 2:
                                System.out.println("How much do you want to withdraw from your account?");
                                System.out.print("Amount: ");
                                double withdrawamount = sc.nextDouble();
                                atm.withdraw(withdrawamount);
                                break;

                                case 3:
                                System.out.print("Exiting...");

                                default:
                                System.out.println("Invalid input.");
                                atm.getbalance(currentbalance);
                        }
                        
                } while (transfer !=3);

                sc.close();
        }
}