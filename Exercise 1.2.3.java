import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

class Main {
    /*
        Exercise 1.2.3
     */
    static Scanner scanner = new Scanner(new BufferedInputStream(System.in));

    public static void main(String[] args) {
        question4();
    }


    ///Using Java, read in a double
    //(e.g. 1.4732, 15.324547327, etc.)
    //echo it, but with a minimum field width of 7 and 3 digits after the decimal point
    //(e.g. ss1.473 (where ‘s’ denotes a space), s15.325, etc.)
    static void question1()
    {
        Double aDouble = scanner.nextDouble();
        System.out.format("%7.3f",aDouble);
    }

    // Given an integer n (n ≤ 15), print π to n digits after the decimal point (rounded).
    //(e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, prints 3.14159.)
    static void question2()
    {
        int n = 7;
        System.out.format("%."+n+"f", Math.PI);
    }

    //Given a date, determine the day of the week (Monday, . . . , Sunday) on that day.
    //(e.g. 9 August 2010—the launch date of the first edition of this book—is a Monday.)
    static void question3()
    {
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 28);
        System.out.println(date.getDayOfWeek());
    }

    //Given n random integers, print the distinct (unique) integers in sorted order.
    static void question4()
    {
        Integer a[] = {99,1, 2, 3, 4, 5, 6, 1 , 2, 4, 8};
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, a);

        for (Integer i: sortedSet)
            System.out.println(i);
    }



}
