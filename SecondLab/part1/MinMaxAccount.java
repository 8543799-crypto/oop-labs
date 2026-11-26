package SecondLab.part1;

public class MinMaxAccount extends BankingAccount {
    private int minBalance;
    private int maxBalance;

    public MinMaxAccount(Startup s) {
        super(s);
        this.minBalance = s.getBalance();
        this.maxBalance = s.getBalance();
    }

    @Override
    public void debit(Debit d) {
        super.debit(d);
        updateMinMax();
    }

    @Override
    public void credit(Credit c) {
        super.credit(c);
        updateMinMax();
    }

    private void updateMinMax() {
        int current = getBalance();
        if (current < minBalance) {
            minBalance = current;
        }
        if (current > maxBalance) {
            maxBalance = current;
        }
    }

    public int getMin() {
        return minBalance;
    }

    public int getMax() {
        return maxBalance;
    }
}
