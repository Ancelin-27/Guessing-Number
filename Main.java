import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secret = 27;
		int guess = 0;
		System.out.println("Guess the secret number (1-50) : ");
		while(guess != secret) {
			guess = sc.nextInt();
			if(guess < secret) {
				System.out.println("Guess it Higher!!");
			}
			else if(guess > secret) {
				System.out.println("Guess it Lower!!");
			}
			else {
				System.out.println("You got it!!");
			}
		}
	}
}