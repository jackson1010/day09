package myapp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Socket sock = null;
        InputStream is =null;
        OutputStream os =null;
        
        

        // initiate random class
        Random rand = new Random();
        // randomnumber between 0 and 99
        int randomNumber = rand.nextInt(100);
        int myGuess = 0;
        Scanner scanner = new Scanner(System.in);

        while (myGuess != randomNumber) {
            myGuess = scanner.nextInt();

            if (myGuess < randomNumber) {
                System.out.println("Your guess is lower");
            } else if (myGuess > randomNumber) {
                System.out.println("Your guessed number is higher");
            } else {
                System.out.println("YOu haved finally guessed it right");
                scanner.close();
            }
        }

    }
}
