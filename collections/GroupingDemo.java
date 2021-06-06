import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<Engineer> list = new ArrayList<>();
        list.add(new Engineer("Ahmed", "GetYourGuide"));
        list.add(new Engineer("Tantawy", "GetYourGuide"));
        list.add(new Engineer("Samir", "GetYourGuide"));
        list.add(new Engineer("Shaban", "Amazon"));
        list.add(new Engineer("Amr", "Amazon"));
        list.add(new Engineer("Ali", "Google"));

        Map<String, List<Engineer>> employeeMap = list.stream()
            .collect(Collectors.groupingBy(Engineer::getCompany));

        System.out.println(employeeMap);
    }
}

class Engineer {
    private String name;
    private String company;

    public Engineer(String n, String c) {
        name = n;
        company = c;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
