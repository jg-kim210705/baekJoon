import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2693 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		String[] convert;
		int counter = 0;
		String[] thirdResult = new String[t];

		while (t > counter) {
			String text = br.readLine();
			convert = text.split(" ");
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < i; j++) {
					if(Integer.parseInt(convert[i])<Integer.parseInt(convert[j])) {
						String changer = convert[j];
						convert[j] = convert[i];
						convert[i] = changer;
					}
				}
			}
			thirdResult[counter++]=convert[7];
			convert = null;
		}
		
		for(String print : thirdResult) {
			bw.write(print);
			bw.newLine();
		}
		bw.close();
	}
}
