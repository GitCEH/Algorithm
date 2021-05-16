package util;

import java.util.ArrayList;
import java.util.StringTokenizer;


//�Ʒ��� ���� �����͸� List�� �߰��Ͽ� ��ȯ�ϴ� method �� �ۼ��ϼ���.
//"Java-James Gosling:1995"
//"Oracle-Larry Ellison"
//"Python-Guido van Rossum:1991"
//"HTML-Tim Berners, LEE:1995"
//"JavaScript-Brandan "

//���� method�� ȣ���Ͽ��� �� ��ȯ�Ǵ� ����Ʈ�� �ް�,
//�ش� ����Ʈ�� �Է°�(arguments)���� �޾�(�Ű������� ���� �޾�) �Ʒ��� ���� ��µǴ� method�� �ۼ��ϼ���.
//
//�׸� �ٽɰ����� ���߳⵵
//Java James Gosling 1995
//Oracle Larry Ellison �˼�����.
//Python Guido van Rossum 1991
//HTML Tim Berners, LEE 1995
//JavaScript Brendan Eich �˼�����.


public class AddToList {

	public ArrayList<String> rtName() {
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Java - James Gosling : 1995");
		nameList.add("Oracle - Larry Ellison");
		nameList.add("Python - Guido van Rossum : 1991");
		nameList.add("HTML - Tim Berners, Lee : 1991");
		nameList.add("JavaScript - Brandan");
		
		return nameList;
	}
	
	public void arrName(ArrayList<String> nameList) {
		
		System.out.println("----------------------------");
		System.out.println("�׸�\t\t�ٽɰ�����\t\t\t���߳⵵");
		
		
		for(int i = 0 ; i < nameList.size(); i++) {
			String list = nameList.get(i);
			//System.out.println(list);
			
			if(list.contains(":")) {
				StringTokenizer st = new StringTokenizer(list,"-:");
				while(st.hasMoreTokens()) {
					System.out.print(st.nextToken() + "\t\t");
				}//end while
				System.out.println();
			}else {
				StringTokenizer st2 = new StringTokenizer(list,"-");
				while(st2.hasMoreTokens()) {
					System.out.print(st2.nextToken() + "\t\t");
				}//end while
				System.out.println();
			}//end if
		}
		
		
	}
	
	public static void main(String[] args) {

		AddToList atl = new AddToList();
		ArrayList<String> nameList = atl.rtName();
		System.out.println(atl.rtName());
		atl.arrName(nameList);
	}

}
