import java.util.Scanner;

public class No1526 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		int b = 0;
		String changer="";
		String[] c;
		int count = 0;
		int last = 0;
		
		a = sc.nextLine();
		b = Integer.parseInt(a);
		
		for(int i = 1; i <= b ; i++ ) {
			changer = i+"";
			c=changer.split("");
			for (int j = 0; j < c.length; j++) {
				if(c[j].equals("4") || c[j].equals("7")) {
					count++;
				}	
			}
			if(count == c.length) {
				last = i; 
			}
			count=0;
		}
		System.out.println(last);
	}
}
