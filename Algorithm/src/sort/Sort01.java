package sort;

import java.util.Arrays;

public class Sort01 {

	//실수형 배열을 매개변수로 전달받아 오름차순으로 정렬하는 메소드를 정의
	public double[] sort(double[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//end if
			}//end for j
		}//end for i
		
		return arr;
	}//sort
	
	public static void main(String[] args) {
		
		double[] arr = { 5.0 , 4.0 , 3.0 , 2.0 , 1.0 };
		
		Sort01 s = new Sort01();
		System.out.println(Arrays.toString(s.sort(arr)));
	}

}
