import java.util.Scanner;

public class landingPage {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the landing page!");
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.println("Please enter your email: ");
        String email = sc.next();
    }
}