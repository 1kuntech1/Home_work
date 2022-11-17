import java.util.Scanner;

public class skyvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rep;
        for(rep=1;rep==1;){
        System.out.print("Enter the letter: ");
        char Char = scanner.next().charAt(0);   //char c = sc.next().charAt(0);
        
        int skyvalue=Char;
        System.out.println("Sky value of Char = "+ skyvalue);
        
        System.out.print("If you want to continue program press 1: ");
        rep = scanner.nextInt();
        }
    }
}
