package sort;


public class Sort02 {

	//������ �迭�� �Ű������� ���޹޾� �� �߿� ���� ū ���� ã�� ��ȯ�ϴ� �޼ҵ�
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
