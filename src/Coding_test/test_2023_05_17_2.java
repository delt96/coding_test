package Coding_test;

import java.util.Scanner;

/*
  	영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

	제한사항
	1 ≤ str의 길이 ≤ 20
	str은 알파벳으로 이루어진 문자열입니다.
	입출력 예
	입력 #1
	
	aBcDeFg
	출력 #1
	
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
