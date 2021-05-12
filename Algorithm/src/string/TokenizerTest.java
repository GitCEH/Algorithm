package string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerTest {
	
//	1.���ڿ��� �Է¹ް�, String[]�� ��ȯ�ϴ� method�� �����
//
//	�Ʒ��� ���� �����͸� ������ ������ argruments(�Է°�)�� �Է��Ѵ�. (�ݵ�� �Ʒ��� ���� ��)
//	"��õ, �Ÿ�,�Ŵ��,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�"
//
//	method�ȿ���
//	1_1. �Ŵ�濪 ,�ڿ� "���ε����� ����" ���� �߰� �Ѵ�. 
//	  - �߰��� �� ���������� : 
//	("��õ, �Ÿ�,�Ŵ��,���ε����� ����,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�")
//	1_2. ������ ���̿� �����ϴ� ������ �����Ѵ�. 
//	  - ���������� ������ ���� 
//	("��õ,�Ÿ�,�Ŵ��,���ε����д���,�븲.�ŵ���,����,��������û,���,����,ȫ���Ա�")
//	1_3. �Էµ����͸� �Ųٷ� �迭�� �־� ��ȯ�Ѵ�.
//	  - �迭�� ����ִ� ���� 
//	("ȫ���Ա�,����,���,��������û,����,�ŵ���,�븲,���ε����д���,�Ŵ��,�Ÿ���õ")
	
	public String[] stationArray() {
		String[] stationArr = null;
		String station = "��õ, �Ÿ�,�Ŵ��,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�";
		
		StringBuilder sb = new StringBuilder(station);
		//'��'�� ���� Ŀ������ ��� => , ���� ��ġ�� +4
		
		System.out.println("------------------------------");
		System.out.println("1_1��");
		System.out.println("------------------------------");
		if(station.contains("�Ŵ��")) {
			//�Ŵ�濪�� �����Ѵٸ� ���� �߰�
			//System.out.println(station.indexOf("�Ŵ��"));
			sb.insert(sb.indexOf("�Ŵ��")+4,"���ε����� ����,");
		}//end if
		
		station=sb.toString();
		System.out.println(station);
		
		System.out.println("------------------------------");
		System.out.println("1_2��");
		System.out.println("------------------------------");
		//�������� (white space�� ã�� empty�� ����=>replace() Ȥ�� replaceAll() )
		station=station.replace(" ","");
		System.out.println(station);
		
		//���� �ڸ���
		StringTokenizer st = new StringTokenizer(station,",.");
		stationArr = new String[st.countTokens()]; // ��ū�� �� ��ŭ ���� �����(�����ʹ� �����������)
		
		
		int idx = stationArr.length-1; // �����̹Ƿ� �ε���ȭ�� ���� 1�� ���� 0 ~ 10 (11��)
		while(st.hasMoreTokens()) {
			//idx = 10�� ����
			//statinArr�� 10��° �濡 "��õ"�� �ִ´�.
			stationArr[idx] = st.nextToken();
			//index�� ���� �ϳ��� ���� 9,8,7...�濡 ������ ������ �ִ´�.
			idx--;
		}//end while
		
		System.out.println("------------------------------");
		System.out.println("1_3��");
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(stationArr));
		return stationArr;
	}
	
	//2. �迭�� �Է¹޾� ������ ���� ����Ѵ�.
	// �� ��
	// -------
	// ȫ���Ա�
	//   .
	//   .
	//  ��õ
	// -------
	public void readStation(String[] station) {
		System.out.println("------------");
		System.out.println("��	��");
		System.out.println("------------");
		for(int i = 0; i < station.length; i++) {
			System.out.println(station[i]);
		}//end for
	}
	
	//2���� �ݴ�� ����غ���
	public void reverseStation(String[] station) {
		System.out.println("------------");
		System.out.println("��	�� (�������)");
		System.out.println("------------");
		for(int i = station.length-1; i >= 0; i--) {
			System.out.println(station[i]);
		}//end for
	}
	

	public static void main(String[] args) {
		TokenizerTest test = new TokenizerTest();

		//return�Ѱ��� ���
		String[] station = test.stationArray();
		
		test.stationArray();
		test.readStation(station);
		test.reverseStation(station);
		
	}

}
