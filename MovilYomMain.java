import java.util.ArrayList;

public class MovilYomMain {

	public static void main(String[] args) {

		//Declares Arraylists
		ArrayList<Person> boys=new ArrayList<Person>();
		ArrayList<Person> girls=new ArrayList<Person>(); 
		ArrayList<Person> people=new ArrayList<Person>();
		ArrayList<Pair> pairs=new ArrayList<Pair>();
		int counter=0;
		int randomBoy;
		int randomGirl;
		int randomBoy1;
		int randomGirl1;
		Person a=new Person("Andreas",8,1);
		Person b=new Person("Dana",4,2);
		Person c=new Person("Ben",7,1);
		Person d=new Person("Rona",5,2);
		Person e=new Person("Rob",3,1);
		Person f=new Person("Maya",9,2);
		Person g=new Person("Jon",11,1);
		Person h=new Person("Jess",1,2);
		boolean compatibale=true;

		people.add(a);
		people.add(b);
		people.add(c);
		people.add(d);
		people.add(e);
		people.add(f);
		people.add(g);
		people.add(h);


		for(Person z:people) {
			if(z.getGender()==2) {
				girls.add(z);
			}
			else
				boys.add(z);
		}



		do{
			pairs.clear();
			compatibale=true;

			while((girls.size()>0&&boys.size()>0)) {
				randomBoy=((int)(Math.random()*(boys.size())));
				randomGirl=((int)(Math.random()*girls.size()));
				Pair t=new Pair(boys.get(randomBoy),girls.get(randomGirl));
				pairs.add(t);
				boys.remove(randomBoy);
				girls.remove(randomGirl);
				if(boys.size()>girls.size()){
					randomBoy=((int)((Math.random()+1)*(boys.size())));
					
				}
			}



			for(Pair p:pairs) {
				if(p.skillLevel()>15||p.skillLevel()<10) {
					compatibale=false;

				}
			}


			if (compatibale==false) {
				for(Person z:people) {
					if(z.getGender()==2) {
						girls.add(z);
					}
					else
						boys.add(z);
				}

			}

		}while(compatibale==false);




		for(Pair pear:pairs) {
			counter++;
			System.out.println("Day"+" "+counter);
			System.out.println(pear.toString());
			System.out.println(" ");
		}




	}
}





