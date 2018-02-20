package prob1;

import java.util.Scanner;

public class Prob1 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액:");
		int money = scanner.nextInt();
		
		int[] moneyUnits = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] unitCounts = new int[moneyUnits.length];

		while (money > 0) {
			for (int unitIndex = 0; unitIndex < moneyUnits.length; unitIndex++) {
				while(money - moneyUnits[unitIndex] >= 0) {
					money -= moneyUnits[unitIndex];
					unitCounts[unitIndex]++;
				}
			}
		}
		
		for(int i = 0; i < moneyUnits.length; i++) {
			System.out.print(moneyUnits[i] + "원 : ");
			System.out.println(unitCounts[i] + "개");
		}		

		scanner.close();
	}
}