import java.util.Scanner;
import Tablero4ENRAYA.java;
public class Juego4ENRAYA {

	public static void main(String[] args) 
	{
		Scanner sc;
		Tablero4ENRAYA tablero;
		int x;
		int y;
		int fichacolumna;
		
		
		sc = new Scanner(System.in);
		//INICIALIZO TABLERO
		x = 6;
		y = 7;
		tablero = new Tablero4ENRAYA(x,y);
		
		//Dibujo tablero
		tablero.DibujarTablero4();
		System.out.println("Jugador 1 - Escoja columna 1-7");
		
		
		
		boolean error = false;
		//boolean fin = false;
	
		//Jugador 1 -- X
		//do
		//{
		for(int i=0; i <10; i++)
		{
			
		do
		{
			try
			{
				fichacolumna = sc.nextInt();
				tablero.PonerFichaX(fichacolumna);
				tablero.DibujarTablero4();
				//fin = tablero.CuantroenrayaX();
				System.out.println("Jugador 2 - Escoja columna 1-7");
				
				if(fichacolumna < 1 || fichacolumna > 7)
				{
					error = true;
				}
				else
				{
					error = false;	
				}
			}
			catch(Exception err_error)
			{
				error = true;
				System.out.println("Columna invalida");
				System.out.println("Jugador 1 - Escoja columna 1-7");
				sc.nextLine();
			}
		}
		while(error == true);
		
		//Jugador 2 -- O
		do
		{
			try
			{		
				fichacolumna = sc.nextInt();
				tablero.PonerFichaO(fichacolumna);
				tablero.DibujarTablero4();
				System.out.println("Jugador 1 - Escoja columna 1-7");
				
				if(fichacolumna < 1 || fichacolumna > 7)
				{
					error = true;
				}
				else
				{
					error = false;
					
				}
			}
			catch(Exception err_error)
			{
				error = true;
				System.out.println("Columna invalida");
				System.out.println("Jugador 2 - Escoja columna 1-7");
				sc.nextLine();
			}
		}
		while(error == true);
		
		} //while (fin == false);
		
		
	}
	
	
	

}



