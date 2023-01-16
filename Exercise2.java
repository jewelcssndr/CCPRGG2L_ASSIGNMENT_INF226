import java.util.Scanner;

public class Exercise2 {
    
static Scanner scan=new Scanner(System.in);
public static void main(String[] args) throws Exception {

drive("Training");
scan.close();
}
static void drive(String training) {

    System.out.println("Training");

drive(training);

String feedback = getFeedBack(training);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            improvement(training);

            // Recursive call
            drive(training);

        } else if (feedback.equals("yes")) {
            passed(training);
        }
    }

    static void taste(String food) {
        System.out.println("Driving");
    }

    static String getFeedBack(String food) {
        System.out.println("Did you passed? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void improvement(String training) {
        System.out.print("Enter additional skill to improve:");
        String skill = scan.next();
        System.out.println("Training" + skill + "skills");
    }

    static void passed(String training) {
        System.out.println("Passed" + training);
    }

}
