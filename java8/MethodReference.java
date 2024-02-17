package java8;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {

        int x=(5/(3*3)+(5%3));
        System.out.println(x + "   ****************\t\t\t\t\t********");
        System.out.println(reverse("Faizal"));
        System.out.println("----------ttttttttttt----------");
        List<String> friends = List.of("Faizal","Farman","saad","Irshad","Sajjad");

        friends.stream().forEach(new MethodReference()::print);
        System.out.println("----------employees----------");
        List<Employee> employees = friends.stream().map(Employee::new).sorted().collect(Collectors.toList());

        employees.forEach(Employee::print);
    }

    public void print(String name){
        System.out.println(name);
    }

    public static String reverse(String name){

        char[] charArray=name.toCharArray();
        int start=0,
            end=name.length()-1;

        while(start < end){
            char temp=charArray[end];
            charArray[end]=charArray[start];
            charArray[start]=temp;

            start++;
            end--;
        }

        return String.valueOf(charArray);
    }
}

class Employee implements Comparable<Employee>{
    String emp_name;

    public Employee(String emp_name){
        this.emp_name=emp_name;
    }

    public static void print(Employee employee){
        System.out.println(employee.emp_name);
    }

    @Override
    public int compareTo(Employee o) {
        return this.emp_name.length() - o.emp_name.length();
    }
}