package day_52_Collection2;

import java.util.LinkedList;
import java.util.Queue;

public class pollMetodu {
    public static void main(String[] args) {
            Queue<Integer> tasks = new LinkedList<>();
            tasks.offer(1);
            tasks.offer(2);
            tasks.offer(3);

            while (!tasks.isEmpty()) {
                Integer task = tasks.poll();
                System.out.println("Processing task: " + task);
            }
        }
    }

