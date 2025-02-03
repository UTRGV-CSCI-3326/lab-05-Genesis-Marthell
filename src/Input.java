// import Scanner
import java.util.Scanner;
public class Input {
   public static void main(String[] ars) {
       Scanner scanner = new Scanner(System.in);
       
       // get name
       System.out.print("Enter your name: ");
       String name = scanner.nextLine();
       
       // get age
       System.out.print("Enter your age: ");
       int age = scanner.nextInt();
       
       // get weight
       System.out.print("Enter your weight: ");
       float weight = scanner.nextFloat();
       
       // get true/false
       System.out.print("Are you a smoker?: ");
       boolean isSmoker = scanner.nextBoolean();
       
       // close scanner
       scanner.close();
       
       // print info
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Weight: " + weight);
       System.out.println("Smoker: " + isSmoker);
   }
}