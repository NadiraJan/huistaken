package be.intetbrussel;

import java.util.Scanner;

public class Chopchop {
    public static void main(String[] args) {
        int i, number,key, array[];

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter array size: ");
        number = kbd.nextInt();

        array = new int[number];
        System.out.println("enter" +number +"numbers");

        for (i =0;i < number; i++) {
            array[i] = kbd.nextInt();
        }
        System.out.println("Enter a number to search: ");
        key = kbd.nextInt();

        for (i=0;i<number;i++) {
            if (array[i]==key) {
                System.out.print(key + " is" +"in array");
                break;
            }
        }
        if(i ==number) {
            System.out.print("number "+key+" not found in array");
        }
    }
}