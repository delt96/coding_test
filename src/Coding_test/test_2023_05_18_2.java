package Coding_test;
import java.util.Scanner;
/*
 * �� ���� a, b�� �־��� �� ������ ���� ������ ������ ����ϴ� �ڵ带 �ۼ��� ������.

	a + b = c
	���ѻ���
	1 �� a, b �� 100
	����� ��
	�Է� #1
	
	4 5
	��� #1
	
	4 + 5 = 9
 */
public class test_2023_05_18_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}
