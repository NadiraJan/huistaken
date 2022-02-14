package be.intetbrussel;

import java.util.Scanner;

public class CharArrayTools {
    public static void main(String[] args) {

        char[] alphabet = new char[26];
        int i;
        for (i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
            if ('A' + i == 'a' + i) {
                System.out.print(alphabet[i]);

            }
        }

        System.out.println();
        char char1 = ' ';
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your char:  ");
        char1 = kbd.next().charAt(0);


        if ((char1 >= 'A' && char1 <= 'Z') || (char1 >= 'a' && char1 <= 'z')) {
            System.out.println("is a letter");
        } else {
            System.out.println("is not a letter");
            kbd.close();
        }
    }
}


























