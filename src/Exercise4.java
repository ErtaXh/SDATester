import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        // Read integer type value
        // Create Scanner class object with param System.in
        Scanner userInput = new Scanner(System.in);


        // Inform user what action need to be taken
        System.out.println("Input integer number");
        int a = userInput.nextInt(); // reading the input from keyboard
        // in this specific case integer value

        // Print text and variable value
        System.out.println("User input value " + a);
    }
}
