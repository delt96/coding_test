package Coding_test;
/*
 * ���� num�� n�� �Ű� ������ �־��� ��, num�� n�� ����̸� 1�� return n�� ����� �ƴ϶�� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.

	���ѻ���
	2 �� num �� 100
	2 �� n �� 9
	����� ��
	num	n	result
	98	2	1
	34	3	0
	����� �� ����
	����� �� #1
	
	98�� 2�� ����̹Ƿ� 1�� return�մϴ�.
	����� �� #2
	
	32�� 3�� ����� �ƴϹǷ� 0�� return�մϴ�.
 */
public class n�ǹ��_2023_06_01_02 {
	public int solution(int num, int n) {
        int answer = 0;
        if(num%n == 0) {
        	answer = 1;
        }
        return answer;
    }
}
