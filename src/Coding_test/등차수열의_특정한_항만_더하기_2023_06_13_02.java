package Coding_test;

/*
 * �� ���� a, d�� ���̰� n�� boolean �迭 included�� �־����ϴ�. ù°���� a, ������ d�� ������������ included[i]�� i + 1���� �ǹ��� ��, �� ���������� 1�׺��� n�ױ��� included�� true�� �׵鸸 ���� ���� return �ϴ� solution �Լ��� �ۼ��� �ּ���.

	���ѻ���
	1 �� a �� 100
	1 �� d �� 100
	1 �� included�� ���� �� 100
	included���� true�� ��� �ϳ� �����մϴ�.
	����� ��
	a	d	included	result
	3	4	[true, false, false, true, true]	37
	7	1	[false, false, false, true, false, false, false]	10
	����� �� ����
	����� �� #1
	
	���� 1���� a�� d�� ���� 3, 4�̰� included�� ���̰� 5�Դϴ�. �̸� ǥ�� ��Ÿ���� ������ �����ϴ�.
	
	1��	2��	3��	4��	5��
	��������	3	7	11	15	19
	included	true	false	false	true	true
	���� true�� �ش��ϴ� 1��, 4��, 5���� ���� 3 + 15 + 19 = 37�� return �մϴ�.
	
	����� �� #2
	
	���� 2���� a�� d�� ���� 7, 1�̰� included�� ���̰� 7�Դϴ�. �̸� ǥ�� ��Ÿ���� ������ �����ϴ�.
	
	1��	2��	3��	4��	5��	6��	7��
	��������	7	8	9	10	11	12	13
	included	false	false	false	true	false	false	false
	���� 4�׸� true�̹Ƿ� 10�� return �մϴ�.
	 * 
 */
public class ����������_Ư����_�׸�_���ϱ�_2023_06_13_02 {
	public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i =0 ; i< included.length ; i++){
            if(included[i]){
                answer += a+(d*i);
            }
        }
        
        return answer;
    }
}
