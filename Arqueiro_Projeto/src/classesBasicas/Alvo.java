package classesBasicas;

import imagem.Imagem;
import posicao.Ponto;

public class Alvo extends ElementoDoJogo {
	
	private Imagem imagemAlvo;
	
	private Ponto posicaoAlvo;
	
	private int quantidadeAlvos = 3;

	public Imagem getImagemAlvo() {
		return imagemAlvo;
	}

	public void setImagemAlvo(Imagem imagemAlvo) {
		this.imagemAlvo = imagemAlvo;
	}

	public Ponto getPosicaoAlvo() {
		return posicaoAlvo;
	}

	public void setPosicaoAlvo(Ponto posicaoAlvo) {
		this.posicaoAlvo = posicaoAlvo;
	}

	public int getQuantidadeAlvos() {
		return quantidadeAlvos;
	}
	public void inicializarAlvoNoCenario(Alvo alvo){
		//Inicializando o ponto que o arqueiro irá começar no cenário.
		Ponto ponto = new Ponto(9, 3);
		alvo.setPosicaoAlvo(ponto);
		
		int eixoXalvo = alvo.getPosicaoAlvo().getCoordenadaX();
		int eixoYalvo = alvo.getPosicaoAlvo().getCoordenadaY(); 
	
		//System.out.println("\tX");
		
	}
	
public Ponto PosicaoDoArqueiro(Alvo alvo){
		
		alvo.inicializarAlvoNoCenario(alvo);
		//System.out.println(arq.getPosicao());
		return alvo.getPosicaoAlvo();
		
	}

@Override
public char getLetrinha() {

	return 'X';
}
		
	public void atualizar(int entrada){
		this.getPosicao().setCoordenadaY(this.getPosicao().getCoordenadaY() + 1);	
	}

}
