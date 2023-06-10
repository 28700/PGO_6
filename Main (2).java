import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


abstract class Person{
    String firstName, lastName;
    int birthdayYear;

    Person(String fn, String ln, int by){
        firstName = fn;
        lastName = ln;
        birthdayYear = by;
    }

    int getAge(){
        int year = Year.now().getValue();
        return year - birthdayYear;
    }
}

class Employee extends Person{
    int hireDate;

    double salary;
    String companyName;


    Employee(String fn, String ln, int by, int hd, String cn, double sal) {
        super(fn, ln, by);
        salary = sal;
        companyName = cn;
        hireDate = hd;
    }

    int getJobSeniority() {
        int year = Year.now().getValue();
        return year - hireDate;
    }

    double getSalary() {
        return salary;
    }

}

class Manager extends Employee {

    double bonus;
    Manager(String fn, String ln, int by, int hd, String cn, double sal, double bns) {
        super(fn, ln, by, hd, cn, sal);
        bonus = bns;
    }

    @Override
    double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager with last name" + lastName + "and age " + getAge() + " has salary " + getSalary() ;
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Jan", "Kowalski", 1990, 2010, "PJATK", 2000d,
                100d); System.out.println(manager);
    } }