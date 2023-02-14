import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Person {
    String name;
}

public class ArrayAndArrayList {
    /*
     * array allow us to tor mutiple value of same data type
     */

    public static void main(String[] args) {
        int[] marks = { 75, 60, 56 }; // shortcut to declare array
        // decaration of array
        int sum = 0;
        // enhanced for loop for iterating introduced in java 5
        for (int mark : marks) {
            sum = sum + mark;

        }
        int[] marks2 = {};// array can containe no vaue
        System.out.println(String.format("sum = %d", sum));

        int[] marks3 = new int[5]; // typical way to decare array intialized with

        for (int mark : marks3) {
            System.out.println(mark); // contain value intiaized to 0
        }

        System.out.println(marks3[0]);// acess specific value at index - 0
        marks3[0] = 10; // change value

        System.out.println("lenght of array = " + marks.length); // lenght for array is property and not a method hence
                                                                 // no ()
        System.out.println("Normal loop around array using loop and length");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        double[] value = new double[5]; // contain value default intialized with 0.0
        boolean[] value2 = new boolean[5]; // contain value intialized with false

        /*
         * for array of object default intialization is null
         */
        /*
         * left side [] is empty and right side contain size of array
         * cannnot create array without specifying length on right
         * 
         * ArrayOutOfBoundException -> if we try to access index out of range
         */

        System.out.println(marks);// print memory location
        System.out.println(Arrays.toString(marks)); // print array content like [7,60,56]

        Arrays.fill(value2, true); // intialize vale2 it true
        Arrays.fill(value, 100.0); // intialize/canges whoe array value with 100.0
        System.out.println(Arrays.equals(marks, marks2)); // retrn truee if lengtha and value is same, can be ed only
                                                          // for same type of array

        Arrays.sort(marks);// in position sorting
        System.out.println("Sort and print marks");
        System.out.println(Arrays.toString(marks));

        System.out.println("min vale of int = " + Integer.MIN_VALUE + "max vae of int = " + Integer.MAX_VALUE);

        // accurate way of division
        int sum1 = 295;
        int number = 3;
        BigDecimal avg = new BigDecimal(sum1).divide(new BigDecimal(number), 3, RoundingMode.UP);
        // we specify precision and ronding mode to avoid overfow in case of non
        // terminating decimal
        System.out.print(avg); // print donot add new line

        // inline -> replace all usage of variable with actual value of it
        /*
         * int [] marks ={78,45,23};
         * 
         * Student student = new Student("abc",marks)
         * 
         * changing to inline for array
         * 
         * Student student = new Student("abc",new int [] {78,45,23});
         * 
         * //variable arguments introduced from java 5
         * variable argumnet should be last argument
         * 
         */
        print(1);
        print(2, 3, 4, 5);

        System.out.println(sum(2, 4, 5));
        System.out.println(sum(45));

        Person[] person = new Person[5]; // create array with al value null
        person[1] = new Person();
        System.out.println("person array" + person);

        String[] textValues = { "Apple", "Ball" };
        System.out.println("String array" + Arrays.toString(textValues));
        /*------------------------------------------------------------
         * ArrayList (part of collections)
         * ----------------------------------------------------------------
         * 
         * size of array cannot be increased/decreased dynamicaly
         * 
         * ArrayList provide feature to add and remove elements
         */
        /*
         * ArrayList arrayList = new ArrayList(); // it throw warning as unchecked typw
         * but it aow to add all type but it
         * // is not good practise
         * arrayList.add("apple");
         * arrayList.add("cat");
         * arrayList.remove("apple");
         */

        ArrayList<String> arrayList1 = new ArrayList<String>(); // specify type
        arrayList1.add("apple");
        arrayList1.add("cat");
        arrayList1.remove("apple");
        System.out.println("size of array list" + arrayList1.size());// size of array ist

        ArrayList<Integer> marks1 = new ArrayList<Integer>(); // specify type
        marks1.add(99);
        marks1.add(71);
        marks1.add(81);
        marks1.add(75);
        marks1.add(79);
        marks1.remove(0);// in case of intger it consider argument in remove as index but in string it
                         // consider as value to remove
        System.out.println(marks1); // print array
        System.out.println("size of array list " + marks1.size());// size of array list
        System.out.println("max of array list " + Collections.max(marks1));// size of array list
        System.out.println("min of array list " + Collections.min(marks1));// size of array list

    }

    public static void print(int... values) {// variable agument values will be an array
        System.out.println(Arrays.toString(values));

    }

    public static int sum(int... values) {// variable agument values will be an array
        // System.out.println(Arrays.toString(values));
        int sum = 0;
        for (int value : values)
            sum += value;
        return sum;

    }

}
