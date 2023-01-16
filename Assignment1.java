import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
public class Assignment1 {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

// Java program to verify if a student email is valid
System.out.print("Enter Email : ");
String email = scan.nextLine();

Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
Matcher matcher = pattern.matcher(email);

boolean match = matcher.matches();

if(match) {
    System.out.println("Valid");
} else {
    System.out.println("Invalid");
}
System.out.println();

// Java program to verify if phone number is valid
System.out.print("Enter phone number : ");
String phoneNumber = scan.nextLine();

match = Pattern.matches("\\+639[0-9]{9}", phoneNumber);

if (match) {
    System.out.println("Valid");
} else {
    System.out.println("Invalid");
}
System.out.println();


// Java program to verify if birthday is valid
System.out.print("Enter birthday : ");
String birthday = scan.nextLine();

match = Pattern.matches("\\d{4}-\\d{2}-\\d{2}" , birthday);
if (match) {
    System.out.println("Valid");
} else {
    System.out.println("Invalid");
}
scan.close();
System.out.println();
    }
}