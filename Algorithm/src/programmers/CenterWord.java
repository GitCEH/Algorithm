package programmers;

import java.util.Arrays;

public class CenterWord {

	//프로그래머스  : 가운데 글자 가져오기
	public String getMidWord(String s) {
		String answer = "";
		
		int i = s.length()/2; //int이므로 소수점 이하 X
		String[] sSplit = s.split(""); //매개변수로 받아온 s를 잘라서 배열로 만든다
		
		System.out.println("i : " + i);
		System.out.println("sSplit : " + Arrays.toString(sSplit));
		
		
		if(s.length()%2 == 1) {
			answer = sSplit[i];
		}
		
		if(s.length()%2 == 0) {
			answer = sSplit[i-1] + sSplit[i];
		}
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {

		String s = "abcde";
		
		CenterWord cw = new CenterWord();
		System.out.println("가운데 글자 : " + cw.getMidWord(s));
	}
}
