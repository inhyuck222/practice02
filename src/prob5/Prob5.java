package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean play = true, rePlay = true;
		int answerCount = 1;
		int answer = 0;
		int k = -1;
		String replayAnswer;
		
		while(play) {
			if(rePlay) {
				Random r = new Random();
				k = r.nextInt(100) + 1;
				rePlay = false;
			}
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("1 - 100");
			
			System.out.println(answerCount++ + ">>");
			answer = scanner.nextInt();
			
			if(k > answer) {
				System.out.println("더 높게");
			}else if(k < answer){
				System.out.println("더 낮게");
			}else {
				System.out.println("맞았습니다.");
				System.out.println("다시하겠습니까?(y/n)");								
				replayAnswer = scanner.next();
				
				answerCount = 1;
				
				if(replayAnswer.equals("n")) {
					break;
				}
				play = true;
				rePlay = true;
			}
		}
		
		scanner.close();

	}
}