package Coding_test;
import java.util.Scanner;

/* 
  	���ڿ� str�� ���� n�� �־����ϴ�.
	str�� n�� �ݺ��� ���ڿ��� ����� ����ϴ� �ڵ带 �ۼ��� ������.
	
	���ѻ���
	1 �� str�� ���� �� 10
	1 �� n �� 5
	����� ��
	�Է� #1
	
	string 5
	��� #1
	
	stringstringstringstringstring
  
 
 */

public class test_2023_05_17_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i=0; i<n ; i++) {
        	System.out.print(str);
        }
    }


}
