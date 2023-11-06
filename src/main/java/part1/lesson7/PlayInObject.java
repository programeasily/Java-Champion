package part1.lesson7;

public class PlayInObject {

    public static void main(String[] args) {
        new PlayInObject().method1();
    }

    void method1() {

        Address employeeAddress = new Address("chennai", "TN");
        Address employerAddress = new Address("mumbai", "MH");
        Employer employer = new Employer("xxxx", 100, employerAddress);

        Employee employee1 = new Employee("prince", 29, employeeAddress, employer);
        int number = 10;

        method2(employee1, number);

        System.out.println(employee1.name);
        System.out.println(number);
    }

    void method2(Employee employee, int number) {

        System.out.println(employee.name);
        System.out.println(number);

        employee.name = "ram";
        number = 20;

        System.out.println(employee.name);
        System.out.println(number);

    }
}
