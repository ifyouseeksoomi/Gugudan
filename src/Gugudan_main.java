import Review.Review;

public class Gugudan_main {

	
	public static void main(String[] args) {
		for (int i =2; i<10; i++) {
			for (int j=1; j<10; j++) {
				int[][] gugudan = Review.gugudan(i);
				Review.print(gugudan);
			}
			System.out.println();
		}
}
}