import java.util.Scanner;

public class No4493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tt = Integer.parseInt(sc.nextLine());
		
		while(tt!=0) {
			
			int nn = Integer.parseInt(sc.nextLine());
			
			int p1count=0;
			int p2count=0;
			
			String[] p1p2 = new String[nn];
			
			for(int i = 0 ; i < nn ; i++) {

				p1p2[i]=sc.nextLine();
				
				String[] rsp = p1p2[i].split(" ");
				
				if(rsp[0].equals(rsp[1])){
					continue;
				}else if((rsp[0]+rsp[1]).equals("RP") || (rsp[0]+rsp[1]).equals("PS") || (rsp[0]+rsp[1]).equals("SR")) {
					p2count++;
				}else { p1count++; }
				
			}
				if(p1count > p2count) {
					System.out.println("Player 1");
				}else if(p1count == p2count) {
					System.out.println("TIE");
				}else { System.out.println("Player 2"); }
				
				p1count=0;
				p2count=0;
				
				tt--;
				
		}
		
	}

}
