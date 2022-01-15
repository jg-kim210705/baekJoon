import java.util.Scanner;

public class No1356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		int b = 0;
		int c = 1;
		int d = 1;
		boolean e = false;

		a = sc.nextLine();
		b = Integer.parseInt(a);
		int[] bb = new int[a.length()];

		for (int i = a.length() - 1; i > -1; i--) {
			bb[i] = b / (int) (Math.pow(10, i));
			b -= bb[i] * (int) (Math.pow(10, i));
		}

		for (int i = 0; i < a.length() - 1; i++) {
			for (int j = 0; j <= i; j++) {
				c *= bb[j];
			}
			for (int j = a.length() - 1; j > i; j--) {
				d *= bb[j];
			}
			if (c == d) {
				e = true;
				break;
			}
			c = 1;
			d = 1;
		}

		if (e) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
