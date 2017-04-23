package lesson1;

public class Puppy {
	public static int puppyAge;
	
	public Puppy(String name){
		System.out.println("Name of puppy is " + name);
	}


	public static void setAge( int age){
		puppyAge = age;
	}

	public static int getAge(){
		System.out.println("Puppy age is " + puppyAge);
		return puppyAge;
	}
	

}
