package SecondLab.part2;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainPart2 {

    public static Student[] filterStudents(Student[] input, Predicate<Student> p) {
        Student[] result = new Student[input.length];
        int counter = 0;
        for (Student s : input) {
            if (p.test(s)) {
                result[counter++] = s;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }

    public static int[] filterTwoConditions(int[] input, Predicate<Integer> p1, Predicate<Integer> p2) {
        int[] result = new int[input.length];
        int counter = 0;
        for (int i : input) {
            if (p1.test(i) && p2.test(i)) {
                result[counter++] = i;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void forEachStudent(Student[] input, Consumer<Student> action) {
        for (Student s : input) {
            action.accept(s);
        }
    }

    public static void processIf(int[] input, Predicate<Integer> p, Consumer<Integer> action) {
        for (int i : input) {
            if (p.test(i)) {
                action.accept(i);
            }
        }
    }

    public static int[] processArray(int[] input, Function<Integer, Integer> function) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = function.apply(input[i]);
        }
        return result;
    }

    public static String[] stringify(int[] input, Function<Integer, String> function) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = function.apply(input[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        // Task 1: Prime number
        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println("7 is prime: " + isPrime.test(7));
        System.out.println("9 is prime: " + isPrime.test(9));

        // Task 2: Filter students without debts (marks >= 60)
        Student[] students = {
            new Student("Ivan", "Kovalenko", "KN-21", new int[]{85, 90, 78}),
            new Student("Olena", "Bondarenko", "KN-21", new int[]{95, 55, 80}),
            new Student("Andrii", "Shevchenko", "KN-22", new int[]{60, 72, 65})
        };

        Predicate<Student> noDebts = s -> {
            for (int mark : s.getMarks()) {
                if (mark < 60) return false;
            }
            return true;
        };
        System.out.println("Without debts: " + Arrays.toString(filterStudents(students, noDebts)));

        // Task 3: Filter by two conditions
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15};
        int[] filtered = filterTwoConditions(nums, n -> n % 2 == 0, n -> n % 3 == 0);
        System.out.println("Divisible by 2 and 3: " + Arrays.toString(filtered));

        // Task 4: Consumer LASTNAME + FIRSTNAME
        Consumer<Student> printName = s -> System.out.println(s.getLastName().toUpperCase() + " " + s.getName().toUpperCase());
        forEachStudent(students, printName);

        // Task 5: Predicate + Consumer
        processIf(nums, n -> n > 8, n -> System.out.println("Number > 8: " + n));

        // Task 6: Function 2^n
        int[] tenNums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Function<Integer, Integer> pow2 = n -> (int) Math.pow(2, n);
        System.out.println("Powers
