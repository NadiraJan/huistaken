package be.intetbrussel;

import java.util.Arrays;

public class IntArrayTools {
    public static void main(String[] args) {
        int[] myArray = {8, 1, 6}; //array with int elements
        printArray(myArray);
        SelectionSort(myArray);
        printArray(myArray);
    }

    public static void printArray(int[] array) { //hier with for loop we print our array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        System.out.println();
    }

    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) { //we use forloop to find min
            int min = array[i];/*first we have to compare first element with every next element en find minim element
                                 of array; we create int min to save minim.element of array*/
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) { /*we create int j to check next element as we finished to
                                                            check first element*/
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {  //after we found the next min index we have to swap indexes
                int temp = array[i]; // to make swap we create int temp
                array[i] = array[min_i];
                array[min_i] = temp;
            }


        }

    }

}






