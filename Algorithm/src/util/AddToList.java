package util;

import java.util.ArrayList;
import java.util.StringTokenizer;


//아래와 같은 데이터를 List에 추가하여 반환하는 method 를 작성하세요.
//"Java-James Gosling:1995"
//"Oracle-Larry Ellison"
//"Python-Guido van Rossum:1991"
//"HTML-Tim Berners, LEE:1995"
//"JavaScript-Brandan "

//위의 method를 호출하였을 때 반환되는 리스트를 받고,
//해당 리스트를 입력값(arguments)으로 받아(매개변수를 통해 받아) 아래와 같이 출력되는 method를 작성하세요.
//
//항목 핵심개발자 개발년도
//Java James Gosling 1995
//Oracle Larry Ellison 알수없음.
//Python Guido van Rossum 1991
//HTML Tim Berners, LEE 1995
//JavaScript Brendan Eich 알수없음.


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
		System.out.println("항목\t\t핵심개발자\t\t\t개발년도");
		
		
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
