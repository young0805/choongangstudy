package codetest.programmers;

public class Solution120829 {
	public int solution(int angle) {
		int result = 0;

		if (angle > 0 && angle < 90) {
			result = 1;
		} else if (angle == 90) {
			result = 2;
		} else if (angle > 90 && angle < 180) {
			result = 3;
		} else if (angle == 180) {
			result = 4;
		}

		return result;
	}
}
