import java.util.Scanner;

public class alpha_digit_symole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rep;
        for(rep=1;rep==1;){
        System.out.print("Enter the letter: ");
        char Char = scanner.next().charAt(0);   //char c = sc.next().charAt(0);
        int skyvalue = Char;

        if(Char>=65&&Char<=90){
            System.out.print("The "+ skyvalue +" Letter "+ Char + " is Capital alphabate!");
        }
        else if(Char>=97&&Char<=122){
            System.out.print("The "+ skyvalue +" Letter "+ Char + " is Lower alphabate!");
        }
        else if(Char>=48&&Char<=57){
            System.out.print("The "+ skyvalue +" Chracter "+ Char +" is Digit!");
        }
        else{
            System.out.print("The "+ skyvalue +" Chracter "+ Char +" is Special Chracter!");
        }
        System.out.print("\nIf you want to continue Press 1: ");
        rep = scanner.nextInt();
    }
    }
}