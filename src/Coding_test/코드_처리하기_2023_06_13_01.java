package Coding_test;



/*
 * 	���� ����
	���ڿ� code�� �־����ϴ�.
	code�� �տ������� �����鼭 ���� ���ڰ� "1"�̸� mode�� �ٲߴϴ�. mode�� ���� code�� �о�鼭 ���ڿ� ret�� �������ϴ�.
	
	mode�� 0�� 1�� ������, idx�� 0 ���� code�� ���� - 1 ���� 1�� Ű�������鼭 code[idx]�� ���� ���� ������ ���� �ൿ�մϴ�.
	
	mode�� 0�� ��
	code[idx]�� "1"�� �ƴϸ� idx�� ¦���� ���� ret�� �� �ڿ� code[idx]�� �߰��մϴ�.
	code[idx]�� "1"�̸� mode�� 0���� 1�� �ٲߴϴ�.
	mode�� 1�� ��
	code[idx]�� "1"�� �ƴϸ� idx�� Ȧ���� ���� ret�� �� �ڿ� code[idx]�� �߰��մϴ�.
	code[idx]�� "1"�̸� mode�� 1���� 0���� �ٲߴϴ�.
	���ڿ� code�� ���� ������� ���ڿ� ret�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
	
	��, ������ �� mode�� 0�̸�, return �Ϸ��� ret�� ���� �� ���ڿ��̶�� ��� "EMPTY"�� return �մϴ�.
	
	���ѻ���
	1 �� code�� ���� �� 100,000
	code�� ���ĺ� �ҹ��� �Ǵ� "1"�� �̷���� ���ڿ��Դϴ�.
	����� ��
	code	result
	"abc1abc1abc"	"acbac"
	����� �� ����
	����� �� #1
	
	code�� �� �ε��� i�� ���� ������ ���� mode�� ret�� ���մϴ�.
	i	code[i]	mode	ret
	0	"a"	0	"a"
	1	"b"	0	"a"
	2	"c"	0	"ac"
	3	"1"	1	"ac"
	4	"a"	1	"ac"
	5	"b"	1	"acb"
	6	"c"	1	"acb"
	7	"1"	0	"acb"
	8	"a"	0	"acba"
	9	"b"	0	"acba"
	10	"c"	0	"acbac"
	���� "acbac"�� return �մϴ�.
 */
public class �ڵ�_ó���ϱ�_2023_06_13_01 {
	public static void main(String[] args) {
		
		System.out.println(solution("abc1abc1abc")); 
	}
	public static String solution(String code) {
		boolean mode = true;
        String answer = "";
        char[] codeC = code.toCharArray();
        for(int i=0 ; i<codeC.length ; i++){
        	if(codeC[i] == '1'){
                mode = !mode;
            }else{
                if(i % 2 == 0){
                    if(mode) answer += codeC[i];
                }else{
                    if(!mode) answer += codeC[i];
                }
            }
        }   
        if(answer == "") answer = "EMPTY";        
        return answer;
    }
}
