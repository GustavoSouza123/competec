public class TestMain {
    public static void main(String[] args) {
        // test constructor and toString()
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1); // toString()

        // test getters and setters
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("first name is: " + e1.getFirstName());
        System.out.println("last name is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        // test raiseSalary()
        System.out.println("raising the salary by 10 per cent");
        System.out.println("previous salary: " + e1.getSalary());
        System.out.println("current salary: " + e1.raiseSalary(10));
        System.out.println(e1);
    }
}