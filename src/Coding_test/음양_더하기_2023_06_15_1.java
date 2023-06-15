package Coding_test;


/*
 * � �������� �ֽ��ϴ�. �� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�. ���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	
	���ѻ���
	absolutes�� ���̴� 1 �̻� 1,000 �����Դϴ�.
	absolutes�� ��� ���� ���� 1 �̻� 1,000 �����Դϴ�.
	signs�� ���̴� absolutes�� ���̿� �����ϴ�.
	signs[i] �� ���̸� absolutes[i] �� ���� ������ �������, �׷��� ������ �������� �ǹ��մϴ�.
	����� ��
	absolutes	signs	result
	[4,7,12]	[true,false,true]	9
	[1,2,3]	[false,false,true]	0
	����� �� ����
	����� �� #1
	
	signs�� [true,false,true] �̹Ƿ�, ���� ������ ���� ���� 4, -7, 12�Դϴ�.
	���� �� ���� ���� 9�� return �ؾ� �մϴ�.
	����� �� #2
	
	signs�� [false,false,true] �̹Ƿ�, ���� ������ ���� ���� -1, -2, 3�Դϴ�.
	���� �� ���� ���� 0�� return �ؾ� �մϴ�.
 */
public class ����_���ϱ�_2023_06_15_1 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0 ; i<absolutes.length ; i++) {
        	if(signs[i]){
        		 answer += absolutes[i];
        	}else {
        		answer -= absolutes[i];
        	}
        }
        
        return answer;
    }
}
