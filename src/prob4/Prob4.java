package prob4;

public class Prob4 {

	public static char[] reverse(String originSource) {
		if (originSource == null) {
			return null;
		}
		char[] charSource = originSource.toCharArray();
		char[] result = new char[charSource.length];

		for (int i = 0; i < charSource.length; i++) {
			result[i] = charSource[charSource.length - (i + 1)];
		}

		return result;
	}

	public static void printCharArray(char[] source) {
		if (source == null) {
			return;
		}

		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
}
