package OOP;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Patients{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Pediatric> pediatricPatients = new ArrayList<>();
        List<Patient> AllPatients = new ArrayList<>();

        System.out.println("Enter number of patients: ");
        int numberpatient = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < numberpatient; i++) {
            Pediatric patient = new Pediatric();
            patient.PatientInfo(sc);
            AllPatients.add(patient);

            if (patient.isPediatric()) {
                pediatricPatients.add(patient);
            }   
        }

        System.out.println("=============================");
        System.out.println();

        System.out.println("All Patients");
        for (Patient patient : AllPatients) {
            patient.ShowPatientInfo();
            System.out.println();
        }

        System.out.println("=============================");
        System.out.println();

        System.out.println("=============================");
        System.out.println();

        System.out.println("Pediatric Patients");
        for (Pediatric pediatricPatient : pediatricPatients) {
            pediatricPatient.ShowPatientInfo();
            System.out.println();
            
        }
        System.out.println("=============================");

        sc.close();
    }       
}