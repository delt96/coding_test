package Coding_test;

/*
 * ���� ����Ʈ num_list�� �־��� ��, ������ ���Ұ� ���� ���Һ��� ũ�� ������ ���ҿ��� ���� ���Ҹ� �� ���� ������ ���Ұ� ���� ���Һ��� ũ�� �ʴٸ� ������ ���Ҹ� �� ���� ���� �߰��Ͽ� return�ϵ��� solution �Լ��� �ϼ����ּ���.

	���ѻ���
	2 �� num_list�� ���� �� 10
	1 �� num_list�� ���� �� 9
	����� ��
	num_list	result
	[2, 1, 6]	[2, 1, 6, 5]
	[5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]
	����� �� ����
	����� �� #1
	
	������ ������ 6�� ���� ������ 1���� ũ�� ������ 6 - 1�� 5�� �߰��� return�մϴ�.
	����� �� #2
	
	������ ������ 5�� ���� ������ 7���� ũ�� �ʱ� ������ 5�� �� ���� 10�� �߰��� return�մϴ�.
 */
public class ������_��_����_2023_06_14_1 {
	public static void main(String[] args) {
		int[] a = {1,2,6};
		solution(a);
	}
	public static int[] solution(int[] num_list) {
        int num = num_list.length -1 ;
        int[] answer = new int[num+2];
        for(int i = 0 ; i<=num ; i++) {
        	answer[i] = num_list[i];
        }
        if(num_list[num] > num_list[num-1] ) {
            answer[num+1] = num_list[num] - num_list[num-1];
        }else {
            answer[num+1] = (num_list[num]*2);
        }
        return answer;
    }
}
