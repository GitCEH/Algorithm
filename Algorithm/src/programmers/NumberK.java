package programmers;

import java.util.Arrays;

public class NumberK {

	public int[] getK(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int getK = 0;
		for(int i = 0; i < commands.length; i++) {

			int iArr = commands[i][0];
			int jArr = commands[i][1];
			int kArr = commands[i][2];
			System.out.println("i = " + iArr + ", j = " + jArr + ", k = " + kArr);

			int getSize = jArr-iArr;
			int index = 0; 
			int[] newArr = new int[getSize+1];
			
				for(int j = iArr-1; j <= jArr-1; j++) {
				//	System.out.println("j = " + array[j]);
					newArr[index] = array[j];
					//System.out.println("newArr : " + Arrays.toString(newArr));
					index++;
					//System.out.println("안쪽newArr : " + Arrays.toString(newArr));
				}
			Arrays.sort(newArr);
			System.out.println("정렬 : " + Arrays.toString(newArr));
			
			getK = newArr[kArr-1];
			System.out.println("getK : " + getK);
			System.out.println("======================");
			answer[i] = getK;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		NumberK nk = new NumberK();
		System.out.println(Arrays.toString(nk.getK(array, commands)));
		
	}

}
