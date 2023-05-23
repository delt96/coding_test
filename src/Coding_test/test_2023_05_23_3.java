package Coding_test;
/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

	제한 조건
	n은 10,000,000,000이하인 자연수입니다.
	입출력 예
	n	return
	12345	[5,4,3,2,1]
 */
public class test_2023_05_23_3 {
	public int[] solution(long n) {
		String sn = ""+n;
		char[] nn = sn.toCharArray();
		int len = nn.length;
        int[] answer = new int[len];
        int count = nn.length-1;
        for(int i=0 ; i<len ; i++) {
    	  answer[i] = (nn[count]-48);
    	  count--;
       }   
        return answer;
    }
	
	// 다른 사람 풀이
	public int[] solution2(long n ) {
		return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
	}
	public int[] solution3(long n) {
		 String a =""+n;
		 int [] answer = new int[a.length()];
		 int cnt = 0;
		 while(n>0) {
			 answer[cnt]= (int)(n%10);
			 n/=10;
			 cnt++;
		 }
		 return answer;
	}
}
