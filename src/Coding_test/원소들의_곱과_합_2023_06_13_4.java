package Coding_test;

/*
 * ������ ��� ����Ʈ num_list�� �־��� ��, ��� ���ҵ��� ���� ��� ���ҵ��� ���� �������� ������ 1�� ũ�� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	
	���ѻ���
	2 �� num_list�� ���� �� 10
	1 �� num_list�� ���� �� 9
	����� ��
	num_list	result
	[3, 4, 5, 2, 1]	1
	[5, 7, 8, 3]	0
	����� �� ����
	����� �� #1
	
	��� ������ ���� 120, ���� ������ 225�̹Ƿ� 1�� return�մϴ�.
	����� �� #2
	
	��� ������ ���� 840, ���� ������ 529�̹Ƿ� 0�� return�մϴ�.
 */
public class ���ҵ���_����_��_2023_06_13_4 {
	 public int solution(int[] num_list) {
	        int answer = 0;
	        int sum =0;
	        int mul =1;
	        for(int i=0 ; i<num_list.length ;i++) {
	            mul *= num_list[i];
	            sum += num_list[i];
	        }
	        if((sum*sum) > mul) answer =1;
	        return answer;
	    }
}
