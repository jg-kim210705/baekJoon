import java.text.DecimalFormat;
import java.util.Scanner;

public class No6322 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");

		String n = "";
		int count = 0;

		double sqrtResult = 0;
		
		do {
			
			n = sc.nextLine();
			String[] number = n.split(" ");
			
			int a = Integer.parseInt(number[0]);
			int b = Integer.parseInt(number[1]);
			int c = Integer.parseInt(number[2]);
			
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			if (a == -1) {
				if((Math.pow(c, 2) - Math.pow(b, 2)) > 0) {
					sqrtResult = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
					System.out.printf("Triangle #%d\n",++count);
					System.out.printf("a = %s\n",df.format(sqrtResult));
					System.out.println();
					continue;
				}else {
					System.out.printf("Triangle #%d\n",++count);
					System.out.println("Impossible.");
					System.out.println();
					continue;
					}
			}else if(b==-1) {
				if((Math.pow(c, 2) - Math.pow(a, 2)) > 0) {
					sqrtResult = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
					System.out.printf("Triangle #%d\n",++count);
					System.out.printf("b = %s\n",df.format(sqrtResult));
					System.out.println();
					continue;
				}else {
					System.out.printf("Triangle #%d\n",++count);
					System.out.println("Impossible.");
					System.out.println();
					continue;
					}
			}else if(c==-1) {
				sqrtResult = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				System.out.printf("Triangle #%d\n",++count);
				System.out.printf("c = %s\n",df.format(sqrtResult));
				System.out.println();
				continue;
					}
		} while (true);
	}

}
