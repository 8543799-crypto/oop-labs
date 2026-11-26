package SecondLab.part1;

import java.util.LinkedList;
import java.util.List;

public class BankingAccount {
    private int balance;
    private List<String> historyTransaction;
    private List<String> historyBalance;

    public BankingAccount(Startup s) {
        this.balance = s.getBalance();
        this.historyTransaction = new LinkedList<>();
        this.historyBalance = new LinkedList<>();
        this.historyTransaction.add(valueToHistory(s.getBalance()));
        this.historyBalance.add(toString());
    }

    public void debit(Debit d) {
        this.balance += d.getBalance();
        this.historyTransaction.add(valueToHistory(d.getBalance()));
        this.historyBalance.add(toString());
    }

    public void credit(Credit c) {
        this.balance += c.getBalance();
        this.historyTransaction.add(valueToHistory(c.getBalance()));
        this.historyBalance.add(toString());
    }

    public int getBalance() {
        return this.balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BankingAccount) {
            return (getBalance() == ((BankingAccount) o).getBalance());
        }
        return false;
    }

    private String valueToHistory(int value) {
        int absValue = Math.abs(value);
        return ((value < 0) ? "(-" : "") + "$" + (absValue / 100) + "." + (absValue % 100 / 10) + (absValue % 100 % 10) + ((value < 0) ? ")" : "");
    }

    @Override
    public String toString() {
        int absBalance = Math.abs(this.balance);
        return ((this.balance < 0) ? "-" : "") + "$" + (absBalance / 100) + "." + (absBalance % 100 / 10) + (absBalance % 100 % 10);
    }
}
