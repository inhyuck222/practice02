package prob3;

public class Prob3 {
	
	public static void printCharArray(char[] source) {
		if(source == null) {
			return;
		}
		
		for(int i=0;i<source.length;i++) {
			System.out.print(source[i]);
		}
		System.out.println();
	}
	
	public static void replaceSpace(char[] source) {
		if(source == null) {
			return;
		}
		
		for(int i=0;i<source.length;i++) {
			if(source[i] == ' ') {
				source[i] = ',';
			}
		}		
	}
	
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}
}
