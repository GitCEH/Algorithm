package random;

import java.util.ArrayList;

public class Lotto {

	//로또번호 생성하기
	//로또번호는 보너스 번호까지 총 7개의 숫자를 출력한다.
	//총 45개의 숫자를 담을 수 있는 정수 배열을 생성한 뒤 반복문을 사용해 숫자를 넣는다.
	//math.random을 사용해 무작위 숫자를 리스트에 담는다. (중복방지 필요) 
	
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
