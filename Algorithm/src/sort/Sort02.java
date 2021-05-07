package sort;


public class Sort02 {

	//정수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아 반환하는 메소드
	public int sort(int[] arr) {
		int maxNum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}//end for i
		
		
		return maxNum;
	}
	
	
	public static void main(String[] args) {
		
		//int[] arr = {4,9,2,1,4,6};
		//int[] arr = {0,2,5,8,3,11};
		int[] arr = {5,4,3,2,1,0};
		
		Sort02 s = new Sort02();
		System.out.println(s.sort(arr));
		
	}

}
