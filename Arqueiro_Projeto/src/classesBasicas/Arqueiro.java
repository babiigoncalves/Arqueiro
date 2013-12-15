package classesBasicas;

import java.util.ArrayList;

import imagem.Imagem;
import posicao.Ponto;
import eventos.EntradasDoUsuario;
import eventos.Movimentos;

public class Arqueiro extends ElementoDoJogo {
	
	private Imagem imagemArqueiro;
	
	protected Ponto posicao;

	//private Flecha flechas;
	
	protected int deslocamentoY;
	
	private ArrayList<Flecha> flecha;
	
	//O arqueiro atira e se move;
	

	public Imagem getImagemArqueiro() {
		return imagemArqueiro;
	}

	public Arqueiro() {
		flecha = new ArrayList();
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


	public ArrayList<Flecha> getFlecha() {
		return flecha;
	}

	public void setFlecha(ArrayList<Flecha> flecha) {
		this.flecha = flecha;
	}

	/**
	 * M�todo que define a posi��o inicial do arqueiro no cen�rio.
	 * Obs.: por recomenda��o dos monitores este m�todo foi implementado aqui.
	 * @param arq
	 */
	public void inicializarArqueiroNoCenario(Arqueiro arq){
		//Inicializando o ponto que o arqueiro ir� come�ar no cen�rio.
		Ponto ponto = new Ponto(0, 5);
		arq.setPosicao(ponto);
		
		int eixoX = arq.getPosicao().getCoordenadaX();
		int eixoY = arq.getPosicao().getCoordenadaY(); 
	
		//System.out.println("\tA");
		 
	}
	
	/**
	 * M�todo que retorna a posi��o do arqueiro ao inicializar.
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
	
	public void atira(){
		 
		 flecha.add(new Flecha(posicao.getCoordenadaX() + 20));
		 
		 }

	
}
