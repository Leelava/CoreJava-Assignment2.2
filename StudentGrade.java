package ACD_JavaB_session2_Assignment2;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter Math score:");

        float math = input.nextFloat();
        
        System.out.println("Enter Physics score:");

        float physics= input.nextFloat();
        
        System.out.println("Enter Chemistry score:");
        
        float chemistry =input.nextFloat();
        
        double avg = (float)(math + physics + chemistry)/3.00 ;
        
        System.out.println("Averge score is " +avg);
        
        if (avg >=70) 
        { System.out.println("Result is GRADE A");}
        else
        	if (avg < 70 && avg >61)
        			{ System.out.println("Result is GRADE B");}
        	else 
        			{System.out.println("Result is GRADE C");}
        }
        	
        
	}

