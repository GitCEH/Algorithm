package programmers;

import java.util.Arrays;

public class CenterWord {

	//���α׷��ӽ�  : ��� ���� ��������
	public String getMidWord(String s) {
		String answer = "";
		
		int i = s.length()/2; //int�̹Ƿ� �Ҽ��� ���� X
		String[] sSplit = s.split(""); //�Ű������� �޾ƿ� s�� �߶� �迭�� �����
		
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
		System.out.println("��� ���� : " + cw.getMidWord(s));
	}
}
