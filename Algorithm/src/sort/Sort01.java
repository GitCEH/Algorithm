package sort;

import java.util.Arrays;

public class Sort01 {

	//�Ǽ��� �迭�� �Ű������� ���޹޾� ������������ �����ϴ� �޼ҵ带 ����
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
