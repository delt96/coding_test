package Coding_test;

/*
 * ���� �迭 arr�� 2���� ���� �迭 queries�� �־����ϴ�. queries�� ���Ҵ� ���� �ϳ��� query�� ��Ÿ����, [s, e, k] ���Դϴ�.

	�� query���� ������� s �� i �� e�� ��� i�� ���� k���� ũ�鼭 ���� ���� arr[i]�� ã���ϴ�.
	
	�� ������ ������ �°� ���� ������ �迭�� ��ȯ�ϴ� solution �Լ��� �ϼ��� �ּ���.
	��, Ư�� ������ ���� �������� ������ -1�� �����մϴ�.
	
	���ѻ���
	1 �� arr�� ���� �� 1,000
	0 �� arr�� ���� �� 1,000,000
	1 �� queries�� ���� �� 1,000
	0 �� s �� e < arr�� ����
	0 �� k �� 1,000,000
	����� ��
	arr	queries	result
	[0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
	����� �� ����
	����� �� #1
	
	ù ��° ������ �������� 0, 1, 2, 4, 3�� ������ �� �� 2���� ũ�鼭 ���� ���� ���� 3�Դϴ�.
	�� ��° ������ �������� 0, 1, 2, 4�� ������ �� �� 2���� ũ�鼭 ���� ���� ���� 4�Դϴ�.
	�� ��° ������ �������� 0, 1, 2�� ������ ���⿡�� 2���� ū ���� �����ϴ�.
	���� [3, 4, -1]�� return �մϴ�.
 * 
 */

public class ������_����_����_2_2023_06_14_3 {
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        for(int i =0 ; i< queries.length ; i++) {
            count = 0;
        	for(int j=queries[i][0] ; j<= queries[i][1] ; j++) {
        		if(queries[i][2] < arr[j]) {
                    
                    if(count != 0 && count > arr[j]){
                        count = arr[j];    
                    }else if(count == 0){
                        count = arr[j];
                    }
                    
        		}
        	}
            if(count == 0){
                count = -1;
            }
            
            answer[i] = count;
        }
        return answer;
    }
}
