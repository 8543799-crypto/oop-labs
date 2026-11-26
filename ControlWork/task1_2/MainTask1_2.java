package ControlWork.task1_2;

public class MainTask1_2 {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan();
        TimeSpan t2 = new TimeSpan(135);
        TimeSpan t3 = new TimeSpan(2, 15);
        TimeSpan t4 = new TimeSpan(t3);

        t3.add(1, 45);
        System.out.println(t3);
        System.out.println(t3.getHours());
        System.out.println(t3.getMinutes());

        t2.add(30);
        System.out.println(t2);

        t1.addTimeSpan(t4);
        System.out.println(t1);
        System.out.println(t1.getTotalHours());
        System.out.println(t1.getTotalMinutes());

        t3.subtract(1, 30);
        System.out.println(t3);

        t3.subtract(45);
        System.out.println(t3);

        t3.subtract(new TimeSpan(0, 30));
        System.out.println(t3);

        TimeSpan t5 = new TimeSpan(1, 45);
        t5.scale(2);
        System.out.println(t5);
    }
}
