import java.util.Random;

public class Condiciones {
	public static int r;
	public static int c;
	public static int direccion;
	public static int direccion1 = 1;
	public static int direccion2 = 1;
	public static int direccion3 = 3;
	public static int pos;
	public static int x;
	public static int camino;
	public static int camino1;
	public static int camino2;
	public static int camino3;

	public static void direcciones(int mapa[][]) { // Checar direccion del
													// movimiento y hacerlo
		if (direccion == 1) {
			arriba(mapa);
		} else if (direccion == 2) {
			abajo(mapa);
		} else if (direccion == 3) {
			derecha(mapa);
		} else if (direccion == 4) {
			izquierda(mapa);
		}

	}

	public static void arriba(int mapa[][]) { // MOVER ARRIBA
		if (mapa[r - 1][c] == 1) {
			mapa[r][c] = 1;
			mapa[r - 1][c] = 6;
			r--;

		} else if (mapa[r - 1][c] == 3) {
			mapa[r][c] = 3;
			mapa[r - 1][c] = 6;
			r--;

		}
	}

	public static void abajo(int mapa[][]) { // MOVER ABAJO
		if (mapa[r + 1][c] == 1) {
			mapa[r][c] = 1;
			mapa[r + 1][c] = 6;
			r++;
		} else if (mapa[r++][c] == 3) {
			mapa[r][c] = 3;
			pos = mapa[r++][c] = 6;
			r++;
		}

	}

	public static void derecha(int mapa[][]) { // MOVER A LA DERECHA
		if (mapa[r][c + 1] == 1) {
			mapa[r][c] = 1;
			mapa[r][c + 1] = 6;
			c++;
		} else if (mapa[r][c + 1] == 3) {
			mapa[r][c] = 3;
			mapa[r][c + 1] = 6;
			c++;
		}

	}

	public static void izquierda(int mapa[][]) { // MOVER A LA IZQUIERDA
		if (mapa[r][c - 1] == 1) {
			mapa[r][c] = 1;
			mapa[r][c - 1] = 6;
			c--;
		} else if (mapa[r][c - 1] == 3) {
			mapa[r][c] = 3;
			mapa[r][c - 1] = 6;
			c--;
		}

	}

}
