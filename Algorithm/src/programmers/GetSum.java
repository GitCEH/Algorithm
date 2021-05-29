package programmers;

public class GetSum {

	public int realSign(int[] absolutes, boolean[] signs) {
		int answer = 123456789;

		int temp = 0;
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == false) {
				temp = absolutes[i] * (-1);
			}else {
				temp = absolutes[i];
			}
			answer += temp;
		}
		
		return answer-123456789;
	}
	
	
	public static void main(String[] args) {

		int[] absolute = {4,7,12};
		boolean[] signs = {true,false,true};
		
		GetSum gs = new GetSum();
		System.out.println(gs.realSign(absolute, signs));
		
	}

}
