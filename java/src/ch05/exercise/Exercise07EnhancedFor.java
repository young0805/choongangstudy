package ch05.exercise;

public class Exercise07EnhancedFor {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		
		int max = Integer.MIN_VALUE;
		
		for (int n : array) {
			if (n > max) {
				max = n;
			}
		}
		
		//최대값
		System.out.println(max);
		//최대값이 있는 index
		
	}
}





