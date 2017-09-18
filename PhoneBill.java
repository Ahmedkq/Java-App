
public abstract class PhoneBill {
			
		private double monthlyRate;
		
		public PhoneBill() {
			super();
		}

		public PhoneBill(double monthlyRate) {
			this.monthlyRate = monthlyRate;
		}
		
		public double getMonthlyRate(){
			return monthlyRate;
		}
		
		public void setMonthlyRate(double monthlyRate) {
			this.monthlyRate = monthlyRate;
		}
		
		
		
		public abstract double CalculateBill(int time);


	}


