package Coding_test;

/*
 * 0���� 9������ ���� �� �Ϻΰ� ����ִ� ���� �迭 numbers�� �Ű������� �־����ϴ�. numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

	���ѻ���
	1 �� numbers�� ���� �� 9
	0 �� numbers�� ��� ���� �� 9
	numbers�� ��� ���Ҵ� ���� �ٸ��ϴ�.
	����� ��
	numbers	result
	[1,2,3,4,6,7,8,0]	14
	[5,8,4,0,6,7,9]	6
	����� �� ����
	����� �� #1
	
	5, 9�� numbers�� �����Ƿ�, 5 + 9 = 14�� return �ؾ� �մϴ�.
	����� �� #2
	
	1, 2, 3�� numbers�� �����Ƿ�, 1 + 2 + 3 = 6�� return �ؾ� �մϴ�.
 * 
 */

public class ����_����_���ϱ�_2023_06_15_03 {
	public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0 ; i<10 ; i++) {
        	for(int j = 0 ; j< numbers.length ; j++) {
        		if(numbers[j] == i) {
        			answer += numbers[j];
        		}else {
        			answer -= numbers[j];
        		}
        	}
        }
        return answer;
    }
}
