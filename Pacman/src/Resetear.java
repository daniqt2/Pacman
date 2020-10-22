
public class Resetear {
	
	public static void resetear(int mapa[][]){
		Gridd grid = new Gridd();
		grid.renglon = 15;
		grid.columna = 13;
		mapa[15][13] = 5;
		
		for (int i = 0; i < 28; i++) {
				for (int t = 0; t < 28; t++) {
					

					if (mapa[i][t] == 5) {
						System.out.print("@");
					}
					if (mapa[i][t] == 6) {
						System.out.print("o");
					}
					if (mapa[i][t] == 0) {
						System.out.print("|");
					} else if (mapa[i][t] == 1) {
						System.out.print(".");
					}else if (mapa[i][t] == 3) {
						System.out.print(" ");
					}
				
				}
				System.out.print("\n");
		 }
		
	}

}
