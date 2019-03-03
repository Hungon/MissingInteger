import java.util.*;
import java.lang.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
class Solution {

	public static void main(String[] args) {
		int[] array = {1,2,3,3,11,22,33,53};
		long before = System.nanoTime();
		System.out.println(solution(array));
		Instant after = Instant.now();
		long diff = System.nanoTime() - before;
		long elapsedInMs = diff/1000000;
		long leftInMs = diff%1000000;
		System.out.println("run time: "+elapsedInMs+"."+leftInMs+" ms");
 	}

	public static int solution(int[] arrayInt) {
		int arrayIntLength = arrayInt.length;
		boolean [] dummy = new boolean[arrayIntLength + 1];
		int dummyLength = dummy.length;

		for (int i = 0; i < arrayIntLength; i++) {
			if (arrayInt[i] > 0 && arrayInt[i] < dummyLength) {
				dummy[arrayInt[i]] = true;
			}
		}
		for (int i = 1; i < dummyLength; i++) {
			if (dummy[i] == false) {
				return i;
			}
		}
		return dummyLength;
	}
}
