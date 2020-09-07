package java;

public class HourlyEmployee extends Employee{

	       
		public double hourlyRate;
		public int hourWorked;
		
		public HourlyEmployee(String name, String id, String designation, double hourlyRate, int hourWorked) {
			super(name, id, designation);
			this.hourlyRate = hourlyRate;
			this.hourWorked = hourWorked;
		}
		
		@Override
		public void increaseSalary(double amt) {
			this.hourlyRate+=amt;
		}

		@Override
		public double getSalary() {
			return hourlyRate*hourWorked;
		}
		
		@Override
		public void display() {
			super.display();
	        System.out.println("Rate :["+hourlyRate+"];");
		
		}
		
	}


