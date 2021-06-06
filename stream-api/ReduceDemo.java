import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ReduceDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList();
        employees.add(new Employee(2000));
        employees.add(new Employee(3000));
        employees.add(new Employee(2500));
        employees.add(new Employee(2500));

        Optional<Integer> total = employees.stream()
            .map(e -> e.getSalary())
            .reduce((p, q) -> p + q);

        System.out.println("Total Salaries: " + total.get());
    }
}

class Employee {
    private Integer salary;

    public Employee(Integer s) {
        salary = s;
    }

    public Integer getSalary() {
        return salary;
    }
}