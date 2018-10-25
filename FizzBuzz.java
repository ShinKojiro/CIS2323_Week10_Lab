import java.util.*;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner inputDevice = new Scanner(System.in);
		int lower = 0;
		int upper = 0;
		
		System.out.println("Welcome to FizzBuzz, please type an integer: ");
		upper = inputDevice.nextInt();
		
		// loop from lower to upper
		// print the number
		// if number is divisible by 3, print Fizz instead of the number
		// if number is divisible by 5, print Buzz instead of the number
		// if number is divisible by 3 & 5, print FizzBuzz instead of the number
		
		for(int i = lower; i <= upper; i++){
			boolean printNumb = true;
			if((i % 3) == 0){
				System.out.print("Fizz");
				printNumb = false;
			}
			if((i % 5) == 0){
				System.out.print("Buzz");
				printNumb = false;
			}
			if(printNumb){
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}