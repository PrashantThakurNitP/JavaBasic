import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionsInJava {
    public static void main(String[] args) {
        /*
         * List is ordered collection
         * we have precise control over location where it is inserted
         * we can insert at specific position
         * it alow duplicate element
         * https://docs.oracle.com/javase/9/docs/api/java/util/Collections.html
         * list is interface
         * 
         * we can add element by specifying position aswell as if position not specified
         * it is added at end
         * 
         */

        // simpe list

        /* easiest way to initialize list with set of element introduced in java 9 */
        List<String> words = List.of("Apple", "Bat", "Cat");// of is static method present in list interface
        System.out
                .println("Size of list = " + words.size() + " is list empty = " + words.isEmpty() + " value at index 0"
                        + words.get(0) + " Check whether it contains string dog " + words.contains("Dog"));

        // index at which value is present, return -1 if argument is not found
        System.out.println("Index of cat" + words.indexOf("Cat"));

        /*
         * anything created with of() method is immutibe
         * for list created with .of() we cannot add anything
         * if we try to add another vaue it throw unsupported operation
         * 
         */
        /*
         * to create mutable list use ArrayList LinkedList and Vector
         */

        // creating array list , linked list and vector using above list
        List<String> wordsArrayList = new ArrayList<>(words); // donot need t specify type in second <>
        List<String> wordsLinkedList = new LinkedList<>(words);
        List<String> wordsVector = new Vector<>(words);
        /*
         * Arraylist -> basic data structure used is array
         * acess is fast insertion and deletion is slow
         */
        wordsArrayList.add(0, "Dog"); // add at spcific index
        wordsArrayList.add("Tiger"); // add at last
        System.out.println(wordsArrayList);
        /*
         * linked list -> basic data structure used is doubly linkedlist
         * acesss is slow , insertion and deletion is efficient
         * iterating is slow
         */
        wordsLinkedList.add(0, "Dog");
        wordsLinkedList.add("Tiger");
        System.out.println(wordsLinkedList);
        /*
         * Vector -> basic data structure used is array
         * acess is fast insertion and deletion is slow
         */
        wordsVector.add(0, "Dog");
        wordsVector.add("Tiger");
        System.out.println(wordsVector);

        /*
         * diff bw vector and array list
         * vector is introdced in java1 but arraylist in 1.2
         * 
         * 
         * vector method are synchronized and thread safe
         * in arrayist it is not synchronized it has high performance
         * 
         * if we have 25 synchronized method in class if instance of vector class is
         * shared bw mutipe thread
         * then only one of thread will be executing one of 25 method
         * at particular point in time only one thread can be executing any line of code
         * inside these synchronized methods becuase e want program to be thead safe in
         * vector
         * 
         * synchronized -> behaviour of program should not change from one thread or
         * another
         * 
         * 
         * 
         */
        List<String> newList = List.of("Yak", "Zebra");
        wordsArrayList.addAll(newList);
        System.out.println("After adding newlist " + wordsArrayList);// [Dog, Apple, Bat, Cat, Tiger, Yak, Zebra]

        List<String> newList2 = List.of("Kiwi", "Dolphin");
        wordsArrayList.addAll(2, newList2);
        System.out.println("After adding newlist  at positin 2 " + wordsArrayList); // [Dog, Apple, Kiwi, Dolphin, Bat,
                                                                                    // Cat, Tiger, Yak, Zebra]
        // change value at index
        wordsArrayList.set(1, "Whale");
        System.out.println("After changing at index 1 " + wordsArrayList);
        // [Dog, Fish, Bat, Cat, Tiger, Yak, Zebra]

        wordsArrayList.remove(2);// remove at index 2
        wordsArrayList.remove("Bat");// remove first occurance of bat

        /* iterating around list */
        // basic for loop
        for (int i = 0; i < wordsArrayList.size(); i++) {
            System.out.println(wordsArrayList.get(i));
        }
        // enhanced for loop
        for (String word : wordsArrayList) { // using enhanced for loop it is not recommeded to make modification in
                                             // list or deletion
            if (word.endsWith("at"))
                System.out.println(word);
        }
        // iterator
        System.out.println("Iterator");
        Iterator<String> wordInterator2 = wordsArrayList.iterator();
        while (wordInterator2.hasNext()) {
            if (wordInterator2.next().endsWith("at"))
                wordInterator2.remove();

            // iterator is recommended when we want to modification in mid
        }

        Iterator<String> wordInterator = wordsArrayList.iterator();

        while (wordInterator.hasNext()) {
            System.out.println(wordInterator.next());

            // iterator is recommended when we want to modification in mid
        }

        // in list cannot store primitive

        // indexOf() is not overoaded but remove() is overoaded

        // there are to remove method one receiving object and other index

        List<Integer> num = List.of(101, 200, 300, 400);
        List<Integer> number = new ArrayList<>(num);
        // in remove pass int -> remove at index like
        number.remove(2);
        // in remove pass object -> remove value
        number.remove(Integer.valueOf(101));
        System.out.println("After Remove" + number);
        number.add(56);
        number.add(12);
        number.add(2);

        // sort
        // without comparator
        Collections.sort(number); // sort is static method present in colection

    }
}
