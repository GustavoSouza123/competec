public class Employee {
    // attributes
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // getters
    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    // salary methods
    public double getAnnualSalary() {
        return this.salary * 12;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    // to string method
    @Override
    public String toString() {
        return "Employee[id=?,name="+this.getName()+",salary=?]";
    }
}