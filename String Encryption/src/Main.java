import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me something to encrypt:");
        String strInput = scan.next();

        //get last char from the string length.
        //-1 because counting starts at 0
        char lastChar = strInput.charAt(strInput.length() - 1);

        //get first letters in the string
        //since the length of the string must be versatile,
        //end int is second-to-last (-1 because it stops before it prints the last int)
        String firstLetters = strInput.substring(0, strInput.length() - 1);

        //add it all together lastChar, firstLetters, and ay
        String encryption = lastChar + firstLetters + "ay";

        //print out the encryption!
        System.out.println(encryption);

        /*
        Bella W.
        Computer Programming 11
        'String Encryption'
        2021-11-17
         */

        }
    }
