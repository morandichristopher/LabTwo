package labproject2.prob1;

public class TestWeeklyTemps {

	public static void main(String[] args) {
		double[] testTemps = {32.5, 88.3, 0.3, 100.3, 56.3, 23.5, 99.3};
		
		WeeklyTemps lastWeek = new WeeklyTemps();
		System.out.println("Weekly temperature data (degrees F)");
		
		System.out.println("\tmax:\t" + lastWeek.getMax(testTemps));
		
		System.out.println("\tmin:\t" + lastWeek.getMin(testTemps));
		
		System.out.println("\trange:\t" + lastWeek.getRange(testTemps));
		
		System.out.println("\tmean:\t" + lastWeek.getMean(testTemps));
		
		System.out.println("\textreme temp days: " + lastWeek.getExtreme(testTemps));
		
		
	}

}
