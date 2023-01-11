public class OOPApp {
	public static void main(String[] args){

		Alien alien1 = new Alien();

		alien1.setName("Zaphod Beeblebrox");
		alien1.setAge(32);
 		alien1.setHomePlanet("The fifth planet of Betelgeuse");
		alien1.setArmed(true);
		alien1.setColour("Mostly blue");

		System.out.println(alien1.getName());
		System.out.println(alien1.getAge());
		System.out.println(alien1.getHomePlanet());
		System.out.println(alien1.isArmed());
		System.out.println(alien1.getColour());
	
	}
}