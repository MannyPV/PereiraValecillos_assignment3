import java.security.SecureRandom; 
import java.util.Scanner;

public class CAI1 {
	
	public static void main(String args[]) 
    { 	quiz();
    
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
	System.out.println("Very good!");
}

public static void displayIncorrectResponse() {
	//that prints out the response when a student enters an incorrect answer
	System.out.println("No. Please try again.");
}

}