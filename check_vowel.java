import java.util.Scanner;

public class check_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Letter: ");
        char Letter = scanner.next().charAt(0);     //char c = sc.next().charAt(0);

        if(Character.isUpperCase(Letter)){                //(Character.isUpperCase(Letter))
            if(Letter=='A'||Letter=='E'||Letter=='I'||Letter=='O'||Letter=='U'){
                System.out.println("The Letter "+ Letter +" is Capital Vowel!");
            }
            else{
                System.out.println("The Letter "+ Letter +" is Capital Constant!");
            }
        }   
        else{
            if(Letter=='a'||Letter=='e'||Letter=='i'||Letter=='o'||Letter=='u'){
                System.out.println("The Letter "+ Letter +" is lower Vowel!");
            }
            else{
                System.out.println("The Letter "+ Letter +" is lower Constant!");
            }
        }
        scanner.close();
    }
}
