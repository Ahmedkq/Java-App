public class Scores {

	private double[] scores;

	public Scores(double[] scores) {

		this.scores = scores;
	}

	public double average() {
		double sum = 0;
		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		return sum / scores.length;
	}
}