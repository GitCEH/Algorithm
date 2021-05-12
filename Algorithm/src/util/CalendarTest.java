package util;

import java.util.Calendar;

/**
 * 달력 만들기
 * @author Choi Eunhye
 */
public class CalendarTest {
	
	public static final int START_DAY=1; //월에 시작하는 일자

	public void makeCal(int month) {
		//int month = 5; //현재 달
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month - 1);
		System.out.println((cal.get(Calendar.MONTH) + 1) + "월");
		int lastDay = cal.getActualMaximum(Calendar.DATE) + 1;

		System.out.println("-----------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("-----------------------------------------------------");
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		for(int tempDay = 1; tempDay < lastDay; tempDay++) {
			cal.set(Calendar.DAY_OF_MONTH, tempDay); //Calendar.DAY_OF_MONTH를 증가하는 tempDay로 설정
			//System.out.print(tempDay+"\t");
			
			switch(tempDay) {
			case START_DAY : //1의 요일까지 공백출력
				for(int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) {
					System.out.print("\t");
				}//end for i
			}//end switch
			
			System.out.printf("%d\t",tempDay);
			
			//토요일에 줄 변경
			switch(cal.get(Calendar.DAY_OF_WEEK)) { //7번이면 줄변경
			case Calendar.SATURDAY : 
				System.out.println();
			}
		}//end for
		
	}//makeCal
	
	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
		
		int month = 5;
		ct.makeCal(month);
	}

}
