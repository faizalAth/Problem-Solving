import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Employee> empList = List.of(new Employee(1,"Faizal","Basu"),
                                         new Employee(2,"Farman","Chhapi"),
                                         new Employee(3,"Sajjad","Meta"),
                                         new Employee(4,"Irshad","Changa"),
                                         new Employee(5,"Saad","Kanodar"));

        empList=empList.stream().filter(data -> data.getId()>2).collect(Collectors.toList());
        List<String> name_list= empList.stream().map(Employee::getName).collect(Collectors.toList());
        name_list.forEach(System.out::println);
        empList.forEach(data-> System.out.println(data));
    }
}