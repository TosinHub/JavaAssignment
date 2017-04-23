
public class FooCorporation {

	//double salary;
	//double basePay;
	//double hoursWorked;
	String employeeName;





	public FooCorporation(String employee ) {
		employeeName = employee;
		
		
		System.out.println("The salary details for " + employee);
	}




		public void getSalary( double basePay, double hoursWorked ){
			// basePay = basePay;
			// hoursWorked = hoursWorked;
			 
			
		
		if(basePay < 8 ){
			System.out.println("Minimum base pay is $8. You can't pay " + employeeName+ " less"  );
	
		}
		else if(hoursWorked > 60) 
		{
			System.out.println("Approved number of working hours for " + employeeName + " already exceeded ");
		}
		else if (hoursWorked <= 40)
			{
				double salary = hoursWorked * basePay ;
				System.out.println("Salary for " + employeeName + " is " + salary + "" );
			}else if (hoursWorked > 40){
				double extraTime = hoursWorked - 40 ;
				double salary = extraTime * 1.5 + hoursWorked * basePay;
				System.out.println("Salary for " + employeeName + " is $" + salary + "" );
			}
	
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		/*	Employee 1 $7.50 35 
		 * 	Employee 2 $8.20 47 
		 * Employee 3 $10.00 73
		 */
			FooCorporation Employee1 = new FooCorporation("Jack");

			Employee1.getSalary(7.50, 35);
			
			FooCorporation Employee2 = new FooCorporation("Moore");

			Employee2.getSalary( 8.20, 47);
			
			FooCorporation Employee3 = new FooCorporation("Tracy");

			Employee3.getSalary( 10.00, 73);
			
			
		}
		
		
	}

			
			
