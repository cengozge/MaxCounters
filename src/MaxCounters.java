import java.util.Arrays;

import numericalOperations.NumericalOperations;


public class MaxCounters {

	public static void main(String[] args) {
		int[] A = {3,4,4,6,1,4,4};
		System.out.println(Arrays.toString(solution(5, A)));
	}
	
	public static int[] solution(int N, int[] A){
		
		int[] counterArray = new int[N];
		
		for (int i = 0; i < A.length; i++) {
			
			int indexOfCounterArray = A[i];
			if(1 <= A[i] && A[i] <= N ){
				counterArray[indexOfCounterArray-1]++;
			}
			else{
				int max = NumericalOperations.findMaxOfArray(counterArray);
				Arrays.fill(counterArray, max);
			}
			
		}
		
		return counterArray;
		
	}

}
