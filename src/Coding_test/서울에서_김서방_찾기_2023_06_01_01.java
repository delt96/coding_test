package Coding_test;

/*
 * 
 * String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

	���� ����
	seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
	seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
	"Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
	����� ��
	seoul	return
	["Jane", "Kim"]	"�輭���� 1�� �ִ�"
 */
public class ���￡��_�輭��_ã��_2023_06_01_01 {
	 public String solution(String[] seoul) {
	        String answer = "";
	        int seoulLen= seoul.length;
	        for(int i=0 ; i< seoulLen ; i++) {
	        	if(seoul[i].equals("kim")) {
	        		answer = "�輭���� " +i+"�� �ִ�";
	        		break;
	        	}
	        }
	        return answer;
	    }	
}
