package com.javasimple.stacksandqueues;

import java.util.Arrays;

public class Stack {
    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;

    Stack(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else
            System.out.println("Stack is full");

        displayTheStack();
        System.out.println(input + " added to the stack.");
    }

    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();
            System.out.println(stackArray[topOfStack] + " was removed.");
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Stack is already empty!");
            return "-1";
        }
    }

    public void displayTheStack() {
        for (int i = 0; i < stackSize - 1; i++) {
            System.out.print(stackArray[i] + " ");
        }
    }

    public void pushMany(String values) {
        String[] tempString = values.split(" ");

        for (int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }
    }

    public void clearStack() {
        for (int i = topOfStack; i >= 0; i--) {
            pop();
        }
    }

    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push("10");
        theStack.push("20");
        theStack.push("12");
        theStack.clearStack();
        theStack.displayTheStack();
    }
}
