import java.util.Scanner;

public class No1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String b = "";
		int n = 1;
		int c = 0;
		
		b = sc.nextLine();
		a = Integer.parseInt(b);
		
		while(true) {
			if( (n-1)*(n)/2 < a && (n)*(n+1)/2 >= a) {
				break;
			}else { n++; }
			
		}
		
		String[] nn = new String[n];
		c= a-((n-1)*(n)/2);
		
			if(n%2==0) {
				for(int i = 0 ; i < n ; i++) {
					nn[i]=(i+1) + "/" + (n-i);
				} 
			}else if(n%2==1) {
				for(int i = 0 ; i < n ; i++) {
					nn[i]=(n-i) + "/" + (i+1);
				} 
			}
		
		System.out.println(nn[c-1]);
		
	}

}
