package Coding_test;
import java.util.*;

/*
	 �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
	������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
	
	���ѻ���
	N�� ���� : 100,000,000 ������ �ڿ���
	����� ��
	N	answer
	123	6
	987	24
	����� �� ����
	����� �� #1
	������ ���ÿ� �����ϴ�.
	
	����� �� #2
	9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
 */
public class test_2023_05_17_4 {
    public int solution(int n) {
        int answer = 0;
        String sn = n+"";
        char[] cn = sn.toCharArray();
        for(int i=0 ; i<cn.length ; i++) {
        	answer += (cn[i]-48);  //���� �ƽ�Ű�ڵ� ������ ��ȯ�ؼ� ���� 49�� 1 
        }
        
        return answer;
    }
}
