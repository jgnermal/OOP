import java.util.Scanner;

public class DeleteElement {
    public static void Delete(Scanner sc) {

        System.out.println();
        System.out.println("======================================");
        
        System.out.print("Enter Data Length:");
        int length = sc.nextInt();
        int[] data = new int[length];

        System.out.println("Enter " + length + " elements:"); 
        for (int i = 0; i < length; i++) {
            data[i] = sc.nextInt();
        }

        System.out.print("Stored Data:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("======================================");

        System.out.print("Enter position of element to delete 1-" + length +" (left to right):");
        int position = sc.nextInt();

        System.out.println("======================================");

        if (position > 0 && position <= length){
            for (int i = position; i < length; i++)
            data[i-1] = data[i];
        }
            length--;

            System.out.println();
    
            
            System.out.print("Updated Data: ");
            for (int i = 0; i < length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("======================================");
    }
}