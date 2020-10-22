import java.util.Scanner;


public class Juego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido, oprime x para iniciar el juego");
		Scanner teclado = new Scanner(System.in);

		System.out.print("PON 1 PARA INICIAR");
		int entrada = teclado.nextInt();
		if ( entrada == 1){
			System.out.println(entrada);
		
			while (Gridd.puntos < 277 && Getvidas.vidas != 0 || Getvidas.vidas != 0){
			Gridd.Mapa1();
			}
			if (Getvidas.vidas == 0) {
				System.out.println("PERDISTE");
			} else if (Gridd.puntos == 277) {
				System.out.println(" GANASTE");
			}
		}
		
	}

}
