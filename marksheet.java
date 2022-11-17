import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name of the student: ");
        String Name  = scanner.nextLine();

        System.out.print("Enter Roll no. of the student: ");
        int Roll_no  = scanner.nextInt();

        System.out.println("Now, Enter the marks in out of 100");
        System.out.print("Enter score in AI: ");
        int Ai  = scanner.nextInt();

        System.out.print("Enter score in ML: ");
        int Ml  = scanner.nextInt();

        System.out.print("Enter score in DS: ");
        int Ds  = scanner.nextInt();

        int  ai,ml,ds,precent,Totalmakrs,max=100;
        String G1,G2,G3,Grade;
//for grade and precentage calculate of AI
        ai=(Ai/1);

        if(ai>=90){
            G1 = "A";
        }
        else if(ai>=80){
            G1 = "B";
        }
        else if(ai>=70){
            G1 = "C";
        }
        else if(ai>=50){
            G1 = "D";
        }
        else if(ai>=30){
            G1 = "E";
        }
        else{
            G1 = "F";
        }
//for grade and precentage calculate of AI
        ml=(Ml/1);
        
        if(ml>=90){
            G2 = "A";
        }
        else if(ml>=80){
            G2 = "B";
        }
        else if(ml>=70){
            G2 = "C";
        }
        else if(ml>=50){
            G2 = "D";
        }
        else if(ml>=30){
            G2 = "E";
        }
        else{
            G2 = "F";
        }
//for grade and precentage calculate of AI
        ds=(Ds/1);
        
        if(ds>=90){
            G3 = "A";
        }
        else if(ds>80){
            G3 = "B";
        }
        else if(ds>=70){
            G3 = "C";
        }
        else if(ds>=50){
            G3 = "D";
        }
        else if(ds>=30){
            G3 = "E";
        }
        else{
            G3 = "F";
        }
        
        System.out.println("Name of the student: " + Name + "Roll No.: " + Roll_no );
        System.out.println("Subject\tTotal Marks\tScore\tPrecentage\tGrade");
        System.out.println("Ai\t" +max+"\t\t"+ Ai +"\t"+ ai+"%\t\t"+ G1);
        System.out.println("Ml\t" +max+"\t\t"+ Ml +"\t"+ ml +"%\t\t"+ G2);
        System.out.println("Ds\t" +max+"\t\t"+ Ds +"\t"+ ds +"%\t\t"+ G3);
        System.out.println();

        //for grade and precentage calculate of AI
        Totalmakrs = Ai+Ml+Ds;
        precent = Totalmakrs/3;

        if(precent>=90){
            Grade = "A";
        }
        else if(precent>=80){
            Grade = "B";
        }
        else if(precent>=70){
            Grade = "C";
        }
        else if(precent>=50){
            Grade = "D";
        }
        else if(precent>=30){
            Grade = "E";
        }
        else{
            Grade = "F";
        }
        System.out.println("Total obtained marks: "+Totalmakrs+"\tOut of: 300");
        System.out.println("precentage: " + precent + "%\t\tGrade: " + Grade + "\n");
        scanner.close();
    }
}
