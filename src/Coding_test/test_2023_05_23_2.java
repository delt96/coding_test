package Coding_test;
/*
 ���ڿ� my_string, overwrite_string�� ���� s�� �־����ϴ�. ���ڿ� my_string�� �ε��� s���� overwrite_string�� ���̸�ŭ�� ���ڿ� overwrite_string���� �ٲ� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.

	���ѻ���
	my_string�� overwrite_string�� ���ڿ� ���ĺ����� �̷���� �ֽ��ϴ�.
	1 �� overwrite_string�� ���� �� my_string�� ���� �� 1,000
	0 �� s �� my_string�� ���� - overwrite_string�� ����
	����� ��
	my_string	overwrite_string	s	result
	"He11oWor1d"	"lloWorl"	2	"HelloWorld"
	"Program29b8UYP"	"merS123"	7	"ProgrammerS123"
	����� �� ����
	����� �� #1
	
	���� 1���� my_string���� �ε��� 2���� overwrite_string�� ���̸�ŭ�� �ش��ϴ� �κ��� "11oWor1"�̰� �̸� "lloWorl"�� �ٲ� "HelloWorld"�� return �մϴ�.
	����� �� #2
	
	���� 2���� my_string���� �ε��� 7���� overwrite_string�� ���̸�ŭ�� �ش��ϴ� �κ��� "29b8UYP"�̰� �̸� "merS123"�� �ٲ� "ProgrammerS123"�� return �մϴ�. 
 */
public class test_2023_05_23_2 {
	public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int overwrite_len = overwrite_string.length()+s;
        answer = my_string.substring(0,s)+overwrite_string+ my_string.substring(overwrite_len);
        return answer;
    }
}
