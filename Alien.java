public class Alien {

	private String name;
	private int age;
	private String homePlanet;
	private boolean armed;
	private String colour;

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public String getHomePlanet(){
		return this.homePlanet;
	}

	public boolean isArmed(){
		return this.armed;
	}

	public String getColour(){
		return this.colour;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setHomePlanet(String homePlanet){
		this.homePlanet = homePlanet;
	}

	public void setArmed(boolean armed){
		this.armed = armed;
	}

	public void setColour(String colour){
		this.colour = colour;
	}
}


