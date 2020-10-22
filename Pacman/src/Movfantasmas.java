import java.util.Random;

public class Movfantasmas {

	public static void getmov1(int mapa[][]) {
		Condiciones cond = new Condiciones();
		Check.choque(mapa);
		Check.checar(mapa);
		if (cond.c == 1 && cond.r == 8|| cond.c == 26 && cond.r == 8){Check.yess(mapa);}
		if (cond.direccion == 1) {

			if (mapa[cond.r - 1][cond.c] == 0) {
				cond.direccion = 4;
			}
		}
		if (cond.direccion == 4) {

			if (mapa[cond.r][cond.c - 1] == 0) {
				cond.direccion = 2;
			}
		}
		if (cond.direccion == 2) {

			if (mapa[cond.r + 1][cond.c] == 0) {
				cond.direccion = 3;
			}
		}
		if (cond.direccion == 3) {

			if (mapa[cond.r][cond.c + 1] == 0) {
				int oppt[] = { 1, 2 };
				Random rand = new Random();
				int camino = oppt[rand.nextInt(oppt.length)];
				if (camino == 1) {
					cond.direccion = 1;
				} else if (camino == 2) {
					cond.direccion = 2;
				}

			}
		}

	}

	public static void getmov2(int mapa[][]) {
		Condiciones cond = new Condiciones();
		Check.choque(mapa);
		Check.checar(mapa);
		if (cond.c == 1 && cond.r == 8|| cond.c == 26 && cond.r == 8){Check.yess(mapa);}
		if (cond.direccion == 1) {
			if (mapa[cond.r - 1][cond.c] == 0) {
				cond.direccion = 3;
			}
		}
		if (cond.direccion == 3) {
			if (mapa[cond.r][cond.c + 1] == 0) {
				cond.direccion = 2;
			}
			
		}
		if (cond.direccion == 2) {

			if (mapa[cond.r + 1][cond.c] == 0) {
				cond.direccion = 4;
			}
		}
		if (cond.direccion == 4) {

			if (mapa[cond.r][cond.c - 1] == 0) {
				int oppt[] = { 1, 2 };
				Random rand = new Random();
				int camino = oppt[rand.nextInt(oppt.length)];
				if (camino == 3) {
					cond.direccion = 3;
				} else if (camino == 2) {
					cond.direccion = 2;
				}

			}

		}}
	

	public static void getmov3(int mapa[][]) {
		Condiciones cond = new Condiciones();
		Check.choque(mapa);
		Check.checar(mapa);
		Check.yess(mapa);
		if (cond.c == 1 && cond.r == 8|| cond.c == 26 && cond.r == 8){Check.yess(mapa);}
		if (cond.direccion == 1) {
			if (mapa[cond.r - 1][cond.c] == 0) {
				int oppt[] = { 3, 2 };
				Random rand = new Random();
				int camino = oppt[rand.nextInt(oppt.length)];
				if (camino == 3) {
					cond.direccion = 3;
				} else if (camino == 2) {
					cond.direccion = 2;
				}
			}
		}
		if (cond.direccion == 4) {
			if (mapa[cond.r][cond.c - 1] == 0) {
				cond.direccion = 2;
			}
		}
		if (cond.direccion == 2) {
			if (mapa[cond.r + 1][cond.c] == 0) {
				int oppt[] = { 1, 3 };
				Random rand = new Random();
				int camino = oppt[rand.nextInt(oppt.length)];
				if (camino == 3) {
					cond.direccion = 3;
				} else if (camino == 1) {
					cond.direccion = 1;
				}
			}
		}
		if (cond.direccion == 3) {
			if (mapa[cond.r][cond.c + 1] == 0) {
				cond.direccion =2;}
				}
			}


		
		
		
	}

