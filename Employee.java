class Employee {
    int empno;
    String name;
    float sal;

    Employee() {
        System.out.println("#####");
        empno = 303;
        name = "Rain";
        sal = 7500f;
    }

    void displayDetails() {
        System.out.println(empno + " | " + name + " | " + sal);
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
