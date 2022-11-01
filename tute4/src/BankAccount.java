public class BankAccount implements Comparable<BankAccount> {
    private int accNo;
    private String accName;
    private double balance;

    public BankAccount(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return balance;
    }

    /**
     Compares two bank accounts.
     @param other the other BankAccount
     @return 1 if this bank account has a greater balance than the other one,
     -1 if this bank account is has a smaller balance than the other one,
     and 0 if both bank accounts have the same balance
     */
    public int compareTo(BankAccount other)
    {
        if (this.getBalance() == other.getBalance()) {
            return 0;
        }
        else if (this.getBalance() > other.getBalance()) {
            return 1;
        }
        else  {
            return -1;
        }
    }
}
