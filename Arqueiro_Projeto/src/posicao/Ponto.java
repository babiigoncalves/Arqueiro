package posicao;

public class Ponto {
		
	protected int coordenadaX;
	protected int coordenadaY;
	
	
	public int getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	
	
	public int getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public Ponto(int x,int y) {

		this.coordenadaX = x;
		this.coordenadaY = y;
	}
	
	public Ponto() {
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		String texto;
		
		//criei um objeto como sendo uma concatenação de dois textos;
		//A operação de '+' aqui será concatenação porque um dos termos
		//é String (facilidade da linguagem);
			
		texto = "Ponto x= "+ coordenadaX;
		//Concatena o texto criado anteriormente com o fim:
		//texto recebe ", y=" concatenado com o texto que
		//representa y
		texto = texto+", y= "+ coordenadaY;
		
		//retorna o texto criado;
		return texto;
	}
	
}
