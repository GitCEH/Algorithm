package util;

import java.util.HashMap;

public class Runner {

	//프로그래머스 : 완주하지 못한 선수
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        
        //getOrDefault(key,value) : 찾는 키가 존재하면 runner의 값을, 아니면 0+1을 반환한다. 
        //map
        //key : runner의 이름 || value : key가 이미 존재하면 +1, 없으면 1
        for (String runner : participant) {
            map.put(runner, map.getOrDefault(runner,0) + 1);
        }//end for
        //map
        //key : runner의 이름 || value : 이미 담겨있는 runner를 찾아 중복되면 1을 뺀다.
        // => 이미 담겨있던 runner들의 value는 0이 됨.
        for (String runner : completion) {
            map.put(runner, map.get(runner) - 1);
        }//end for
        
        //key를 찾아서 그 값이 0 이 아니면 answer에 담는다. 
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
