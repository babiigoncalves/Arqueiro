package classesBasicas;

import imagem.Imagem;
import interfaces.InterfaceElementos;
import posicao.Ponto;

/**
 * 
 Classe Elemento -Abstrata
 * 
 * O elemento do jogo pode ser um alvo ou o arqueiro. O alvo irá se mover
 * sozinho e o arqueiro se move a partir da entrada do usuário;
 * 
 * O arqueiro atira e alguns alvos podem atirar,outras não;
 * 
 * @author Babi
 * 
 */
public abstract class ElementoDoJogo implements InterfaceElementos {

	private Imagem imagem;
	protected Ponto posicao;

	// protected Projetil tiro;

	public ElementoDoJogo() {
		this(null, new Ponto(600, 500), null);

	}

	public ElementoDoJogo(Imagem imagem, Ponto posicao, Projetil tiro) {
		// if(imagem == null || posicao == null)
		if (posicao == null) {
			throw new NullPointerException();
		}

		this.imagem = imagem;
		this.posicao = posicao;
		// this.tiro = tiro;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	public Ponto getPosicao() {
		return posicao;
	}

	public void setPosicao(Ponto posicao) {

		this.posicao = posicao;

	}

	public void mover() {

	}

	public void atirar() {

	}

	/*	
 * 
 * *//**
	 * Método para informar se o elemento do jogo é um arqueiro. O arqueiro
	 * sempre vai ter o seu eixo X com o valor 0;
	 */
	/*
	 * @Override public int compareTo(ElementoDoJogo elemento){
	 * 
	 * //elemento.getPosicao();
	 * 
	 * //fazer uma ordenaï¿½ï¿½o? if(elemento.getPosicao().getCoordenadaX() ==
	 * 0){ return 1; }else{ return 0; } }
	 */

	/**
	 * Método que imprime o elemento na posição;Cada classe implementa a sua
	 * maneira este método
	 * 
	 */
	public abstract char getLetrinha();

	/**
	 * Método que atualiza a posição do elemento do jogo
	 * 
	 * @param entrada
	 */
	public void atualizar(int entrada) {
	}

	public boolean visivel() {
		boolean visibilidade = true;

		if (this.getPosicao().getCoordenadaY() < 1
				|| this.getPosicao().getCoordenadaY() > 799) {
			visibilidade = false;
		}
		return visibilidade;
	}

}
