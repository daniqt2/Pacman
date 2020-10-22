import java.util.Scanner;

public class Movimientos {
	public static void getmov(int[][] mapa) {

		Gridd grid = new Gridd();

		System.out.println(" 1 - DERECHA");
		System.out.println(" 2 - IZQUIERDA ");
		System.out.println(" 3 - ARRIBA ");
		System.out.println(" 4 - ABAJO");
		Scanner scan = new Scanner(System.in);

		int resp = scan.nextInt();

		if (resp == 1 && grid.columna == 27 && grid.renglon == 8) { // BRINCO DE LADO A LADO 
			mapa[8][0] = 5;
			mapa[8][27] = 1;
			grid.columna = 0;
		} else if (resp == 2 && grid.columna == 0 && grid.renglon == 8) { // BRINCO DE LADO A LADO 
			mapa[8][0] = 1;
			mapa[8][27] = 5;
			grid.columna = 27;
		} else if (resp == 1 && mapa[grid.renglon][grid.columna + 1] == 1
				|| resp == 1 && mapa[grid.renglon][grid.columna + 1] == 3) {
			if (mapa[grid.renglon][grid.columna + 1] == 1) { // CHECA SI ESTA EN UN PUNTO ( 1 )
				grid.puntos++;
			}
			mapa[grid.renglon][grid.columna + 1] = 5;
			mapa[grid.renglon][grid.columna] = 3;
			grid.columna++;
			System.out.println(grid.columna + ",renglon :" + grid.renglon);

		} else if (resp == 1 && mapa[grid.renglon][grid.columna + 1] == 6) {
			mapa[grid.renglon][grid.columna] = 1;
			Resetear.resetear(mapa);
			Getvidas.getvidas();
		} else if (resp == 2 && mapa[grid.renglon][grid.columna - 1] == 1
				|| resp == 2 && mapa[grid.renglon][grid.columna - 1] == 3) {
			if (mapa[grid.renglon][grid.columna - 1] == 1) {
				grid.puntos = grid.puntos + 1;
			}
			mapa[grid.renglon][grid.columna - 1] = 5;
			mapa[grid.renglon][grid.columna] = 3;
			grid.columna--;
			System.out.println(grid.columna + ",renglon :" + grid.renglon);
		} else if (resp == 2 && mapa[grid.renglon][grid.columna - 1] == 6) {
			mapa[grid.renglon][grid.columna] = 1;
			Resetear.resetear(mapa);
			Getvidas.getvidas();
			System.out.println("Posicion "+mapa[grid.renglon][grid.columna]);
		} else if (resp == 3 && mapa[grid.renglon - 1][grid.columna] == 1
				|| resp == 3 && mapa[grid.renglon - 1][grid.columna] == 3) {
			if (mapa[grid.renglon - 1][grid.columna] == 1) {
				grid.puntos = grid.puntos + 1;
			}
			mapa[grid.renglon - 1][grid.columna] = 5;
			mapa[grid.renglon][grid.columna] = 3;
			grid.renglon--;
			System.out.println(grid.columna + ",renglon :" + grid.renglon);
		} else if (resp == 3 && mapa[grid.renglon - 1][grid.columna] == 6) {
			mapa[grid.renglon][grid.columna] = 1;
			Resetear.resetear(mapa);
			Getvidas.getvidas();
		} else if (resp == 4 && mapa[grid.renglon + 1][grid.columna] == 1
				|| resp == 4 && mapa[grid.renglon + 1][grid.columna] == 3) {
			if (mapa[grid.renglon + 1][grid.columna] == 1) {
				grid.puntos = grid.puntos + 1;
			}
			mapa[grid.renglon + 1][grid.columna] = 5;
			mapa[grid.renglon][grid.columna] = 3;
			grid.renglon++;
			System.out.println(grid.columna + ",renglon :" + grid.renglon);
		} else if (resp == 4 && mapa[grid.renglon + 1][grid.columna] == 6) {
			mapa[grid.renglon][grid.columna] = 1;
			Resetear.resetear(mapa);
			Getvidas.getvidas();
		} else
			System.out.println("Opcion incorrecta");

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
				} else if (mapa[i][t] == 3) {
					System.out.print(" ");
				}

			}
			System.out.print("\n");
		}
		System.out.println("PUNROS "+grid.puntos);
	}
}
