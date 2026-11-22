public class FirstLab {

    public static boolean sleep_in(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static boolean monkey_trouble(boolean a_smile, boolean b_smile) {
        return a_smile == b_smile;
    }

    public static int sum_double(int a, int b) {
        return (a == b) ? (a + b) * 2 : a + b;
    }

    public static int diff21(int n) {
        int d = Math.abs(21 - n);
        return (n > 21) ? d * 2 : d;
    }

    public static boolean parrot_trouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public static boolean near_hundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public static boolean pos_neg(int a, int b, boolean negative) {
        return negative ? (a < 0 && b < 0) : ((a < 0 && b > 0) || (a > 0 && b < 0));
    }

    public static void main(String[] args) {
        System.out.println(sleep_in(false, false));
        System.out.println(monkey_trouble(true, true));
        System.out.println(sum_double(2, 2));
        System.out.println(diff21(30));
        System.out.println(parrot_trouble(true, 6));
        System.out.println(makes10(9, 10));
        System.out.println(near_hundred(93));
        System.out.println(pos_neg(1, -1, false));
    }
}
