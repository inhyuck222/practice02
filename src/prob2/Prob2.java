package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("5개의 숫자를 입력하세요.");
		
		int[] numbers = new int[5];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		avg = sum / numbers.length;
		
		System.out.println("평균은 " + avg + " 입니다.");

		scanner.close();

	}
}
