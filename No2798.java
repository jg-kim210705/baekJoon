import java.util.Scanner;

public class No2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		int l = 0;

		n = sc.nextInt();
		m = sc.nextInt();

		int[] card = new int[n];
		int[] cardsum = new int[n * (n - 1) * (n - 2) / 6];

		for (int i = 0; i < n; i++) {
			card[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
						if (card[i] + card[j] + card[k] <= m) {
							cardsum[l++] = card[i] + card[j] + card[k];
							if(cardsum[0]<cardsum[l-1]) {
								cardsum[0] = cardsum[l-1];
							}
						}
					}
				}
			}
		
		System.out.println(cardsum[0]);
		
	}

}
