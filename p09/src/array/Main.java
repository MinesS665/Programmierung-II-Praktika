package array;

public class Main {
	
	public static void main(String[] args) {
		
		Integer[] ints = {1, 2, 3, 4};
		Double[] doubles = {2.0, 4.0, 6.0};
		
		System.out.println(average(ints));
		System.out.println(average(doubles));
	}
	
	public static <T extends Number> double average (T[] nums) {
		
		double tmp = 0;
		int count = 0;
		
		for (T num : nums) {
			count++;
			tmp += num.doubleValue();
		}
		
		return tmp/count;
	}
}
