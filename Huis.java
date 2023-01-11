import java.util.Scanner;

public class Huis {
	public String adres;
	public boolean teKoop;
	public int bouwjaar;
	public short oppervlakte;
	public double prijs;
	public char energieLabel;

	public String toString() {
		return this.adres + "\n" + this.teKoop + "\n" + this.bouwjaar  + "\n" + this.oppervlakte  + "\n" + this.prijs + "\n" + this.energieLabel;
	}
	
	public String getAddress(){
		return this.adres;
	}

	public boolean isTeKoop(){
		return this.teKoop;
	}

	public int getBouwjaar(){
		return this.bouwjaar;
	}

	public short getOppervlakte(){
		return this.oppervlakte;
	}

	public double getPrijs(){
		return this.prijs;
	}

	public char getEnergieLabel(){
		return this.energieLabel;
	}

	public void setAddress(String adres) {
		this.adres = adres;
	}

	public void setTeKoop(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Is dit huis te koop? (true/false)");
		boolean opgegevenTeKoop = scan.nextBoolean();
		this.teKoop = opgegevenTeKoop;
	}

	public void setBouwjaar(){
		Scanner scan = new Scanner(System.in);
		System.out.println("In welk jaar is dit huis gebouwd?");
		int opgegevenBouwjaar = scan.nextInt();
		this.bouwjaar = opgegevenBouwjaar;
	}

	public void setOppervlakte(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Wat is de oppervlakte van dit huis?");
		short opgegevenOppervlakte = scan.nextShort();
		this.oppervlakte = opgegevenOppervlakte;
	}

	public void setPrijs(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Wat is de prijs van dit huis?");
		double opgegevenPrijs = scan.nextDouble();
		this.prijs = opgegevenPrijs;
	}

	public void setEnergieLabel(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Wat is het energielabel van dit huis?");			
		char opgegevenLabel = scan.next().charAt(0);
		try {
			this.energieLabel = opgegevenLabel;
		} catch (Exception e) {
			System.out.println("Vul iets in.");
		}
	}

}
