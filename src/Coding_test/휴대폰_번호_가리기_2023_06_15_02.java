package Coding_test;

/*
 * ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
	��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	phone_number�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
	����� ��
	phone_number	return
	"01033334444"	"*******4444"
	"027778888"	"*****8888"
 */
public class �޴���_��ȣ_������_2023_06_15_02 {
	 public String solution(String phone_number) {
	        String answer = "";
	        for(int i= 0 ; i< phone_number.length(); i++) {
	        	if(i > phone_number.length()-4) {
	        		answer += phone_number.charAt(i);
	        	}else {
	        		answer += "*";
	        	}
	        }
	        return answer;
	    }	
}
