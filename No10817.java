import java.util.Scanner;

public class No10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sel = new String[3];
		String a = "";

		a = sc.nextLine();
		sel = a.split(" ");

		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if(Integer.parseInt(sel[i])<Integer.parseInt(sel[j])) {
					int changer = Integer.parseInt(sel[j]);
					sel[j] = sel[i];
					sel[i] = changer+"";
				}
			}
		}
		System.out.println(sel[1]);
	}
}
