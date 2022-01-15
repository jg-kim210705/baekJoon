import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1024 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String nl = br.readLine();
		String[] nlarr = nl.split(" ");
		int n = Integer.parseInt(nlarr[0]);
		int l = Integer.parseInt(nlarr[1]);
		String[] arr = null;

		while (l < 101) {
			if ((n - ((l * (l - 1)) / 2)) % l == 0 && (n - ((l * (l - 1)) / 2)) >= 0) {
				arr = new String[l];
				for (int i = 0; i < l; i++) {
					arr[i] = (((n - ((l * (l - 1)) / 2)) / l) + i) + " ";
				}
				break;
			} else {
				l++;
			}
		}

		if (l <= 100) {
			for (String result : arr) {
				System.out.print(result);
			}
		} else {
			System.out.println(-1);
		}
		bw.close();
	}
}
