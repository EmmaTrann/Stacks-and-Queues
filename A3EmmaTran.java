/**
 *
 * A3EmmaTran
 * COMP 2140 SECTION A01
 * INSTRUCTOR Cuneyt Akcora
 * ASSIGNMENT Assignment #3
 * @author Emma Tran, 7876069, tranmb@myumanitoba.ca
 * @version Monday, March 9th 2020
 * PURPOSE: The purpose of this assignment is to write Java programs and implement various queue and linked
 * list algorithms. Then you will write a brief report describing your results, in the comments of your program;
 * see the end of this document
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A3EmmaTran {

    public static void main(String [] args) throws EmptyStackQueueException {



        MyQueue<Integer> q = new MyQueue<Integer>();

        int testSize = 5;

        for (int i = 0 ; i < testSize ; i++) {
            q.enqueue(new Integer(i));
            System.out.println("enqueued " + i);
        }

        for (int i = 0 ; i < testSize/2 ; i++) {
            System.out.println("dequeued " + q.dequeue());
        }

        for (int i = testSize ; i < 2*testSize ; i++) {
            q.enqueue(new Integer(i));
            System.out.println("enqueued " + i);
        }

        while(!q.isEmpty()) {
            System.out.println("dequeued " + q.dequeue());
        }

        //CORE JAVA: Collections
        //2 - ArrayLists
        List<String> store1 = new ArrayList<>();
        store1.add("https://www.amazon.ca/Coders-Work-Reflections-Craft-Programming/dp/1430219483");// interviews of famous coders
        store1.add("https://www.amazon.ca/Code-Complete-2nd-Steve-McConnell/dp/0735619670/"); // thick book about all you need to know about ADT
        store1.add("https://www.amazon.ca/Mythical-Man-Month-Software-Engineering-Anniversary/dp/0201835959");//Software development bible
        store1.add("https://www.amazon.ca/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882");//Advanced software practises
        store1.add("https://www.amazon.ca/Computer-Programming-Volumes-1-4A-Boxed/dp/0321751043/");//bible of computer science.
        // Solving the questions of the first volume will get you a job in any country, any company.

        //2a- search the ArrayList class to find the function that can be used to get the element at a given index.
        int index =2;
        String book = "";// write a single line of code here to find the book at the index;
        book = store1.get(index);
        System.out.println("Book is retrieved: "+(book.contains("Mythical")));
        //2b- search the ArrayList class to find a way (more than 1 way exist) to add all books in store1 to store2 with a single line of code.
        List store2 = new ArrayList<String>();
        //write a single line of code here
        store2.addAll(store1);
        System.out.println("Books are copied:"+(!store2.isEmpty()&&store2.size()==store1.size()));

        List store3 = new LinkedList<String>();
        LinkedList<String> store4 = new LinkedList<String>();

        //related to 2d
        String book2 = store4.peek();//possible
        // but this is not:
        //store3.peek();

        //related to 2e
        //we can change store1 to linkedlist
        store1 = new LinkedList<>();
        //but we cannot change store 4 to an arraylist
        //will not compile: store4 = new ArrayList<String>();
    }
}

/**
 *REPORT
 * ==================================
 * 2c. In linkedList we access other node with links, but in arrayList we access other element with index position.
 * In LinkedList, a node holds both its content and next/prev node address, but in Arraylist a element only hold its value.
 *
 * 2d. store3 is a list with element of type LinkedList, and store4 is a LinkedList with node of type String.
 * The methods are available to Linkedlist only can be used by store4.
 *
 * 2e. In store3 we create a List of type Linkedlist, and the list can be potentially typecast into any other type of list later on.
 * but in store4 we creates an LinkedList of String types and it cannot be used as any other kind of List.
 * Advantage:
 *You can access to all method that available to a LinkedList.
 * Disadvantage:
 * If you want to change the type of list used, you will have to change all function parameters and return types.
 *
 *
 */