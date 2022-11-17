import java.util.Scanner;

public class Salaryslip{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter the Id of employee: ");
        int Id = scanner.nextInt();
        
        System.out.print("Enter Employee Basic Salary: ");
        int Salary = scanner.nextInt();

        double Hra,Da,Ta,Ma,Pf,GS,TAX,NS;

        // salary calculation
        Hra = (Salary*0.5);
        Da = (Salary*0.1);
        Ta = (Salary*0.4);
        Ma = (Salary*0.3);
        Pf = (Salary*0.05);

        GS = (Salary+Hra+Da+Ta+Ma);
        TAX = (GS*0.1);
        NS = (GS-Pf-TAX);

        System.out.println("Employee ID: " + Id + "\tEmployee Name: " + Name + "\tBasic Salary: " + Salary);
        System.out.println();
        System.out.println("Hra: "+ Hra +"\nDa: "+ Da +"\nTa: "+ Ta +"\nMa: "+ Ma +"\nPf: "+ Pf);
        System.out.println();
        System.out.println("Gs: "+ GS +"\tTax: "+ TAX +"\tNs: "+ NS);
        scanner.close();
    }
}