package Coding_test;
/*
	 �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. 
	 ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
	
	���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.
	
	���ѻ���
	���ڿ� s�� ���� : 50 ������ �ڿ���
	���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
	����� ��
	s	answer
	"pPoooyY"	true
	"Pyy"	false
	����� �� ����
	����� �� #1
	'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.
	
	����� �� #2
	'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
	
�� ���� - 2021�� 8�� 23�� �׽�Ʈ���̽��� �߰��Ǿ����ϴ�
 */
public class test_2023_05_22_4 {
	boolean solution(String s) {
        boolean answer = true;
        char[] ss = s.toCharArray();
        int count=0;
        for(int i=0; i<ss.length;  i++) {
        	if(ss[i] == 'P' || ss[i] == 'p') {
        		count++;
        	}
        	if(ss[i] == 'Y' || ss[i] == 'y') {
        		count--;
        	}
        }
        if(count != 0) {
        	answer = false;
        }

        return answer;
    }
}
