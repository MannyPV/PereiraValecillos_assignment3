import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
	
	public static void main(String[] args) {
		
		quiz();
	}
		
		public static void quiz(){
			//that contains the program logic
			int exit=0;
			
			while(exit!=1) {
				readDifficulty();
				
				
			int[] finalNum=generateQuestionArgument();
		    int[] num= readResponse();
		    isAnswerCorrect(num,finalNum);
		    exit= isAnswerCorrect(num,finalNum);
		    if (exit==1) {
				exit=1;
				break;
			}
			else {
				quiz();
				}
			}
		} 

		public static int[] askQuestion(int num1[],int num2[]) {
			//that prints the problem to the screen
			int multi[]=new int[10];
			for(int i=0;i<10;i++) {
			System.out.println((i+1)+". How much is "+num1[i]+" times "+ num2[i] + "?");
			multi[i]=num1[i] * num2[i];
			}
			return multi;
		}

		public static int[] readResponse() {
			//that reads the answer from the student
			@SuppressWarnings("resource")
			
			Scanner scan1 = new Scanner(System.in);
		
			int result[]= new int[10];
			for(int i=0;i<10;i++) {
			result[i]= scan1.nextInt();
			}
			return result;
		}

		public static int isAnswerCorrect(int num[],int finalNum[] ) {
			//that checks to see if the student's answer matches the correct answer to the problem
			int correct = 0;
			int exit;
			for(int i=0;i<10;i++){
			if(finalNum[i] == num[i]) {
				correct = correct + 1;
				System.out.print((i+1)+". ");
				displayCorrectResponse();
				}
			else {
				System.out.print((i+1)+". ");
				displayIncorrectResponse();
				}
			
			}
			displayCompletionMessage(correct);
			System.out.println("Do you want to new set of questions? ");
			System.out.println("Enter 0 for YES");
			System.out.println("Enter 1 for NO");
			
			@SuppressWarnings("resource")
			Scanner scan2 = new Scanner(System.in);
			exit=scan2.nextInt();
			System.out.println("You Entered"+": "+ exit);
			return exit;
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
		
		public static void displayCompletionMessage(int corectNum) {
			//prints out the studen't score and appropriate score response
			if(corectNum<= 7) {
				System.out.println("Number of Correct " + corectNum);
				System.out.print("Please ask your teacher for extra help.\n");
			}
			else if(corectNum>= 8) {
				System.out.println("Number of Correct " + corectNum);
				System.out.print("Congratulations, you are ready to go to the next level!\n");
			}
		}
		
		 public static int readDifficulty() {
			 //reads the difficulty level from the student
			 
			 System.out.println("Enter 1:  For random numbers to the range of 0-9 ");
			 System.out.println("Enter 2:  For random numbers to the range of 0-99 ");
			 System.out.println("Enter 3:  For random numbers to the range of 0-999 ");
			 System.out.println("Enter 4:  For random numbers to the range of 0-999 ");
			 @SuppressWarnings("resource")
			Scanner scan3 = new Scanner(System.in);
			 int answer=scan3.nextInt();
			 return answer;
		 }
		 
		 public static void readProblemType() {
			 
		 }
		 
		 public static int[] generateQuestionArgument() {
			 //that uses the difficulty level to generate a random number
			 int choice= readDifficulty();
			 int num1[]= new int[10];
			 int num2[]= new int[10];
			 int multi[]=new int[10];
			 
			 SecureRandom random = new SecureRandom();
			 
			 if (choice==1) {
				 for(int i=0;i<10;i++) {
					num1[i] = random.nextInt(9);
					num2[i] = random.nextInt(9);
				}
			 }
			 else if (choice==2) {
				 for(int i=0;i<10;i++) {
					num1[i] = random.nextInt(99);
					num2[i] = random.nextInt(99);

				 }
			 }
			 else if (choice==3) {
				 for(int i=0;i<10;i++) {
					num1[i] = random.nextInt(999);
					num2[i] = random.nextInt(999);

				 }
			 }
			 else if (choice==4) {
				for(int i=0;i<10;i++) {
					num1[i] = random.nextInt(9999);
					num2[i] = random.nextInt(9999);
				}
			}
			 else{System.out.println("Entered Wrong Number! For Number range");
			 }
			 
			multi=askQuestion(num1, num2);
			
			return multi;
				}
}
