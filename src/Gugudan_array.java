
public class Gugudan_array {
	public static void main(String[] args) {

//		int[] result = new int[9];
//		for (int i=0; i<result.length; i++) {
//			result[i] = 2 * (i+1);
//		} // for문을 돌면서 2단을 result에 담게 됨(출력과 무관)
//	
//		for (int i=0; i<result.length; i++) {
//			System.out.println(result[i]);
//		} // 배열에 담긴 값들에 인덱스별로 하나하나 다 접근하며 출력
		
		int i=0;
		int j=0;
		
		int[][] result = new int[8][9];
		try { 
		
		
		for (i=0; i<result.length; i++) {
			for (j=0; j<result[i].length; j++) {
				result[i][j] = (i+2)*(j+1);
			}
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (i=0; i<result.length; i++) {
			for (j=0; j<result[i].length; j++) {
				System.out.println((i+2) + " * " + (j+1) + " = " + (i+2)*(j+1));
		    }
			System.out.println(); 
		}

	}
}

