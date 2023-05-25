package Coding_test;
/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

	제한 조건
	n은 1이상 8000000000 이하인 자연수입니다.
	입출력 예
	n	return
	118372	873211 
 */
public class test_2023_05_25_3 {
	 public long solution(long n) {
	        long answer = 0;
	        String sn = Long.toString(n);
	        char[] cn = sn.toCharArray();
	        char tmp;
	        
	        for(int i=0 ;i<cn.length; i++) {
	        	for(int j= i+1 ; j<cn.length ; j++) {
	        		if(cn[j]> cn[i]) {
	        			tmp = cn[j];
	        			cn[j] = cn[i];
	        			cn[i] =tmp;
	        		}
	        	}
	        }
	        String s = "";
	        for(int i=0 ; i <cn.length ; i++) {
	        	s += cn[i];
	        }
        	answer = Long.parseLong(s);
	        return answer;
	    }	
}
