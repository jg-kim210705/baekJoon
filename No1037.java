import java.util.Scanner;

public class No1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int count = 0;
		
		a = sc.nextInt();
		int[] aa = new int[a];
		
		for(int i = 0 ; i < aa.length ; i++) {
			aa[i] = sc.nextInt();
		}
		
		for (int i=0; i<aa.length; i++) {
			for(int j=0; j<i; j++) {
				if(aa[i] < aa[j]) {				
					int changer = aa[i];
					aa[i] = aa[j];
					aa[j] = changer;
				}
			}
		}
		
		System.out.println(aa[0]*aa[aa.length-1]);
		
		
	}

}