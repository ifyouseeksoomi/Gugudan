import java.util.Scanner;


public class Gugudan {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		// 2단
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		
//	    System.out.println();
//	    System.out.println();
//	    
//		// 3단
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
//		
//		System.out.println();
//		System.out.println();
		
//		// 4단
//		System.out.println("4단");
//		int result = 4*1;
//		System.out.println(result);
//		result = 4*2;
//		System.out.println(result);
//		result = 4*3;
//		System.out.println(result);
//		result = 4*4;
//		System.out.println(result);
//		result = 4*5;
//		System.out.println(result);
//		result = 4*6;
//		System.out.println(result);
//		result = 4*7;
//		System.out.println(result);
//		result = 4*8;
//		System.out.println(result);
//		result = 4*9;
//		System.out.println(result);
//		
//		System.out.println();
//		System.out.println();
		
//		// 5단
//		System.out.print("출력할 구구단: ");
//		Scanner sc = new Scanner(System.in);
//		int number =sc.nextInt();
//		System.out.println();
//		System.out.println(number *1);
//		System.out.println(number *2);
//		System.out.println(number *3);
//		System.out.println(number *4);
//		System.out.println(number *5);
//		System.out.println(number *6);
//		System.out.println(number *7);
//		System.out.println(number *8);
//		System.out.println(number *9);
//		
//		System.out.println();
//		System.out.println();
//		
//		// 6단
//		int su = 1;
//		while (su<10) {
//			System.out.println(6 * su);
//			su++;
//		}
		
//		// 7단
//		for (int dan =1; dan<10; dan++) {
//			for (int su = 1; su<10; su++) {
//				System.out.println(dan + " * " + su + " = " + dan*su);
//			}
//			System.out.println();
//		}
		
		// n단
		// 사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
		// 예를 들어 사용자가 8 입력 --> 8단 전체를 계산해 출력
		// 사용자가 2이상, 9이하가 아닌 값을 입력하는 경우 2이상, 9이하의 값만 입력할 수 있습니다." 라는 메시지 출력
		
	    System.out.print("단을 입력하세요: ");
	    int input = sc.nextInt(); sc.nextLine();
	    if (input > 9 || input < 2) {
	    	System.out.println("2이상, 9이하 값만 입력할 수 있습니다. ");
	    } else {
	    	System.out.println(input + "단 출력: ");
	    	for (int i=1; i<10; i++) {
	    		System.out.println(input + " * " + i + " = " + input*i);
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    
		
	}
}
