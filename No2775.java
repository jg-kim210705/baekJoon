import java.util.Scanner;

public class No2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = Integer.parseInt(sc.nextLine());
		int[][] apart;
		int k = 0;
		int n = 0;

		while (t!=0) {
			k = Integer.parseInt(sc.nextLine()); // 층
			n = Integer.parseInt(sc.nextLine()); // 호
			apart = new int[k + 1][n];

			for (int i = 0; i < n; i++) {
				apart[0][i] = i + 1;
			}
			
			if(k==0) {
				System.out.println(apart[k][n-1]);
				t--;
				continue;
				}
			
			for (int i = 1; i <= k; i++) {
				for (int j = 0; j < n; j++) {
					for(int l = 0 ; l <= j ; l++) {
						apart[i][j] += apart[i - 1][l];
					}
				}
			}
			
			System.out.println(apart[k][n-1]);
			t--;
		}
	}
}
