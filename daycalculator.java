import java.util.Scanner;

public class daycalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kingly enter month in no.: ");
        int month = scanner.nextInt();
        
        int day;
        day = month%2;

        if(month==0){
            System.out.println("In this month day will be of 31");
        }
        else if(month==2){
            System.out.println("In this month day will be of 28 or 29");
        }
        else if(month>12){
            System.out.println("Kindly enter valid Input.");
        }
        else if(day==0){
            System.out.println("In this month day will be of 30");
        }
        else{
            System.out.println("In this month day will be of 31");
        }

        scanner.close();
    }
    
}
