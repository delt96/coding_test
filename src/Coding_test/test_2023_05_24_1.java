package Coding_test;

/*
 * ���̰� ���� �� ���ڿ� str1�� str2�� �־����ϴ�.

	�� ���ڿ��� �� ���ڰ� �տ������� ���� �����ư��鼭 �� ���� �����ϴ� ���ڿ��� ����� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
	
	���ѻ���
	1 �� str1�� ���� = str2�� ���� �� 10
	str1�� str2�� ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��Դϴ�.
	����� ��
	str1	str2	result
	"aaaaa"	"bbbbb"	"ababababab"
 */


public class test_2023_05_24_1 {	
	public String solution(String str1, String str2) {
        String answer = "";
        int len = str1.length();
        for(int i=0 ; i<len ; i++) {
        	answer += ""+str1.charAt(i)+ str2.charAt(i);
        }
        return answer;
    }
}
