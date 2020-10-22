public class Fantsalidas {
public static int  posfant1;

	public static void salida_1(int mapa[][]) { // MOV FANTASMA 1
	
		Gridd grid = new Gridd();
		Condiciones cond = new Condiciones();
        cond.direccion = cond.direccion1;
		cond.r = grid.renfant1;
        cond.c = grid.colfant1;
       
       if (grid.veces > 0 ){
    	 cond.direccion = cond.direccion1;
        Movfantasmas.getmov1(mapa);
        Condiciones.direcciones(mapa);
        cond.direccion1 = cond.direccion; ;// cambia direccion
        grid.colfant1 = cond.c;
        grid.renfant1 = cond.r;
       } } 
       
	public static void salida_2(int mapa[][]) { // MOVIMIENTOS FANT 2
		
		Gridd grid = new Gridd();
		Condiciones cond = new Condiciones();
        cond.direccion = cond.direccion2;
		cond.r = grid.renfant2;
        cond.c = grid.colfant2;
       
       if (grid.veces > 0 ){
    	 cond.direccion = cond.direccion2;
        Movfantasmas.getmov2(mapa);
        Condiciones.direcciones(mapa);
        cond.direccion2 = cond.direccion; ;// cambia direccion
        grid.colfant2 = cond.c;
        grid.renfant2 = cond.r;
       } } 
       
	public static void salida_3(int mapa[][]) {
		Gridd grid = new Gridd();
		Condiciones cond = new Condiciones();
		cond.r = grid.renfant3;
        cond.c = grid.colfant3;
       
        	 if (grid.veces > 0 ){
            	 cond.direccion = cond.direccion3;
                Movfantasmas.getmov3(mapa);
                Condiciones.direcciones(mapa);
                cond.direccion3 = cond.direccion; ;// cambia direccion
                grid.colfant3 = cond.c;
                grid.renfant3 = cond.r;
               } } 
               
        
        
			
		}
		
	
		
		
		




