package util;

import java.util.HashMap;

public class Runner {

	//���α׷��ӽ� : �������� ���� ����
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        
        //getOrDefault(key,value) : ã�� Ű�� �����ϸ� runner�� ����, �ƴϸ� 0+1�� ��ȯ�Ѵ�. 
        //map
        //key : runner�� �̸� || value : key�� �̹� �����ϸ� +1, ������ 1
        for (String runner : participant) {
            map.put(runner, map.getOrDefault(runner,0) + 1);
        }//end for
        //map
        //key : runner�� �̸� || value : �̹� ����ִ� runner�� ã�� �ߺ��Ǹ� 1�� ����.
        // => �̹� ����ִ� runner���� value�� 0�� ��.
        for (String runner : completion) {
            map.put(runner, map.get(runner) - 1);
        }//end for
        
        //key�� ã�Ƽ� �� ���� 0 �� �ƴϸ� answer�� ��´�. 
        for (String key : map.keySet()){
            if(map.get(key)!=0) {
                answer = key;
            }
        }
        return answer;
    }
	
	
	
	
	public static void main(String[] args) {
		
		String[] participant = {"marina","josipa","nikola","vinko","filipa"};
		String[] completion = {"josipa","filipa","marina","nikola"};
		
		Runner r = new Runner();
		System.out.println(r.solution(participant, completion));
	}

}
