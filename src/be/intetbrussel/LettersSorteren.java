package be.intetbrussel;

public class LettersSorteren {
    public static void main(String[] args) {

        char[] alphabet = {'z', 'b', 'v', 't', 'e', 'f', 'g', 'w', 'i', 's', 'x', 'u', 'm', 'n', 'y', 'p', 'q', 'r', 'j', 'd', 'l', 'c', 'h', 'k', 'o', 'a'};

        int n = alphabet.length;
        System.out.println("Given array is");
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();
        // sort(alphabet, n);
        System.out.println(sort(alphabet));


        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }

    public static char[] sort(char[] alphabet) {
        for (int i = 0; i < alphabet.length-1; i++) {

            for (int j = i + 1; j < alphabet.length; j++) {
                if (alphabet[i] > alphabet[j]) {
                    char temp = alphabet[i];
                    alphabet[i] = alphabet[j];
                    alphabet[j] = temp;
                }

            }
            return alphabet;

        }
        return alphabet;

    }
}












