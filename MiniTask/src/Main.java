import java.util.ArrayList;
import java.util.List;

class Company {
    private List employees = new ArrayList<>();
    // 1. Making very constant List which cant me modified even inside class
//    private final List<String> employees = List.of("Alice", "Bob");

    public Company() {
        employees.add("Alice");
        employees.add("Bob");
    }

    public List getEmployees() {
//        return employees;

        // 2. Making unmodifiable copy of list then return
//        return Collections.unmodifiableList(employees);

        // 3. Making just the copy of our list
        return new ArrayList<>(employees);
    }
}

void main()
{
    Company google = new Company();
    List list = google.getEmployees();
    list.add("Hacker");
    System.out.println(google.getEmployees().size());
}
