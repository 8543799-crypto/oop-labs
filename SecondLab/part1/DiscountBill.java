package SecondLab.part1;

public class DiscountBill extends GroceryBill {
    private boolean regularCustomer;
    private int discountCount;
    private double discountAmount;

    public DiscountBill(Employee clerk, boolean regularCustomer) {
        super(clerk);
        this.regularCustomer = regularCustomer;
        this.discountCount = 0;
        this.discountAmount = 0.0;
    }

    @Override
    public void add(Item i) {
        super.add(i);
        if (regularCustomer && i.getDiscount() > 0.0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    @Override
    public double getTotal() {
        double discountedTotal = super.getTotal() - discountAmount;
        return Math.rint(discountedTotal * 100.0) / 100.0;
    }

    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountAmount() {
        return Math.rint(discountAmount * 100.0) / 100.0;
    }

    public double getDiscountPercent() {
        double fullTotal = super.getTotal();
        if (!regularCustomer || fullTotal == 0.0) {
            return 0.0;
        }
        return 100.0 - (getTotal() * 100.0) / fullTotal;
    }
}
