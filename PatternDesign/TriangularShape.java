package PatternDesign;

public class TriangularShape {

	public static void main(String[] args) {
		int a =10;
		for(int i=0;i<=a;i++) {
			for(int j=10;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
