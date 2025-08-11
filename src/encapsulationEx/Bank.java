package encapsulationEx;

public class Bank {
//    private int balance;
//
//    public void setBalance(int balance){
//        this . balance = balance;
//    }
//    public int getBalance(){
//        return balance;
//    }
//    public void deposit(int amount){
//        balance+=amount;
//    }
//    public void withdraw(int amount){
//        if (amount<balance){
//            balance-=amount;
//        }else{
//            System.out.println("Insufficient Balance");
//        }
//    }

    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        if (amount<balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }


}

