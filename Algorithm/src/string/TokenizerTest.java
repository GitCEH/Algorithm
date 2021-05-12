package string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerTest {
	
//	1.문자열을 입력받고, String[]을 반환하는 method를 만들고
//
//	아래와 같은 데이터를 위에서 정의한 argruments(입력값)로 입력한다. (반드시 아래와 같을 것)
//	"봉천, 신림,신대방,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구"
//
//	method안에서
//	1_1. 신대방역 ,뒤에 "구로디지털 단지" 역을 추가 한다. 
//	  - 추가된 후 데이터형태 : 
//	("봉천, 신림,신대방,구로디지털 단지,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구")
//	1_2. 데이터 사이에 존재하는 공백을 제거한다. 
//	  - 공백제거후 데이터 형태 
//	("봉천,신림,신대방,구로디지털단지,대림.신도림,문래,영등포구청,당산,합정,홍대입구")
//	1_3. 입력데이터를 거꾸로 배열에 넣어 반환한다.
//	  - 배열에 들어있는 형태 
//	("홍대입구,합정,당산,영등포구청,문래,신도림,대림,구로디지털단지,신대방,신림봉천")
	
	public String[] stationArray() {
		String[] stationArr = null;
		String station = "봉천, 신림,신대방,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구";
		
		StringBuilder sb = new StringBuilder(station);
		//'신'의 앞쪽 커서부터 출발 => , 뒤의 위치는 +4
		
		System.out.println("------------------------------");
		System.out.println("1_1번");
		System.out.println("------------------------------");
		if(station.contains("신대방")) {
			//신대방역이 존재한다면 구디역 추가
			//System.out.println(station.indexOf("신대방"));
			sb.insert(sb.indexOf("신대방")+4,"구로디지털 단지,");
		}//end if
		
		station=sb.toString();
		System.out.println(station);
		
		System.out.println("------------------------------");
		System.out.println("1_2번");
		System.out.println("------------------------------");
		//공백제거 (white space를 찾아 empty로 변경=>replace() 혹은 replaceAll() )
		station=station.replace(" ","");
		System.out.println(station);
		
		//역명만 자르기
		StringTokenizer st = new StringTokenizer(station,",.");
		stationArr = new String[st.countTokens()]; // 토큰의 수 만큼 방을 만든다(데이터는 들어있지않음)
		
		
		int idx = stationArr.length-1; // 길이이므로 인덱스화를 위해 1을 빼서 0 ~ 10 (11개)
		while(st.hasMoreTokens()) {
			//idx = 10인 상태
			//statinArr의 10번째 방에 "봉천"을 넣는다.
			stationArr[idx] = st.nextToken();
			//index의 값을 하나씩 빼며 9,8,7...방에 나머지 역들을 넣는다.
			idx--;
		}//end while
		
		System.out.println("------------------------------");
		System.out.println("1_3번");
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(stationArr));
		return stationArr;
	}
	
	//2. 배열을 입력받아 다음과 같이 출력한다.
	// 역 명
	// -------
	// 홍대입구
	//   .
	//   .
	//  봉천
	// -------
	public void readStation(String[] station) {
		System.out.println("------------");
		System.out.println("역	명");
		System.out.println("------------");
		for(int i = 0; i < station.length; i++) {
			System.out.println(station[i]);
		}//end for
	}
	
	//2번의 반대로 출력해보기
	public void reverseStation(String[] station) {
		System.out.println("------------");
		System.out.println("역	명 (원래대로)");
		System.out.println("------------");
		for(int i = station.length-1; i >= 0; i--) {
			System.out.println(station[i]);
		}//end for
	}
	

	public static void main(String[] args) {
		TokenizerTest test = new TokenizerTest();

		//return한값이 담김
		String[] station = test.stationArray();
		
		test.stationArray();
		test.readStation(station);
		test.reverseStation(station);
		
	}

}
