package Coding_test;
/*
 * ���� ����
	���ڵ��� ����ִ� �迭 arr�� �־����ϴ�. arr�� ���ҵ��� ������� �̾� ���� ���ڿ��� return �ϴ� solution�Լ��� �ۼ��� �ּ���.
	
	���ѻ���
	1 �� arr�� ���� �� 200
	arr�� ���Ҵ� ���� ���ĺ� �ҹ��ڷ� �̷���� ���̰� 1�� ���ڿ��Դϴ�.
	����� ��
	arr	result
	["a","b","c"]	"abc"
 */


public class test_2023_05_24_2 {
	public String solution(String[] arr) {
        String answer = "";
        for(int i= 0 ; i<arr.length ; i++) {
        	answer += ""+arr[i];
        }
        return answer;
    }
}
