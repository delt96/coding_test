package Coding_test;

import java.util.Scanner;

/*
	 ���� ����
	�ڿ��� n�� �Է����� �־����� �� ���� n�� ¦���̸� "n is even"��, Ȧ���̸� "n is odd"�� ����ϴ� �ڵ带 �ۼ��� ������.
	
	���ѻ���
	1 �� n �� 1,000
	����� ��
	�Է� #1
	
	100
	��� #1
	
	100 is even
	�Է� #2
	
	1
	��� #2
	
	1 is odd 
 */
public class test_2023_05_23_1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        if(n%2 == 0) {
	        	System.out.printf("%d is even", n);
	        }else {
	        	System.out.printf("%d is odd", n);
	        }
	    }
}
