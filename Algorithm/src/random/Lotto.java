package random;

import java.util.ArrayList;

public class Lotto {

	//�ζǹ�ȣ �����ϱ�
	//�ζǹ�ȣ�� ���ʽ� ��ȣ���� �� 7���� ���ڸ� ����Ѵ�.
	//�� 45���� ���ڸ� ���� �� �ִ� ���� �迭�� ������ �� �ݺ����� ����� ���ڸ� �ִ´�.
	//math.random�� ����� ������ ���ڸ� ����Ʈ�� ��´�. (�ߺ����� �ʿ�) 
	
	public ArrayList<Integer> lottoGen() {
		ArrayList<Integer> lottoNum = new ArrayList<Integer>();
		
		int[] num = new int[45];
		for(int i = 0; i < 45; i++) {
			num[i] = i+1;
		}//end for
		
		while(!(lottoNum.size() == 7)) {
			int random = (int)(Math.random() * 45);
			if(!lottoNum.contains(num[random])) {
				lottoNum.add(num[random]);
			}
		}
		
		return lottoNum;
	}//lottoNum
	
	
	public static void main(String[] args) {
		Lotto l = new Lotto();
		System.out.println(l.lottoGen());
	}

}
