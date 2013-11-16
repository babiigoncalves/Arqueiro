package classesBasicas;

import imagem.Imagem;
import interfaces.InterfaceElementos;
import posicao.Ponto;

/**
 * 
Classe Elemento -Abstrata

O elemento do jogo pode ser um alvo ou o arqueiro.
O alvo ir� se mover sozinho e o arqueiro se move a partir da entrada do usu�rio;

O arqueiro atira e alguns alvos podem atirar,outras n�o;

 * @author Babi
 *
 */
public abstract class ElementoDoJogo implements InterfaceElementos {
	
	private Imagem imagem;
	private Ponto posicao;
	
	//protected Projetil tiro;
	
	private int posicaoX;
	private int posicaoY;

	
	public ElementoDoJogo() {

		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public ElementoDoJogo(Imagem imagem, Ponto posicao, Projetil tiro) {
		this.imagem = imagem;
		this.posicao = posicao;
		//this.tiro = tiro;
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


	public void mover(){
		
	}
	
	public void atirar(){
		
		
	}
	
/*	
 * 
 * *//**
	 * M�todo para informar se o elemento do jogo � um arqueiro.
	 * O arqueiro sempre vai ter o seu eixo X com o valor 0;
	 *//*
	@Override
	public int compareTo(ElementoDoJogo elemento){
		
		//elemento.getPosicao();
	
			//fazer uma ordena��o?
		if(elemento.getPosicao().getCoordenadaX() == 0){
			return 1;
		}else{
			return 0;
		}
	}
	
	*
	*/
	
	/**
	 * M�todo que imprime o elemento na posi��o;Cada classe implementa a sua maneira este m�todo
	 * 
	 */
	//public abstract char getLetrinha();
/**
 * M�todo que atualiza a posi��o do elemento do jogo
 * @param entrada
 */
	public void atualizar(int entrada) {}
	
}
