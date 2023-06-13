package Coding_test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



/*
 * array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
	divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
	
	���ѻ���
	arr�� �ڿ����� ���� �迭�Դϴ�.
	���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
	divisor�� �ڿ����Դϴ�.
	array�� ���� 1 �̻��� �迭�Դϴ�.
	����� ��
	arr	divisor	return
	[5, 9, 7, 10]	5	[5, 10]
	[2, 36, 1, 3]	1	[1, 2, 3, 36]
	[3,2,6]	10	[-1]
	����� �� ����
	����� ��#1
	arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.
	
	����� ��#2
	arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.
	
	����� ��#3
	3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.
 */
public class ������_��������_����_�迭_2023_06_13_5 {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> a = new ArrayList();
        for(int i=0; i<arr.length ;i++) {
        	if(arr[i] % divisor == 0) {
        		a.add(arr[i]); 
        	}
        }
        a.sort(Comparator.naturalOrder());
        if(a.isEmpty()) {
            int[] answer = new int[1];
        	answer[0] = -1;
            return answer;
        }else {
            int[] answer = new int[a.size()];
        	for(Integer i =0 ; i< a.size() ; i++) {
            	answer[i] = a.get(i);
            }
            return answer;
        }
        
    }
}
