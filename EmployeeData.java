package prelim;

class Professor {
    String Name;
    double Salary;

    public Professor(String Name, double Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }

    public  String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }
}

class Dean extends Professor {
    String Department;

    public Dean(String Name, double Salary, String Department) {
        super(Name, Salary);
        this.Department = Department;
    }

    public String Info() {
        return "Dean " + getName()+", Department: " + Department + ", Salary: " + getSalary();
    }
}

class Executive extends Dean {
    public Executive(String Name, double Salary, String Department) {
    super(Name, Salary, Department);
    }

    public String Info() {
        return "Executive: " + getName() + ", Salary: " + getSalary();
    }
}