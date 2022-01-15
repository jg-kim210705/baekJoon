import java.util.Scanner;

public class No2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		int[] aa = new int[3];
		int[] bb = new int[3];
		int[] cc = new int[3];
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(int i=2 ; i>-1 ; i--) {
			aa[i]=a/(int)(Math.pow(10, i));
			bb[i]=b/(int)(Math.pow(10, i));
			a-=aa[i]*(int)(Math.pow(10, i));
			b-=bb[i]*(int)(Math.pow(10, i));
		}
		
		for(int i=0 ; i<3 ; i++) {
			if(aa[i] > bb[i]) {
				for(int m : aa) {System.out.print(m);}
				break;
			}else if(aa[i] == bb[i]) {
				continue;
			}else {
				for(int m : bb) {System.out.print(m);}
				break;
			}
		}
		

	}

}
