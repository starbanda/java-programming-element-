import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        float perimeter = sc.nextFloat();

        // Calculate the side of the square using the formula: side = perimeter / 4
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}

