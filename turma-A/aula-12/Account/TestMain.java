public class TestMain {
    public static void main(String[] args) {
        // test constructor and toString()
        Account a1 = new Account("A101", "Gustavo Souza", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "John Doe");
        System.out.println(a2);

        // test getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println(("Balance: " + a1.getBalance()));

        // test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(54);
        System.out.println(a1);
        a1.debit(500); // debit() error
        System.out.println(a1);

        // test transfer()
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}