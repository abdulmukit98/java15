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
        question7();
    }


    ///1. Using Java, read in a double
    //(e.g. 1.4732, 15.324547327, etc.)
    //echo it, but with a minimum field width of 7 and 3 digits after the decimal point
    //(e.g. ss1.473 (where ‘s’ denotes a space), s15.325, etc.)
    static void question1()
    {
        Double aDouble = scanner.nextDouble();
        System.out.format("%7.3f",aDouble);
    }

    //2. Given an integer n (n ≤ 15), print π to n digits after the decimal point (rounded).
    //(e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, prints 3.14159.)
    static void question2()
    {
        int n = 7;
        System.out.format("%."+n+"f", Math.PI);
    }

    //3. Given a date, determine the day of the week (Monday, . . . , Sunday) on that day.
    //(e.g. 9 August 2010—the launch date of the first edition of this book—is a Monday.)
    static void question3()
    {
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 28);
        System.out.println(date.getDayOfWeek());
    }

    //4. Given n random integers, print the distinct (unique) integers in sorted order.
    static void question4()
    {
        Integer a[] = {99,1, 2, 3, 4, 5, 6, 1 , 2, 4, 8};
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, a);

        for (Integer i: sortedSet)
            System.out.println(i);
    }



    //5. Given the distinct and valid birthdates of n people as triples (DD, MM, YYYY), order
    //them first by ascending birth months (MM), then by ascending birth dates (DD), and
    //finally by ascending age.
    static class Birthday implements Comparable<Birthday>{
        int date;
        Month month;
        int year;
        public Birthday(int date, Month month, int year)
        {
            this.date = date;
            this.month = month;
            this.year=year;
        }

        @Override
        public String toString() {
            return "Birthday{" +
                    "date=" + date +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }

        //Ascending order. Smallest one first
        @Override
        public int compareTo(Birthday other) {
            if (this.month.compareTo(other.month) > 0) return 1;
            else if (this.month.compareTo(other.month) < 0) return -1;

            // same month, compare date
            else if (this.date > other.date) return 1;
            else if (this.date < other.date) return -1;

            //same date, compare age
            else if (this.year > other.year) return 1;
            else if (this.year < other.year) return -1;

            // both are identical
            return 0;
        }
    }
    static void question5()
    {
        Birthday bDay[] = {
                new Birthday(14, Month.JUNE, 1998),
                new Birthday(28, Month.JUNE, 2020),
                new Birthday(28, Month.JUNE, 2025),
                new Birthday(28, Month.APRIL, 2020),
                new Birthday(15, Month.APRIL, 2020),
                new Birthday(28, Month.APRIL, 2020),
                new Birthday(15, Month.SEPTEMBER, 2019),
                new Birthday(31, Month.DECEMBER, 2010)
        };

        Arrays.sort(bDay);
        for (Birthday b: bDay) {
            System.out.println(b.toString());
        }
    }


    //6. Given a list of sorted integers L of size up to 1M items, determine whether a value v
    //exists in L with no more than 20 comparisons (more details in Section 2.2).
    static void question6()
    {
        Integer arr[] = {1,2,4,5,6,8,11,11,14,25,111,122,352,352,352};
        Integer key = 111;
        System.out.println(Arrays.binarySearch(arr, key)>0);
    }

    //7. Generate all possible permutations of {‘A’, ‘B’, ‘C’, . . . , ‘J’}, the first N = 10 letters
    //in the alphabet (see Section 3.2.1).
    static void recursive_permute(char[] arr, int l, int r)
    {
        if (l==r)
        {
            for (char c: arr)
                System.out.print(c + " ");

            System.out.println();
        }


        else
        {
            for (int i = l; i <= r; i++) {
                char temp;
                // swap(arr , l, i)
                temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                recursive_permute(arr, l+1, r);
                // swap back to normal
                temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
            }
        }

    }
    static void question7()
    {
        // nPr = n!/(n-r!)
        char arr[] = {'A','B','C','D'};
        recursive_permute(arr, 0, 3);
    }
}
