package Coding_test;
/*
 * ���� number�� n, m�� �־����ϴ�. number�� n�� ����̸鼭 m�� ����̸� 1�� �ƴ϶�� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.

	���ѻ���
	10 �� number �� 100
	2 �� n, m < 10
	����� ��
	number	n	m	result
	60	2	3	1
	55	10	5	0
	����� �� ����
	����� �� #1
	
	60�� 2�� ����̸鼭 3�� ����̱� ������ 1�� return�մϴ�.
	����� �� #2
	
	55�� 5�� ��������� 10�� ����� �ƴϱ� ������ 0�� return�մϴ�.
	 *
 */

public class ���ǹ��_2023_06_01_03 {
	public int solution(int number, int n, int m) {
        int answer = 0;
        if(number%n == 0 && number%m==0) {
        	answer = 1;
        }
        return answer;
    }
}
