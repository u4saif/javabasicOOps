package exceptions;

public class Account {
    private  float balance;
    public void deposit(float amount){
        if(amount <=0)
            throw new IllegalArgumentException();
        System.out.println("Amount Deposited Successfully: " + amount);
    }

    public void withdraw(float value) throws AccountExceptions {
        if(value > balance)
            throw new AccountExceptions( new InsufficiantFundException());
        balance-=value;
        System.out.println("Withdrwan "+ value + "Amount left in account:  "+ balance );

    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
