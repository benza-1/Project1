
public class Pair {
	private Person a;
	private Person b;
	
	public Pair() {
		
		a=new Person();
		b=new Person();
	}
	
	public Pair(Person a,Person b) {
	
	this.a=a;
	this.b=b;
	}
	public Person getB() {
		return b;
	}
	public void setB(Person b) {
		this.b = b;
	}

	public Person getA() {
		return a;
	}

	public void setA(Person a) {
		this.a = a;
	}
	
	public String toString() {
		
		return a.toString()+" "+b.toString();
	}
	
	public double skillLevel() {
		
		return this.a.getSkill()+this.b.getSkill();
		
	}

	
		
		
		
	}
	
	
	
	

