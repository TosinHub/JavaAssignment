class Marathon {
	
	public static void main (String[] arguments){
		String[] names ={
		"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
		"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
		"Aaron", "Kate"
		};
		int[] times = new int []{
		341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
		343, 317, 265
		};
		/*	for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+ ": " + times[i]);
			
			} */
			
			int fastestTime  = times[0];
			int smallestTime = times[0];
			String  Runner = names[0];
			//String  Runner1 = names[0];
			
			
			for (int i = 1; i < times.length; i++){
				
				if(times[i] > fastestTime )
					fastestTime = times[i];
					 Runner = names[i];			
					
				if(times[i] < smallestTime)
					smallestTime = times[i];
					// Runner1 = names[i];
									
				
				}
			//System.out.println("The fastest runner is " + Runner + " with running time  " + fastestTime);
			
			System.out.println("The slowest runner is " + Runner + " with running time  " + smallestTime);
				
			
			
			
			
		}
	
	
}