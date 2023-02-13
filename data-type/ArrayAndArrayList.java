import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

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

    }

}
