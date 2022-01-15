import java.util.Scanner;

public class No1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		int count = 0;
		a = sc.nextLine();
		String[] str = new String[Integer.parseInt(a)];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}

		char[] wording;

		for (int i = 0; i < str.length; i++) {
			wording = str[i].toCharArray();
			loop: for (int j = 0; j < wording.length; j++) {
				int n = str[i].indexOf(wording[j]);
				int m = str[i].lastIndexOf(wording[j]);
				if (m == n) {
					continue;
				}
				for (int k = n; k <= m; k++) {
					if (wording[k] != wording[j]) {
						count++;
						break loop;
					}
				}
			}
		}

		System.out.println(Integer.parseInt(a) - count);
	}

}
