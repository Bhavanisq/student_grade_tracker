import java.util.Scanner;

public class student{

    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        System.out.println("student grade Tracker");
        System.out.println("Enter no.of subjects:");
        int ns=SC.nextInt();
        int total=0;
        for(int i=0;i<ns;i++){
            System.out.println("Enter marks obtainedin in "+(i+1)+" :");
            int marks=SC.nextInt();
            total+=marks;   

        }
        double averp=(double)total/ns;
        char grade;
        if(averp>=90){
            grade='0';

        }else if (averp>=80) {
            grade='A';
            
        }else if (averp>=70) {
            grade='B';
        
       }else if (averp>=60) {
            grade='c';

       } else if (averp>=50) {
            grade='D';

       }else if (averp>=40) {
            grade='E';
       }else{
        grade='F';
       }
       System.out.println("Total Marks Scored is"+total);
       System.out.println("Average Percentage gained is"+averp+"%");
       System.out.println("Grade:"+grade);
    }
}



