package Coding_test;
abstract
/*
	 ���� ����
	������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
	
	���ѻ���
	arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
	arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
	����� ��
	arr	return
	[1,2,3,4]	2.5
	[5,5]	5
 */
public class test_2023_05_17_3 {
	public double solution(int[] arr) {
        double answer = 0;
        int sum = 0; 
        for(int i = 0; i<arr.length ; i++) {
        	sum += arr[i];
        }
        return answer = (double)sum/arr.length;
        
    }
}
