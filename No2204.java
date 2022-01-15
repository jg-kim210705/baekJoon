import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] words = null;
		char[][] wordarr = null;
		int n = 0;
		int minnum = 0;
		
		do {
			String num = br.readLine();
			n = Integer.parseInt(num);
			
			if(n==0) {
				break;
			}
			
			words = new String[n];
			wordarr = new char[n][];
			
			for(int i = 0 ; i < n ; i++) {
				words[i] = br.readLine();
				wordarr[i] = words[i].toCharArray();
				for(int j =0 ; j < wordarr[i].length ; j++) {
					if(wordarr[i][j] <=90) {
						wordarr[i][j] = (char)(wordarr[i][j]+32);
					}
				}
			}
			
			for(int i = 0 ; i < n ; i++) {
				minnum = words[0].length();
				if(minnum >= words[i].length()) {
					minnum = words[i].length();
				}
			}
			
			for(int i = 0 ; i < minnum ; i++) {
				for(int j = 0 ; j < n ; j++) {
					if(wordarr[0][i] == wordarr[j][i]) {
						
					}else if(wordarr[0][i] > wordarr[j][i]) {
						
					}
				}
			}

			
		}while(true);
		
		
		bw.close();
	}

}
