import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class No1622 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = "";
		String b = "";
		char aaa;
		char bbb;

		while ((a = br.readLine()) != null && (b = br.readLine()) != null) {
			
			ArrayList<Character> aa = new ArrayList<Character>();
			for (int i = 0; i < a.length(); i++) {
				aaa = a.charAt(i);
				aa.add(aaa);
			}

			ArrayList<Character> bb = new ArrayList<Character>();
			for (int i = 0; i < b.length(); i++) {
				bbb = b.charAt(i);
				bb.add(bbb);
			}
			
			ArrayList<Character> cc = new ArrayList<Character>();
			for (int i = 0; i < aa.size(); i++) {
				for(int j = 0 ; j < bb.size(); j++) {
					if(aa.get(i)==bb.get(j)) {
						cc.add(aa.get(i));
						bb.remove(j);
						break;
					}
				}
			}

			for (int i = 0; i < cc.size(); i++) {
				for (int j = 0; j < i; j++) {
					if (cc.get(i) < cc.get(j)) {
						cc.add(j, cc.get(i));
						cc.remove(i + 1);
					}
				}
			}
			
			for(int i = 0 ; i < cc.size() ; i++) {
				bw.write(cc.get(i));
			}
			
			bw.newLine();
			bw.flush();
			aa.clear();
			bb.clear();
			cc.clear();

		}

		bw.close();
	}
}
