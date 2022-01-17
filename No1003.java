import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 0;
		int t = 0;
		int[] arrn;
		

		n = Integer.parseInt(br.readLine());
		
		while(n!=0) {
		
		t = Integer.parseInt(br.readLine());

		if (t == 0) {
			bw.write("1 0");
			bw.newLine();
		} else if (t == 1) {
			bw.write("0 1");
			bw.newLine();
		} else if (t == 2) {
			bw.write("1 1");
			bw.newLine();
		} else {
			arrn = new int[t + 1];
			for (int i = 3; i <= t; i++) {
				arrn[1] = 1;
				arrn[2] = 2;
				arrn[i] = arrn[i - 1] + arrn[i - 2];
			}

			bw.write(arrn[t - 2] + " " + arrn[t - 1]);
			bw.newLine();
		}
		
		n--;
		}
		bw.close();
	}

}
