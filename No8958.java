import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class No8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = br.readLine();
		int numbering = Integer.parseInt(num);

		int countnum = 0;
		int sumline = 0;
		int lineanswer = 0;
		ArrayList<Integer> sumall = new ArrayList<Integer>();

		for (int n = 0; n < numbering; n++) {

			String wordline = br.readLine();
			String[] wordpiece = wordline.split("");

			for (int i = 0; i < wordpiece.length; i++) {

				if (i == wordpiece.length - 1 && wordpiece[i].equals("O")) {

					countnum++;
					sumline = (countnum) * (countnum + 1) / 2;
					if (sumline != 0) {
						sumall.add(sumline);
					}
					sumline = 0;
					countnum = 0;

				} else if (wordpiece[i].equals("O")) {
					countnum++;

				} else {
					sumline = (countnum) * (countnum + 1) / 2;
					if (sumline != 0) {
						sumall.add(sumline);
					}
					sumline = 0;
					countnum = 0;

				}

			}

			for (int i = 0; i < sumall.size(); i++) {
				lineanswer += sumall.get(i);
			}

			System.out.println(lineanswer);

			lineanswer = 0;
			sumall.clear();
		}

		bw.close();
	}

}
