package Coding_test;

/*
 * ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
	n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
	
	���� ����
	n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
	����� ��
	n	return
	121	144
	3	-1
	����� �� ����
	����� ��#1
	121�� ���� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.
	
	����� ��#2
	3�� ���� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
 */
public class test_2023_05_24_3 {
	public static void main(String[] args) {
		System.out.println( solution(1012300003));
	}
	
	
	public static long solution(long n) {
		long answer = 0;
        for(long i=0 ; i<25000000 ; i++) {
            answer = -1;
       	if(i*i == n ) {
       		answer = (i+1)*(i+1);
               break;        
       	}
       }
       return answer;
   }
}
