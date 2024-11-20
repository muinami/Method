import java.util.Scanner;

public class methodsInJava {
    public static void main(String[] args) {
        shapes.rectangle(); // Call the rectangle method from shapes class
    }
}

class shapes {
    public static void rectangle() {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Enter the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Display the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}






































