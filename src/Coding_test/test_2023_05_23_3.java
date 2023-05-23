package Coding_test;
/*
 * �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

	���� ����
	n�� 10,000,000,000������ �ڿ����Դϴ�.
	����� ��
	n	return
	12345	[5,4,3,2,1]
 */
public class test_2023_05_23_3 {
	public int[] solution(long n) {
		String sn = ""+n;
		char[] nn = sn.toCharArray();
		int len = nn.length;
        int[] answer = new int[len];
        int count = nn.length-1;
        for(int i=0 ; i<len ; i++) {
    	  answer[i] = (nn[count]-48);
    	  count--;
       }   
        return answer;
    }
	
	// �ٸ� ��� Ǯ��
	public int[] solution2(long n ) {
		return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
	}
	public int[] solution3(long n) {
		 String a =""+n;
		 int [] answer = new int[a.length()];
		 int cnt = 0;
		 while(n>0) {
			 answer[cnt]= (int)(n%10);
			 n/=10;
			 cnt++;
		 }
		 return answer;
	}
}
