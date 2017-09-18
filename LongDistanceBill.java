
public class LongDistanceBill extends PhoneBill {

	private double callRate;

		
		public LongDistanceBill() {
			super();
		}

		public LongDistanceBill(double monthlyRate, double callRate) {
			super(monthlyRate);
			this.callRate = callRate; }

			public double getCallRate() {
				return callRate;
			}

			public void setCallRate(double callRate) {
				this.callRate = callRate;
			}
		
		
		public double CalculateBill(int time) {
			return getCallRate() * time + getMonthlyRate();
		}

		
		


	
}
