package Coding_test;

import java.util.Scanner;

/*
	���ڿ� str�� �־����ϴ�.
	���ڿ��� �ð�������� 90�� ������ �Ʒ� ����� ���� ���� ����ϴ� �ڵ带 �ۼ��� ������.
	
	���ѻ���
	1 �� str�� ���� �� 10
	
	����� ��
	�Է� #1
	
	abcde
	��� #1
	
	a
	b
	c
	d
	e
 */
public class test_2023_05_22_2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        for(int i =0 ;i< b.length; i++ ) {
        	System.out.println(b[i]);
        }
        
    }
}
