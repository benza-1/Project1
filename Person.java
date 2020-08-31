
public class Person {

	private String Name;
	private double skill;
	private int gender;
	
	public Person() {
		Name="bob";
		skill=1;
		gender=2;
	}
	public Person(String Name,double skill, int gender) {
		this.Name=Name;
		this.skill=skill;
		this.gender=gender;
		
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSkill() {
		return skill;
	}

	public void setSkill(double skill) {
		this.skill = skill;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return this.getName();
		
	}
	
	
}
