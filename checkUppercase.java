import java.util.Scanner;

public class checkUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the letter: ");
        char Letter = scanner.next().charAt(0);    //char c = sc.next().charAt(0);

        if(Character.isUpperCase(Letter)){
            System.out.println("The Letter "+ Letter + " is Uppercase!");
        }
        else{
            System.out.println("The Letter "+ Letter + " is Lowercase!");
        }
        scanner.close();
    }
}