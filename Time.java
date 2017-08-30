import java.util.Calendar;
import java.util.Date;

public class Time {

	public static void main(String[] args) {

		Date d = new Date();
		long diff = d.getTime();
		long sec = 1000;
		long min = sec * 60;
		long hours = min * 60;

		long elapsedHrs = diff / hours;
		diff = diff % hours;

		long elapsedMins = diff / min;
		diff = diff % min;

		long elapsedSecs = diff / sec;
		System.out.print("At the execution of this program, system local time is ");
		System.out.println(Calendar.getInstance().getTime());
		System.out.printf("Time Elapsed since Unix Epoch Time : Hours: %d Minutes: %d Seconds: %d%n", elapsedHrs,
				elapsedMins, elapsedSecs);

	}

}
