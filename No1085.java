import java.util.Scanner;

public class No1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String xywh = sc.nextLine();
		String[] spxywh = xywh.split(" ");

		int[] range = new int[4];
		range[0] = Integer.parseInt(spxywh[0]);
		range[1] = Integer.parseInt(spxywh[1]);
		range[2] = Integer.parseInt(spxywh[2]) - Integer.parseInt(spxywh[0]);
		range[3] = Integer.parseInt(spxywh[3]) - Integer.parseInt(spxywh[1]);
		
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < i; j++) {
				if(range[i]<range[j]) {
					int changer = range[j];
					range[j] = range[i];
					range[i] = changer;
				}
			}
		}	
		System.out.println(range[0]);
	}
}
