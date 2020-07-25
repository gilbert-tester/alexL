package tutorial;

public class NestedFoorLoopsProgram {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Bangladeshi boy");
		}
		
		String[] colors = {"Red", "Blue", "Green"};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}
		
		String[][] fancyColors = { {"Red", "Blue", "Green"},
				{"Cyan", "Magenta", "Torqiouse"}
		};
		
		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.println(fancyColors [row][column]);
				
			}
			
		}
		
		System.out.println("---------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i: " +i + ", J: "+j);
				
			}
			
		}
	}

}
