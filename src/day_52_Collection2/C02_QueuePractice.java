package day_52_Collection2;

import java.util.*;

public class C02_QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQue = new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(20, 150, 200, 40, 120));//random order.
        System.out.println("priorityQue = " + priorityQue);
        priorityQue.add(30);
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("-------------------------------------------");

        Queue<Integer> arrayDeque = new ArrayDeque<>();        //preverse insertion order.Yazılan sırayı korudu.
        arrayDeque.addAll(Arrays.asList(20, 150, 200, 40, 120));
        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.add(30);
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("-------------------------------------------");

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(20, 150, 200, 40, 120));
        System.out.println("LinkedList = " + linkedList);
        linkedList.add(30);
        System.out.println("LinkedList = " + linkedList);
        System.out.println("-------------------------------------------");

        // priorityQue.get(1) indeks yok

        ((List) linkedList).get(1);//Casting down
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());
        System.out.println("priorityQue.poll() = " + priorityQue.poll());//Stacta pok() var iken burada poll vardır.
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("-----------------------------------------------------------");


        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("-----------------------------------------------------------");


        System.out.println("LinkedList.poll() = " + linkedList.poll());
        System.out.println("LinkedList = " + linkedList);


        //        System.out.println("((List)priorityQue).get(1) = " + ((List) priorityQue).get(1));  // runtime Error


    }
}
