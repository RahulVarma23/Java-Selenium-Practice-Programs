package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {

    int id ;
    String name;
    String country;
    int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public Employee(int id, String name, String country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Rahul", "IND", 30 );
        Employee e2 = new Employee(15, "Rohit", "US", 28 );
        Employee e3 = new Employee(15, "Ankita", "UAE", 29 );

        List<Employee> list = Arrays.asList(e1,e2,e3);

        System.out.println("---sorting based on age-----");
        list.stream().sorted(Comparator.comparingInt(Employee::getAge))
                .forEach(e-> System.out.println(e.getId()+"->"+e.getAge()+"->"+e.getName()+"->"+e.getCountry()));

        System.out.println("---sorting based on name-----");
        list.stream().sorted(Comparator.comparing(Employee::getName))
                .forEach(e-> System.out.println(e.getId()+"->"+e.getAge()+"->"+e.getName()+"->"+e.getCountry()));
    }
}
