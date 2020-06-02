package Review;

import java.util.Scanner;

public class exercise {
	private static Scanner sc = new Scanner(System.in);

	public static void question1() {
	// Q1.
	// 사용자가 입력한 값에 따라크기가 다른 구구단을 계산해 출력
	// 사용자가 8 입력시 팔팔단, 19 입력시 십구십구단
	// 시작은 모두 2*1
		
	System.out.print("숫자를 입력하세요. ");
	int input = sc.nextInt(); sc.nextLine();
	
	for (int i =2; i<=input; i++) {
		if (i<input) {
			for (int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			} 
		} else {
	    	for (int j=1; j<=input; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
	    	}
	    }
	
	}	
}
	
	public static void question2() {
		// Q2.
		// 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력
		// 사용자가 8, 7 입력 시 팔칠단 구현 
		// 입력은 String형으로 콤마 포함하여 받고, split 메소드 이용하여 문자열을 숫자로 변환할 것
		
	System.out.print("숫자 두 개를 입력하세요. (예시: 4, 8): ");
	String input = sc.nextLine();
	String[] splitedInput = input.split(", ");
	
	int first = Integer.parseInt(splitedInput[0]);
	int second = Integer.parseInt(splitedInput[1]);
	
	for (int i=2; i<=first; i++) {
		if (i<first) {
			for (int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		} else {
			for (int j=1; j<=second; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
	
		
	}
	

}