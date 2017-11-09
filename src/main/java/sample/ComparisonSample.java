package main.java.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by aziring on 10/5/17.
 */
public class ComparisonSample {

  public static class Employee {
    public String firstName;
    public String lastName;
    public Integer age;

    public Employee(String firstName, String lastName, Integer age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.firstName).append(" ")
          .append(this.lastName).append(" ")
          .append(age);

      return sb.toString();

    }
  }

  private static List<Employee> createEmployees() {
    List<Employee> empList = new ArrayList<>();

    Employee e1 = new Employee("mickey", "mouse", 45);
    Employee e2 = new Employee("jack", "sparrow", 33);
    Employee e3 = new Employee("tinker", "bell", 46);

    empList.add(e1);
    empList.add(e2);
    empList.add(e3);
    return empList;
  }

  private static List<Employee> sortList(List<Employee> empList) {
    Comparator<Employee> sortByAge = new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
      }
    };

    List<Employee> newList = new ArrayList<>(empList);
    Collections.sort(newList, sortByAge);

    return newList;
  }

  private static List<Employee> sortListStream(List<Employee> empList) {
    Comparator<Employee> sortByAge = new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
      }
    };

    List<Employee> newList = empList.stream()
        .sorted(sortByAge)
        .collect(Collectors.toList());

    return newList;
  }

  private static List<Employee> sortListStreamAndLambda(List<Employee> empList) {
    Comparator<Employee> sortByAge = new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
      }
    };

    List<Employee> newList = empList.stream()
        .sorted((e1, e2) -> Integer.compare(e1.age, e2.age))
        .collect(Collectors.toList());

    return newList;
  }

  public static void main(String a[]) {
    List<Employee> sortedList = null;
    List<Employee> empList = createEmployees();

    System.out.println("Sorting old school");
    sortedList = sortList(empList);

    for (Employee e : sortedList) {
      System.out.println(e.toString());
    }

    System.out.println();
    System.out.println("Sorting semi-new school");
    sortedList = sortListStream(empList);

    for (Employee e : sortedList) {
      System.out.println(e.toString());
    }

    System.out.println();
    System.out.println("Sorting new school - lambda and stream");
    sortedList = sortListStreamAndLambda(empList);

    for (Employee e : sortedList) {
      System.out.println(e.toString());
    }
  }

}
