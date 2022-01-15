import java.util.Scanner;

public class No3449 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		a = sc.nextLine();
		String b = "";
		String c = "";
		
		char[] bb;
		char[] cc;
		int[] count = new int[Integer.parseInt(a)];
		
		for(int i = 0 ; i < Integer.parseInt(a) ; i++) {
			b = sc.nextLine();
			bb = new char[b.length()];
			c = sc.nextLine();
			cc = new char[c.length()];
			for(int j = 0 ; j < b.length() ; j++) {
				bb[j]=b.charAt(j);
				cc[j]=c.charAt(j);
				if(bb[j]!=cc[j]) {
					count[i]++;
				}
			}
		}
		
		for(int i = 0 ; i < Integer.parseInt(a) ; i++) {
			System.out.printf("Hamming distance is %d.\n",count[i]);
		}
	}
}
