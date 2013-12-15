package classesBasicas;

import imagem.Imagem;
import posicao.Ponto;

public class Flecha extends ElementoDoJogo {

	protected int quantidade = 10;

	private Ponto posicaoFlecha;

	protected Imagem imagemFlecha;

	public int getQuantidade() {
		return quantidade;
	}

	public Ponto getPosicaoFlecha() {
		return posicaoFlecha;
	}

	public void setPosicaoFlecha(Ponto posicaoFlecha) {
		if(posicao.getCoordenadaY()>30 && posicao.getCoordenadaY() <550){
		this.posicaoFlecha = posicaoFlecha;
		}
	}

	public Imagem getImagemFlecha() {
		return imagemFlecha;
	}

	public void setImagemFlecha(Imagem imagemFlecha) {
		this.imagemFlecha = imagemFlecha;
	}

	@Override
	public char getLetrinha() {

		return '>';
	}

	public void atualizar(int entrada) {
		this.getPosicao()
				.setCoordenadaX(this.getPosicao().getCoordenadaX() + 1);
	}

}
