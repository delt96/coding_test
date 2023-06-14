package Coding_test;

/*
 * �� �����ϱ� 1
���� ����
	���� n�� ���ڿ� control�� �־����ϴ�. control�� "w", "a", "s", "d"�� 4���� ���ڷ� �̷���� ������, control�� �տ������� ������� ���ڿ� ���� n�� ���� �ٲߴϴ�.
	
	"w" : n�� 1 Ŀ���ϴ�.
	"s" : n�� 1 �۾����ϴ�.
	"d" : n�� 10 Ŀ���ϴ�.
	"a" : n�� 10 �۾����ϴ�.
	�� ��Ģ�� ���� n�� �ٲ��� �� ���� �������� ������ n�� ���� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
	
	���ѻ���
	-100,000 �� n �� 100,000
	1 �� control�� ���� �� 100,000
	control�� ���ĺ� �ҹ��� "w", "a", "s", "d"�� �̷���� ���ڿ��Դϴ�.
	����� ��
	n	control	result
	0	"wsdawsdassw"	-1
	����� �� ����
	����� �� #1
	
	�� n�� control�� ���� ������ ���� ������ ���ϰ� �˴ϴ�.
	0 �� 1 �� 0 �� 10 �� 0 �� 1 �� 0 �� 10 �� 0 �� -1 �� -2 �� -1
	���� -1�� return �մϴ�.
 * 
 */
public class ��_�����ϱ�_1_2023_06_14_2 {
	public int solution(int n, String control) {
        int answer = n;
        char[] controlC= control.toCharArray();
        for(int i=0 ; i<controlC.length ; i++) {
        	if(controlC[i] == 'w') {
        		answer++;
        	}else if(controlC[i] == 's') {
        		answer--;
        	}else if(controlC[i] == 'd') {
        		answer += 10;
        	}else {
        		answer -= 10;
        	}
        }
        return answer;
    }
}
