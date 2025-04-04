// A basic Java program
public class HelloWorld {

    // The main method is the entry point of any Java application
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");

        // Basic variables
        int number = 10;  // Integer variable
        double decimal = 20.5;  // Double (floating-point) variable
        String text = "Java Programming";  // String variable

        // Print the variables
        System.out.println("Number: " + number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Text: " + text);

        // Basic if-else statement
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }

        // Loop example (for loop)
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Calling a simple method
        greetUser("Niharika");
    }

    // A simple method that greets the user
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }
}
