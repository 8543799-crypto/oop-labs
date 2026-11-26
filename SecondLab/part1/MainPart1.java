package SecondLab.part1;

public class MainPart1 {
    public static void main(String[] args) {
        Employee clerk = new Employee("Olena");
        DiscountBill bill = new DiscountBill(clerk, true);
        bill.add(new Item("Milk", 40.0, 5.0));
        bill.add(new Item("Bread", 25.0, 0.0));
        bill.add(new Item("Cheese", 100.0, 15.0));

        System.out.println("Total: " + bill.getTotal());
        System.out.println("Discount count: " + bill.getDiscountCount());
        System.out.println("Discount amount: " + bill.getDiscountAmount());
        System.out.println("Discount percent: " + bill.getDiscountPercent());

        MinMaxAccount acc = new MinMaxAccount(new Startup(5000));
        acc.debit(new Debit(2000));
        acc.credit(new Credit(-4500));
        acc.debit(new Debit(1000));

        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Min: " + acc.getMin());
        System.out.println("Max: " + acc.getMax());
    }
}
