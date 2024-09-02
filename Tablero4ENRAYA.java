public class Tablero4ENRAYA 
{

	
	private String	 matriz[][];
	private int	 filas;
	private int  columnas;
	
	
	/************************************************************/
	/************************************************************/
	/******************CONSTRUCTOR MATRIZ**********************/
	public Tablero4ENRAYA(int x, int y)
	{

		this.filas = x;
		this.columnas = y;
		this.matriz = new String[x][y];
	}
	
	/******************DEFINIR FILA Y COLUMNAS*****************/
	public  int Getnumerofilas()
	{
		return this.matriz.length;
	}
	public  int Getnumerocolumnas()
	{
		return this.matriz[0].length;
	}
	/************************************************************/
	/************************************************************/
	
	
	/***********************DIBUJAR TABLERO**********************/
	public void DibujarTablero4()
	{
		int x;
		int y;
		
		for(x = 0 ; x < this.Getnumerofilas(); x++)
		{
			for(y = 0 ; y < this.Getnumerocolumnas(); y++)
			{
				if(matriz[x][y] == null)
				{
					System.out.print("|   |");
				}
				else
				{
					System.out.print("| " + this.matriz[x][y] + " |");
				}
			}
			System.out.println("");
		}
	}
	/***********************DIBUJAR TABLERO**********************/
	
	/*************************************************************/
	
	/***********************PONER FICHAS************************/
	public void PonerFichaX(int columnaescogida)
	{
		int contadorfilas;
		
		contadorfilas = this.Getnumerofilas()-1;
		
		while(this.matriz[contadorfilas][columnaescogida-1] != null)
		{
				contadorfilas--;	
		}
		
		
			this.matriz[contadorfilas][columnaescogida-1] = "x";
		
	}
	
	public void PonerFichaO(int columnaescogida)
	{
		int contadorfilas;
		
		contadorfilas = this.Getnumerofilas()-1;
		
		while(this.matriz[contadorfilas][columnaescogida-1] != null)
		{
				contadorfilas--;	
		}
		
	
			this.matriz[contadorfilas][columnaescogida-1] = "o"; 
		
	}
	/***********************PONER FICHAS************************/
	
	/*************************************************************/
	
	/**********************FIN DE JUEGO***************************/

	/*public boolean CuantroenrayaX()
	{
		boolean fin = false;
		int contador1 = 0;
		
		int x = 0;
		int y = 0;
		
		//contador por filas
		while(this.matriz[x][y] != this.matriz[6][7] || contador1 == 4 )
		{
			while(this.matriz[x][y] != this.matriz[x][7] || contador1 == 4 )
			{
				if(this.matriz[x][y] == "x")
				{
					contador1++;
				}
				else
				{
					contador1 = 0;
				}
				y++;
			}
			x++;
		}
		
		if(contador1 >= 4)
		{
			fin = true;
		}
		else
		{
			fin = false;
		}
		
		return fin;
	}*/
	
	/**********************FIN DE JUEGO***************************/
	
	
	
}



