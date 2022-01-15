import java.util.Scanner;

public class No2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		
		int[] aa = new int[a+1];
			aa[0] = 0;
			aa[1] = 1;
		for(int i = 2 ; i <= a ; i++) {
			aa[i] = aa[i-1]+aa[i-2];
		}
		
		System.out.println(aa[a]);
	}

}
