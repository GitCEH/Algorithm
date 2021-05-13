package util;

public class Fee {

	/*
	 대중교통을 이동거리를 입력받아 아래 요금표로 요금을 계산하여 출력
	 	— 이동거리는 10km를 초과했을 때 매 5km마다 100원의 초과요금을 더하여 계산
	    — 출력
	    입력교통 수단 XX 이동거리 XXkm 기본요금 XX원 총 요금 XX원 입니다.
	    입력 교통수단이 "마을버스, 버스, 지하철"인 경우 위의 출력을 하고, 그렇지 않다면 
	    "대중교통수단이 아닙니다."를 출력.
	    
	    마을 850 / 버스 1250 / 지하철 1350
	*/
	
	
	public static final int TOWN_BUS = 850;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1350;
	
	
	public void busFee(String transport, int distance) {
		
		if(transport.equals("마을버스") || transport.equals("버스") || transport.equals("지하철")) {
			System.out.println(transport + "을(를) 타고 " + distance + "km를 이동하였습니다.");
		}//end if
		
		//int overChk = distance%10;
		if(distance > 10) {
			switch(transport) {
			case "마을버스" : System.out.println("이용한 교통수단 : " + transport + ", 이동거리 : " + distance + "km, 요금 : " + ((((distance-10)/5) * 100) + TOWN_BUS) + "원 입니다."); break;
			case "버스" : System.out.println("이용한 교통수단 : " + transport + ", 이동거리 : " + distance + "km, 요금 : " + ((((distance-10)/5) * 100) + BUS) + "원 입니다."); break;
			case "지하철" : System.out.println("이용한 교통수단 : " + transport + ", 이동거리 : " + distance + "km, 요금 : " + ((((distance-10)/5) * 100) + SUBWAY) + "원 입니다."); break;
			default : System.out.println("대중교통 수단이 아닙니다.");
			}
		} else {
			switch(transport) {
			case "마을버스" : System.out.println("이용한 교통수단 : " + transport + ", 이동거리 : " + distance + "km, 요금 : " + TOWN_BUS + "원 입니다."); break; 
			case "버스" : System.out.println("이용한 교통수단 : " + transport + ", 이동거리 : " + distance + "km, 요금 : " + BUS + "원 입니다."); break;
			case "지하철" : System.out.println("이용한 교통수단 : " + transport + ", 이동거리 : " + distance + "km, 요금 : " + SUBWAY + "원 입니다."); break;
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {

		String transport = "버스";
		int distance = 5;
		
		Fee fee = new Fee();
		fee.busFee(transport,distance);
	}

}
