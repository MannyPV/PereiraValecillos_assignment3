import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {

	public static void main(String[] args) {
		quiz();
	}
		
		public static void quiz(){
			//that contains the program logic
			SecureRandom random = new SecureRandom(); 
			int int1 = random.nextInt(9); 
		    int int2 = random.nextInt(9);
		    askQuestion(int1,int2);
		    int result=readResponse();
		    isAnswerCorrect(result,int1,int2);
		} 

		public static void askQuestion(int num1, int num2) {
			//that prints the problem to the screen
			
			System.out.println("How much is "+num1+" times "+ num2 + "?");
		}

		public static int readResponse() {
			//that reads the answer from the student
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int result= scan.nextInt();

			return result;
			
		}

		public static void isAnswerCorrect(int result,int num1, int num2) {
			//that checks to see if the student's answer matches the correct answer to the problem
			int correctResult= num1 * num2;
			if(correctResult == result) {
				displayCorrectResponse();
			}
			
			else{while(correctResult != result) {
				displayIncorrectResponse();
				int retry = readResponse();
				if(retry==correctResult) {
					displayCorrectResponse();
					result=retry;
					}
				}
			}
		}

		public static void displayCorrectResponse() {
			//that prints out the response when a student enters a correct answer
			SecureRandom random = new SecureRandom(); 
			int choice = random.nextInt(4); 
			switch(choice) {
			case 0: System.out.print("Very good!\n");
					break;
					
			case 1: System.out.print("Excellent!\n");
					break;
					
			case 2: System.out.print("Nice work!\n");
					break;
					
			case 3: System.out.print("Keep up the good work!\n");
					break;
			}
			
		}

		public static void displayIncorrectResponse() {
			//that prints out the response when a student enters an incorrect answer
			SecureRandom random = new SecureRandom(); 
			int choice = random.nextInt(4); 
			switch(choice) {
			case 0: System.out.print("No. Please try again.\n");
					break;
					
			case 1: System.out.print("Wrong. Try once more.\n");
					break;
					
			case 2: System.out.print("Don’t give up!\n");
					break;
					
			case 3: System.out.print("No. Keep trying.\n");
					break;
			}
		}

}
