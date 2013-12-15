package classesBasicas;

import imagem.Imagem;
import posicao.Ponto;
import eventos.EntradasDoUsuario;
import eventos.Movimentos;

public class Arqueiro extends ElementoDoJogo {
	
	private Imagem imagemArqueiro;
	
	protected Ponto posicao;

	private Flecha flechas;
	
	protected int deslocamentoY;
	
	//O arqueiro atira e se move;
	

	public Imagem getImagemArqueiro() {
		return imagemArqueiro;
	}

	public void setImagemArqueiro(Imagem imagemArqueiro) {
		this.imagemArqueiro = imagemArqueiro;
	}

	public Ponto getPosicao() {
		return posicao;
	}

	public void setPosicao(Ponto posicao) {
		
		if(posicao.getCoordenadaY()>30 && posicao.getCoordenadaY() <550){
			this.posicao = posicao;
		}
	}

	public Flecha getFlechas() {
		return flechas;
	}

	public void setFlechas(Flecha flechas) {
		this.flechas = flechas;
	}
	/**
	 * Método que define a posição inicial do arqueiro no cenário.
	 * Obs.: por recomendação dos monitores este método foi implementado aqui.
	 * @param arq
	 */
	public void inicializarArqueiroNoCenario(Arqueiro arq){
		//Inicializando o ponto que o arqueiro irá começar no cenário.
		Ponto ponto = new Ponto(0, 5);
		arq.setPosicao(ponto);
		
		int eixoX = arq.getPosicao().getCoordenadaX();
		int eixoY = arq.getPosicao().getCoordenadaY(); 
	
		//System.out.println("\tA");
		 
	}
	
	/**
	 * Método que retorna a posição do arqueiro ao inicializar.
	 * @param arq
	 * @return
	 */
	public Ponto PosicaoDoArqueiro(Arqueiro arq){
		
		arq.inicializarArqueiroNoCenario(arq);
	
			return arq.getPosicao();
		
		
	}

	@Override
	public char getLetrinha() {
		
		return 'A';
	}
	
	public void atualizar(int entrada) {
		EntradasDoUsuario ent = new EntradasDoUsuario();
		
		entrada = ent.lerEntradas();
		
		switch (entrada) {
		case 0:
			getPosicao().setCoordenadaY( getPosicao().getCoordenadaY() - 1 );
		case 1:
			getPosicao().setCoordenadaY( getPosicao().getCoordenadaY() + 1 );
		}
		
	}

	
}
