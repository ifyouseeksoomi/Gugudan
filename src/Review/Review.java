package Review;

public class Review {
	
	public static int[][] gugudan(int i) {
		
		int[][] gugudan = new int[8][9];
		for (i=0; i<gugudan.length; i++) {		
			for(int j=0; j<gugudan[i].length; j++) {
				gugudan[i][j] = (i+2)*(j+1);
				System.out.println((i+2) + " * " + (j+1) + " = " + gugudan[i][j]);
			}
			System.out.println();
		}
		return gugudan;
	}
	
	public static void print(int[][] gugudan) {
		for (int i=0; i<gugudan.length; i++) {
			System.out.println(gugudan);
		}
	}
}
