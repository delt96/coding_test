package Coding_test;
/*
 * ���� ����
	���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
	
	���� ����
	s�� ���̴� 1 �̻� 5�����Դϴ�.
	s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
	s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
	s�� "0"���� �������� �ʽ��ϴ�.
	����� ��
	������� str�� "1234"�̸� 1234�� ��ȯ�ϰ�, "-1234"�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
	str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 * 
 */
public class test_2023_05_24_4 {
	static class Solution {
	    public int solution(String s) {
	        int answer= 0;
			char[] c= s.toCharArray();
			int len = c.length;

			
			
			if(s.charAt(0) == '-' || s.charAt(0) == '+' ) {
				for(int i = 1 ; i<c.length ; i++) {
					answer += (c[i]-48)* wkflcheck(len, i);
				}
	            if(c[0] == '-') answer *= -1 ;
			}else {
				for(int i=0 ;i<c.length ; i++) {
					answer += (c[i]-48) * wkflcheck(len, i);
				}
			}
			
			
			return answer;
		}
	public static int wkflcheck(int q , int i) {
			int wkfl =0;
			if(q-i == 1) {
				wkfl = 1;
			}else if(q-i == 2) {
				wkfl= 10;
			}else if(q-i == 3) {
				wkfl = 100;
			}else if(q-i ==4) {
				wkfl = 1000;
			}else if(q-i ==5) {
				wkfl = 10000;
			}
			
			return wkfl;
		}
	    
	}
}
