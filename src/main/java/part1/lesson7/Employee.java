package part1.lesson7;

public class Employee {

    String name;
    int age;

    Address address;
    Employer employer;

    Employee(String name, int age, Address address, Employer employer) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employer = employer;
    }

}
