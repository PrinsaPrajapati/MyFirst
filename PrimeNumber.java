import java.util.Scanner;

public class primeNumber {
	
	public static boolean isPrimeNumber(int number) {
		
		if(number <= 0) {
			return false;
		}
		for(int i = 2 ; i <= number / 2; i++) {
			if(number % 10 == 0	) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		System.out.println("Is " + number + " Prime number ? : " + isPrimeNumber(number));
	}

}
