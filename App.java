import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        training("Drive");
        scan.close();
    }

    static void training(String drive) {

        System.out.println("Driving!");
        training(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
      if (feedback.equals("no")) {

    //         // Do something to reach the goal
             fixParking(drive);

    //         // Recursive call
    training(drive);
        } else if (feedback.equals("yes")) {
           training(drive);
       }
     }

    static void Testing(String drive) {
        System.out.println("Testing Drive");
    }

    static String getFeedBack(String driving) {
        System.out.println("Did you pass? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixParking(String drive) {
        System.out.print("Fix parking skills :");
        String parking = scan.next();
        System.out.println("Fixing drive. Added " + parking);
    }

    static void test(String driving) {
        System.out.println("Test driving skills");
    }

}