import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class No1622_out {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = "";
		String b = "";
		String c = "";
		char aaa;
		char bbb;
		int count = 0;

		while ((a = br.readLine())!=null && (b = br.readLine())!=null) {

			HashSet<Character> aa = new HashSet<Character>();
			for (int i = 0; i < a.length(); i++) {
				aaa = a.charAt(i);
				aa.add(aaa);
			}

			ArrayList<Character> bb = new ArrayList<Character>();
			for (int i = 0; i < b.length(); i++) {
				bbb = b.charAt(i);
				count = 0;
				if (i == 0) {
					bb.add(bbb);
				} else {
					for (int j = 0; j < bb.size(); j++) {
						if ((bb.get(j)).equals(bbb)) {
							bb.remove(j);
							count++;
							bb.add(bbb);
						}
					}
					if (count == 0) {
						bb.add(bbb);
					}
				}
			}

			for (int i = 0; i < bb.size(); i++) {
				for (int j = 0; j < i; j++) {
					if (bb.get(i) < bb.get(j)) {
						bb.add(j, bb.get(i));
						bb.remove(i + 1);
					}
				}
			}

			for (int i = 0; i < bb.size(); i++) {
				if (!aa.add(bb.get(i))) {
					c += bb.get(i);
				}
			}

			bw.write(c+"\n");
			bw.flush();
			aa.clear();
			bb.clear();
			c = "";

		}

		bw.close();
	}
}
