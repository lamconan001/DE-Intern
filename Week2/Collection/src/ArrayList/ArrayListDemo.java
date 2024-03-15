package ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        System.out.println("All employees that is more than 50: ");
        for (Employee employee : list) {
            if (employee.getAge() > 50) {
                System.out.println(employee.getName());
            }
        }

        System.out.println("Sort all employee by age: ");
        Collections.sort(list, new AgeComparator());
        for (Employee employee : list) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getCountry());
        }

        System.out.println("Sort all employee by country: ");
        Collections.sort(list, new CountryComparator());
        for (Employee employee : list) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getCountry());
        }

        System.out.println("Remove all employee in USA");
        list = list.stream()
                .filter(employee -> !employee.getCountry().equals("USA"))
                .collect(Collectors.toList());
        for (Employee employee : list) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getCountry());
        }



    }
}

