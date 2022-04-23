import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner obj1 = new Scanner(System.in);
    System.out.print("Weight (kg): ");
    double weight = obj1.nextDouble();
    System.out.println();

    Scanner obj2 = new Scanner(System.in);
    System.out.print("Height (m): ");
    double height = obj2.nextDouble();
    System.out.println();

    double bmi = weight / (height * height);
    System.out.println("Bmi: " + bmi);
  }
}
