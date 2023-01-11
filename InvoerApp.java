import java.util.Scanner;

public class InvoerApp {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Typ een woord in: ");
		String s = scan.nextLine();
		System.out.print("Geef de index van de letter die je graag wil zien: ");
		int index = scan.nextInt();
		
		try {
			char c = s.charAt(index);
			System.out.print("Character at index " + index + " is " + c);
		} catch (Exception e) {
			System.out.print("Gekozen index bestaat niet. Programma stopt."); 
		}
		
	}
}