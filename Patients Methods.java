package prelim;

import java.util.Scanner;
class Date{
	int year;
	int month;
	int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
        this.day = day;
	}

	public String DateFormat() {
		return year + "-" + month + "-" + day;
	}
}

class Patient {
    String name;
    Date admissiondate;
    String disease;
    Date dischargedate;

    public void PatientInfo(Scanner sc) {
        System.out.println("Patient Name: ");
        name = sc.nextLine();

        System.out.println("Date of addmision: (Year/Month/Day) ");
        admissiondate = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.nextLine();

        System.out.println("Disease: ");
        disease = sc.nextLine();

        System.out.println("Date of Discharge (Year/Month/Day) ");
        dischargedate = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.nextLine();
    }   
        public void ShowPatientInfo() {
        System.out.println("Patient: " + name);
        System.out.println("Admission Date: " + admissiondate.DateFormat());
        System.out.println("Disease: " + disease);
        System.out.println("Discharge Date: " + dischargedate.DateFormat());
    }
}

class Pediatric extends Patient {
    int age;

    public void PatientInfo(Scanner sc) {
        super.PatientInfo(sc);
        
        System.out.println("Enter patient's age: ");
        age = sc.nextInt();
        sc.nextLine();
    }
    
    public void ShowPatientInfo() {
        super.ShowPatientInfo();
        System.out.println("Age: " + age);
    }
    
    public boolean isPediatric() {
        return age < 12;
    }
}