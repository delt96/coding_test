package Coding_test;

/*
	���� ����
	�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	n�� 1000 ������ �ڿ����Դϴ�.
	����� ��
	x	n	answer
	2	5	[2,4,6,8,10]
	4	3	[4,8,12]
	-4	2	[-4, -8]
 */
public class test_2023_05_22_3 {
	public static void main(String[] args) {
		System.out.println( solution(2, 5));
	}
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i= 0; i< n ; i++) {
        	long j = i+1;
        	answer[i] = x*(j);
        }
        return answer;
    }
}
