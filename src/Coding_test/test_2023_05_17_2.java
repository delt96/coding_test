package Coding_test;

import java.util.Scanner;

/*
  	���� ���ĺ����� �̷���� ���ڿ� str�� �־����ϴ�. �� ���ĺ��� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�ؼ� ����ϴ� �ڵ带 �ۼ��� ������.

	���ѻ���
	1 �� str�� ���� �� 20
	str�� ���ĺ����� �̷���� ���ڿ��Դϴ�.
	����� ��
	�Է� #1
	
	aBcDeFg
	��� #1
	
	AbCdEfG
 */
public class test_2023_05_17_2 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] c = new char[21];
        c = a.toCharArray();
        String answer = "";
        for(int i=0; i<c.length; i++) {
        	if(c[i] <= 90) {
        		c[i] += 32;
        	}else {
        		c[i] -= 32;
        	}
        	 answer += c[i];
        }
        System.out.print(answer);

    }
}
