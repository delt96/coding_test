package Coding_test;
/*
 * ���ڿ��� ���� ������ ���� �� ���� ũ�⸦ ���Ϸ��� �մϴ�.
	
	�� ���� n�� m�̶��
	">", "=" : n >= m
	"<", "=" : n <= m
	">", "!" : n > m
	"<", "!" : n < m
	�� ���ڿ� ineq�� eq�� �־����ϴ�. ineq�� "<"�� ">"�� �ϳ���, eq�� "="�� "!"�� �ϳ��Դϴ�. �׸��� �� ���� n�� m�� �־��� ��, n�� m�� ineq�� eq�� ���ǿ� ������ 1�� �ƴϸ� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	
	���� ����
	1 �� n, m �� 100
	����� ��
	ineq	eq	n	m	result
	"<"	"="	20	50	1
	">"	"!"	41	78	0
	����� �� ����
	����� �� #1
	
	20 <= 50�� ���̱� ������ 1�� return�մϴ�.
	����� �� #2
	
	41 > 78�� �����̱� ������ 0�� return�մϴ�.
 */
public class ���ǹ��ڿ�_2023_06_01_05 {
	public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">") && eq.equals("=")) {
        	if(n >= m) {
        		answer = 1;
        	}
        }else if(ineq.equals(">") && eq.equals("!")) {
        	if(n>m) {
        		answer = 1; 
        	}
        }else if(ineq.equals("<") && eq.equals("=")) {
        	if(n<=m) answer =1;
        }else {
        	if(n<m) answer =1 ;
        }
        
        
        return answer;
    }
}
