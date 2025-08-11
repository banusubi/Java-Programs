package encapsulationEx;

public class Account {
//    public static void main(String[] args) {
//        Bank b = new Bank();
//        b.setBalance(5000);
//        System.out.println("Bank Balance is "+b.getBalance());
//        b.deposit(2000);
//        System.out.println(b.getBalance());
//        b.withdraw(10000);
//        System.out.println(b.getBalance());
//    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(5000);
        System.out.println(b.getBalance());
        b.deposit(2000);
        System.out.println(b.getBalance());
        b.withdraw(4000);
        System.out.println(b.getBalance());
    }
}
