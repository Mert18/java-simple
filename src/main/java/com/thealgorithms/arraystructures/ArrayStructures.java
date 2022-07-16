package com.thealgorithms.arraystructures;

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

    public static void main(String[] args){
        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();

        newArray.printArray();

        System.out.println(newArray.getValueAtIndex(3));
        System.out.println(newArray.isPresent(13));
        newArray.deleteIndex(2);
        newArray.printArray();

        newArray.insertValue(333);
        newArray.printArray();

    }
}
