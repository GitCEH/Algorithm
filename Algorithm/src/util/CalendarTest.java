package util;

import java.util.Calendar;

/**
 * �޷� �����
 * @author Choi Eunhye
 */
public class CalendarTest {
	
	public static final int START_DAY=1; //���� �����ϴ� ����

	public void makeCal(int month) {
		//int month = 5; //���� ��
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month - 1);
		System.out.println((cal.get(Calendar.MONTH) + 1) + "��");
		int lastDay = cal.getActualMaximum(Calendar.DATE) + 1;

		System.out.println("-----------------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("-----------------------------------------------------");
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		for(int tempDay = 1; tempDay < lastDay; tempDay++) {
			cal.set(Calendar.DAY_OF_MONTH, tempDay); //Calendar.DAY_OF_MONTH�� �����ϴ� tempDay�� ����
			//System.out.print(tempDay+"\t");
			
			switch(tempDay) {
			case START_DAY : //1�� ���ϱ��� �������
				for(int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) {
					System.out.print("\t");
				}//end for i
			}//end switch
			
			System.out.printf("%d\t",tempDay);
			
			//����Ͽ� �� ����
			switch(cal.get(Calendar.DAY_OF_WEEK)) { //7���̸� �ٺ���
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
