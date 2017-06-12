package ACD_JavaB_session2_Assignment2;
//To determine the given number is positive,negative or Zero
import java.util.Scanner;

public class ASCIIZero {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number");
		int i= input.nextInt();
		if (i>0){
			System.out.println("Positive number "+i);
			//break;
		}else if (i<0){
			System.out.println("Negative number " +i);
	
		} else
			{
			System.out.println("The number is Zero " +i);}
			}
}


