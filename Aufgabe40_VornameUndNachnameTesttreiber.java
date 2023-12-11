import java.util.Scanner;
public class Aufgabe40_VornameUndNachnameTesttreiber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int groesseArray = sc.nextInt();
		// Arrayerzeugung
		Aufgabe40_VornameUndNachname namen[] = new Aufgabe40_VornameUndNachname [groesseArray];
		// Objekterzeugung pro Element
		for(int i = 0; i<groesseArray;i++) {
			namen[i] = new Aufgabe40_VornameUndNachname();
		}
//		namen[0] = new Aufgabe40_VornameUndNachname();
//		namen[1] = new Aufgabe40_VornameUndNachname();
		
		// Zugriff auf ein Element
		for(int i = 0; i<groesseArray; i++) {
			namen[i].setVorname(sc.next());
			namen[i].setNachname(sc.next());
		}
//		namen[0].setVorname("Peter");
//		namen[0].setNachname("Pan");
//		System.out.println(namen[0].toString());
		for(int i = 0; i<namen.length;i++) {
			System.out.println(namen[i].toString());

		}
		for(Aufgabe40_VornameUndNachname e:namen) {
			System.out.println(e.toString());
		}
	}
}
