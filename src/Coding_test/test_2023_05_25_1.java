package Coding_test;

/*
	 * ���ڿ� my_string�� ���� k�� �־��� ��, my_string�� k�� �ݺ��� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
	
	���ѻ���
	1 �� my_string�� ���� �� 100
	my_string�� ���ҹ��ڷθ� �̷���� �ֽ��ϴ�.
	1 �� k �� 100
	����� ��
	my_string	k	result
	"string"	3	"stringstringstring"
	"love"	10	"lovelovelovelovelovelovelovelovelovelove"
	����� �� ����
	����� �� #1
	
	���� 1���� my_string�� "string"�̰� �̸� 3�� �ݺ��� ���ڿ��� "stringstringstring"�̹Ƿ� �̸� return �մϴ�.
	����� �� #2
	
	���� 2���� my_string�� "love"�̰� �̸� 10�� �ݺ��� ���ڿ��� "lovelovelovelovelovelovelovelovelovelove"�̹Ƿ� �̸� return �մϴ�.
 */
public class test_2023_05_25_1 {
	public String solution(String my_string, int k) {
        String answer = "";
        for(int i= 0 ; i< k ; i++) {
        	answer += my_string;
        }
        return answer;
       
    }
}	