package Coding_test;

/*
 * ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

	���� ����
	n�� 0 �̻� 3000������ �����Դϴ�.
	����� ��
	n	return
	12	28
	5	6
	����� �� ����
	����� �� #1
	12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.
	
	����� �� #2
	5�� ����� 1, 5�Դϴ�. �̸� ��� ���ϸ� 6�Դϴ�.
 */
public class test_2023_05_18_3 {
	public int solution(int n) {
        int answer = 0;
        for(int i=0 ; i<=n ; i++) {
        	for(int j=0 ; j<=n ; j++) {
        		if(i*j == n) {
        			answer+= j;
        		}
        	}
        }
        return answer;
    }
}
