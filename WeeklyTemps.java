package labproject2.prob1;

public class WeeklyTemps {

	// double[] temps = new double[7];
	
	
	
	public double getMax(double[] temps) {
		// implement getMax
		// double max = 0.0;
		// i.e. for (int i = 0;...)
		// if (temps[i] > max){
		//     max=temps[i];
		// }
		// return max
		
		double maxTemp = temps[0]; 
		
		for(int i=1; i<temps.length; i++){
		      if(temps[i] > maxTemp) {
		        maxTemp = temps[i];
		
		      }
		}
		
		//System.out.print("The max temp is: ");
		
		return maxTemp;
		
	}
	
	public double getMin(double[] temps) {
		/**
		 * 
		 */
		
		double minTemp = temps [0];
		
		for(int i=1; i<temps.length; i++){
		      if(temps[i] < minTemp) {
		        minTemp = temps[i];
		
		      }
		}
		
		
		//System.out.print("The min temp is: ");
		
		return minTemp;
	
	}
	
	public String getRange(double[] temps) {
		/**
		 * TODO: iterate through and build string
		 * 
		 * double min = getMin(temps);
		 * double max = getMax(temps);
		 * 
		 * String range = String.format("%.1f - %.1f", min, max)
		 * 
		 * return range;
		 */
		
		double min = getMin(temps);
		double max = getMax(temps);
		
		String range = String.format("%.1f - %.1f", min, max);
		
		
		return range;
	}
	
	public double getMean(double[] temps) {
		/**
		 * TODO: iterate through temps, calculate mean
		 * return mean
		 * 
		 * double mean =m0.0;
		 * 
		 * for(int i = 0, ...) {
		 * sum += temps[i];
		 * }
		 * 
		 * double mean = sum/temps.length;
		 * 
		 * return mean;
		 * 
		 */
		double mean = 0.0;
		double sum = 0.0;
		for(int i = 0; i < temps.length; i++) {
			sum += temps[i];
		}
		
		mean = sum/temps.length;
		
		return mean;
	}
	
	public int getExtreme(double[] temps) {
		/**
		 * TODO: count elements in extreme range
		 * 
		 * int count = 0;
		 * for(i = 0, ...){
		 * if(...){
		 * count +=1;
		 * }
		 * }
		 * return count;
		 */
		
		int count = 0;
		for(int i = 0; i < temps.length; i++) {
			if(temps[i] <= 5 || temps[i] >= 95) {
				count++;
			}
		}
		
		return count;
		
	}
	}
