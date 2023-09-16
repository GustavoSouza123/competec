public class Account {
    // attributes
    private String id;
    private String name;
    private int balance = 0;
    
    // constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    // methods
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account anotherAccount, int amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            anotherAccount.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    // to string method
    public String toString() {
        return "Account[id="+this.id+",name="+this.name+",balance="+this.balance+"]";
    }
}