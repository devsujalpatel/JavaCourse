import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Strings Declaration
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My name is Tony Stark";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is " + name);

        // concatenation
        String name = "Tony";
        String surname = "Stark";
        String fullName = name + " " + surname;
        // System.out.println("My name is " + fullName);
        // System.out.println(fullName.length());

        // charAt
        for(int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}