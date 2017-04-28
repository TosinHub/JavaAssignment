
public class Puppy {
	int puppyAge;
	
	public Puppy(String name){
		System.out.println("Name of puppy is " + name);
	}


	public void setAge( int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("Puppy age is " + puppyAge);
		return puppyAge;
	}
	

	public static void main(String[] args) {

		Puppy myPuppy = new Puppy ("Mack");

		myPuppy.setAge(3);

		myPuppy.getAge();

		System.out.println("Variable value : " + myPuppy.puppyAge);

		

	}

}
