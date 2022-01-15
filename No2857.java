import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2857 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] name = new String[5];
		String number = "";
		
		for(int i = 0 ; i < 5 ; i++) {
			name[i]= br.readLine();
			if(name[i].indexOf("FBI")!=-1) {
				number+= (i+1) + " ";
			}
		}
		
		if(number.length()==0) {
			bw.write("HE GOT AWAY!");
		}else {
			bw.write(number);
		}
		
		bw.close();
	}
}
