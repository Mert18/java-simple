package com.javasimple.stacksandqueues;

import java.util.Arrays;

public class Queue {

    private String[] queueArray;

    private int queueSize;

    private int front, rear, numberOfItems = 0;

    Queue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void enqueue(String input) {
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println(input + " was enqueued.");
            displayTheQueue();
        } else {
            System.out.println("Queue is full.");
        }
    }

    public void dequeue() {
        if (numberOfItems > 0) {
            System.out.println(queueArray[front] + " was dequeued.");
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
            displayTheQueue();

        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void displayTheQueue() {
        for (int i = 0; i < queueSize; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue theQueue = new Queue(10);

        theQueue.enqueue("12");
        theQueue.enqueue("1");
        theQueue.enqueue("43");
        theQueue.dequeue();
        theQueue.enqueue("33");
        theQueue.displayTheQueue();
    }
}
