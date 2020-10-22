
import java.util.Random;

public class Check {
	
	public static int getrandom(int mapa [][]){
		Condiciones cond = new Condiciones();
	
    if(cond.direccion == 1){
			if(mapa[cond.r-1][cond.c]==0){
				 // EJEMPLO DE LA CLASE
				int pp = 0;
				int t=1;
					if(mapa[cond.r-1][cond.c]== 0)
					{  
						int oppt[] = { 4, 2,3};
					Random rand = new Random();
					int camino = oppt[rand.nextInt(oppt.length)];
					if (camino == 3) {
					   pp = mapa[cond.r][cond.c-1];
							   t =3;
					} else if (camino == 2) {
						pp = mapa[cond.r+1][cond.c];
						   t=2;
					} else if (camino == 4) {
						pp = mapa[cond.r][cond.c-1];
						t=4;
					}
					cond.direccion = t ; 
						 
					}
					
					else {
						return 1;
					}
					return cond.direccion;
				}
				
				 
				
	}
	return cond.direccion;
}
	public static void checar(int mapa[][]) {
		Condiciones cond = new Condiciones();
		if (cond.direccion == 1 && mapa[cond.r - 1][cond.c] == 5) {
			Resetear.resetear(mapa);
			
			Getvidas.getvidas();
		}
		if (cond.direccion == 2 && mapa[cond.r + 1][cond.c] == 5) {
			Resetear.resetear(mapa);
			Getvidas.getvidas();
		}
		if (cond.direccion == 3 && mapa[cond.r][cond.c + 1] == 5) {
			Resetear.resetear(mapa);
		
			Getvidas.getvidas();
		}
		if (cond.direccion == 4 && mapa[cond.r][cond.c - 1] == 5) {
			Resetear.resetear(mapa);
			
			Getvidas.getvidas();
		}
	}
	
	public static void esquina(){
		Condiciones cond = new Condiciones();
		if (cond.r == 1&& cond.c==1 ){ 
			int oppt[] = { 3, 2};
		       Random rand = new Random();
			 int camino = oppt[rand.nextInt(oppt.length)];
			 if (camino== 3){ cond.direccion = 3; }else if(camino==2){cond.direccion = 2;}
			 
		}
		if (cond.r == 1&& cond.c==26 ){ 
			int oppt[] = { 4, 2};
		       Random rand = new Random();
			 int camino = oppt[rand.nextInt(oppt.length)];
			 if (camino== 4){ cond.direccion = 4; }else if(camino==2){cond.direccion = 2;}
		}
		if (cond.r == 26&& cond.c==1 ){ 
			int oppt[] = { 3, 1};
		       Random rand = new Random();
			 int camino = oppt[rand.nextInt(oppt.length)];
			 if (camino== 3){ cond.direccion = 3; }else if(camino==1){cond.direccion = 1;}
		}
		if (cond.r == 26&& cond.c==26 ){ 
			int oppt[] = { 4, 1};
		       Random rand = new Random();
			 int camino = oppt[rand.nextInt(oppt.length)];
			 if (camino== 4){ cond.direccion = 4; }else if(camino==1){cond.direccion = 1;}
		}
	}
	public static void choque (int mapa[][]) {
		Condiciones cond = new Condiciones();
		if (cond.direccion == 1 && mapa[cond.r - 1][cond.c] == 6) {
			cond.direccion =2;
		}
		if (cond.direccion == 2 && mapa[cond.r + 1][cond.c] == 6) {
			cond.direccion =1;
		}
		if (cond.direccion == 3 && mapa[cond.r][cond.c + 1] == 6) {
			cond.direccion = 4;
			
		}
		if (cond.direccion == 4 && mapa[cond.r][cond.c - 1] == 6) {
			cond.direccion = 3;
		}
	}
	
	public static void yess(int mapa[][]){
		Gridd grid = new Gridd();
		Condiciones cond = new Condiciones();
	
		if (cond.direccion == 3 && cond.c == 26 && cond.r == 8) { // BRINCO DE LADO A LADO 
			mapa[8][0] = 6;
			mapa[8][26] = 1;
			cond.direccion = 4;
			cond.c = 0;
		} else if (cond.direccion == 4 && cond.c == 1 && cond.r == 8) { // BRINCO DE LADO A LADO 
			mapa[8][0] = 1;
			mapa[8][27] = 6;
			cond.direccion = 3;
			cond.c = 27;
		} 
	}

}
