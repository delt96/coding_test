package Coding_test;
/*
 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

	���� ����
	n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
	����� ��
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
