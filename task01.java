/*

// task01.java

import java.util.*;                              // Java code for task 1
class Main {
    public static void main(String[] args) {       // Java has printf too!
        Scanner sc = new Scanner(System.in);
        System.out.printf("%7.3f\n", sc.nextDouble());
    }
}
**/


/*
// task02.java
import java.util.*;
import java.lang.Math.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x =sc.nextDouble();
        System.out.print("\u03C0= "+(double)Math.round(Math.PI * Math.pow(10,x)) / Math.pow(10,x));
    }
}
**/

/*
// task02_2.java

import java.util.*;
import java.lang.Math.*;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(Math.PI));
    }
}

**/

// task03.java
// Boilerplate code for task 3
// cleaner in python
/*
import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] names = new String[]
                { "", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        Calendar that_day = new GregorianCalendar(2010, 7, 9); // 9 August 2010
        // note that month starts from 0, so we need to put 7 instead of 8
        System.out.println(names[that_day.get(Calendar.DAY_OF_WEEK)]); // "Mon"
        long today = new Date().getTime(); // today
        long diff = (today - that_day.getTime().getTime()) / (24*60*60*1000);
        System.out.println(diff + " day(s) ago"); // ans grows over time
    }
}
**/




// task04.java
// Boilerplate code for task 4
// cleaner in python


/*
import java.io.*;

class Main {

    static void printDistinct(int arr[], int n)
    {
        // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            // Check if the picked element is already printed
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }

    public static void main (String[] args)
    {
        int arr[] = {6, 10, 4, 9, 120, 6, 10};
        int n = arr.length;
        printDistinct(arr, n);

    }
}

**/



// task04_2.java
// Boilerplate code for task 4
// cleaner in python


import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
import java.io.*;
import java .util.*;

class Main
{
    static void printDistinct(int arr[], int n)
    {
        // First sort the array so thatall occurrences become consecutive
        Arrays.sort(arr);


        for (int i = 0; i < n; i++)
        {
            // Move the index ahead while
            // there are duplicates
            while (i < n - 1 && arr[i] == arr[i + 1])
                i++;


            System.out.print(arr[i] +" ");
        }
    }

    public static void main (String[] args)
    {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        printDistinct(arr, n);

    }
}

*/
/*


// task05.java
// elegant

import java.util.Arrays;

class Birthday implements Comparable<Birthday> {
    public int day;
    public int month;
    public int year;

    public Birthday(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int compareTo(Birthday other) {
        if (this.month != other.month) {
            // ascending birth months
            return (this.month > other.month) ? 1 : -1;   // The NullComparator class
        } else if (this.day != other.day) {
            // ascending birth dates
            return (this.day > other.day) ? 1 : -1;
        } else if (this.year != other.year) {
            // ascending age
            return (this.year < other.year) ? 1 : -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "(" + this.day + ", " + this.month + ", " + this.year + ")";
    }
}

 class Main {
    public static void main(String[] args) {
        Birthday p1 = new Birthday(12, 3, 1992);
        Birthday p2 = new Birthday(19, 9, 1993);
        Birthday p3 = new Birthday(1, 1, 1994);
        Birthday[] bdays = {p1, p2, p3};
        Arrays.sort(bdays);
        System.out.println(Arrays.toString(bdays));
    }
}
**/
/*
    //quick review
class Main {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("pear", "apple", "grapes", null, "orange");
        fruits.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(fruits); // [null, apple, grapes, orange, pear]

        fruits.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println(fruits); //[null, pear, orange, grapes, apple]
    }
}
**/



/*

class Main {
    public static int binarySearch(double[] arr, double x) {
        int a = 0, b = arr.length - 1;
        while (a <= b) { // Loop invariant: arr[a-1] < x < arr[b+1]
            int i = (a + b) / 2;
            if (arr[i] < x) a = i + 1;
            else if (arr[i] > x) b = i - 1;
            else return i; // because arr[i] == x
        }
        return ~a;
    }

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 8));

    }
}
**/





import java.util.*;
import java.util.HashSet;

class Main {

    private final static class Timer {
        private long start;
        public Timer() {
            start = System.nanoTime();
        }
        public double check() {
            return (System.nanoTime() - start)/1e9;
        }
    }




    public static void main(String[] args) {
        // Create a hash set.
        HashSet<String> hs = new HashSet<String>();
        // Add elements to the hash set.
        hs.add("Banana");
        hs.add("Apple");
        hs.add("Mango");
        System.out.println(hs);
        System.out.println("Apple present : " + hs.contains("Apple"));
        System.out.println("Grapes present : " + hs.contains("Grapes"));
        hs.remove("Apple");
        System.out.println(hs);
        System.out.println("Apple present : " + hs.contains("Apple"));
        final String[] keyword_array = { "abstract", "assert", "boolean", "break", "byte","while" };
        final Set<String> keywords = new HashSet<String>(Arrays.asList(keyword_array));     // difference?
        Timer t1 = new Timer();
        System.out.println(keywords);
        System.out.println("boolean present : " + keywords.contains("boolean"));



        Timer timer1 = new Timer();
        HashSet<Integer> my_set = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            my_set.add(i);
        }
        System.out.println("number present : " + my_set.contains(100));
        System.out.println(timer1.check());
    }
}





