package com.javasimple.arraystructures;

public class ArrayStructures {
    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++){
            theArray[i] = (int)(Math.random()* 10) + 10;
        }
    }

    public int getValueAtIndex(int index){
        if(index < arraySize) return theArray[index];

        return 0;
    }

    public boolean isPresent(int value){
        for(int i=0; i< arraySize; i++){
            if(theArray[i] == value){
                return true;
            }
        }
        return false;
    }

    public void printArray(){
        System.out.println("///////////////");

        for(int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
        }
    }

    public void deleteIndex(int index){
        if(index < arraySize){
            for(int i=index; i<(arraySize-1); i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value){
        arraySize++;
        theArray[arraySize-1] = value;
    }

    public void bubbleSort(){
        for(int i = arraySize - 1; i > 1; i--){
            for(int j=0; j<i; j++){
                if(theArray[j] > theArray[j+1]){
                    swapValues(j, j+1);
                }
            }
        }
    }

    public void binarySearch(int value){
        int lowIndex = 0;;
        int highIndex = arraySize -1;
        while(lowIndex <= highIndex){
            int middleIndex = (highIndex + lowIndex) / 2;
            if(theArray[middleIndex] < value){
                lowIndex = middleIndex +1;

            } else if(theArray[middleIndex] > value)
            {
                highIndex = middleIndex - 1;
            }
            else{
                System.out.println("\n Found!, It is at index " + middleIndex);
                lowIndex = highIndex + 1;
            }
        }
    }

    public void swapValues(int indexOne, int indexTwo){
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public static void main(String[] args){
        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        System.out.println("Randomly generated array!");
        newArray.printArray();

        System.out.println("What is the at the index 3?");
        System.out.println(newArray.getValueAtIndex(3));

        System.out.println("Is 13 present?");
        System.out.println(newArray.isPresent(13));

        System.out.println("Deleting index 2");
        newArray.deleteIndex(2);
        newArray.printArray();

        System.out.println("Inserting value 333!");
        newArray.insertValue(333);
        newArray.printArray();

        System.out.println("After Bubble Sort!");
        newArray.bubbleSort();

        System.out.println("Binary Search for 333!");
        newArray.binarySearch(333);

    }
}
