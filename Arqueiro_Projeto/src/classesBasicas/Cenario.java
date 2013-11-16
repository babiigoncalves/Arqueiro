package classesBasicas;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;

import eventos.EntradasDoUsuario;
import posicao.Ponto;

public class Cenario {
	
	private EntradasDoUsuario input;
	private List<ElementoDoJogo> elementos = new LinkedList<ElementoDoJogo>();

	public void inicializarTabuleiro()
	{
		input = new EntradasDoUsuario();
		Ponto ponto = new Ponto(0,5);
		Ponto pontoAlvo = new Ponto(9,3);
		
		Arqueiro arq = new Arqueiro();
		
		Alvo alvo = new Alvo();
		
		arq.setPosicao(ponto);
		alvo.setPosicao(pontoAlvo);
		
		elementos.add(arq);
		elementos.add(alvo);
		
		System.out.println();
	}
	/**
	 * Método que imprime a matriz que forma o cenário através de uma matriz.
	 */
	public void imprimirTabuleiro(){
		
		char[][] campo = new char[10][10];
		
		for(ElementoDoJogo elemento : elementos)
		{
			int x,y;
			x = elemento.getPosicao().getCoordenadaX();
			y = elemento.getPosicao().getCoordenadaY();
			
			campo[x][y] = elemento.getLetrinha();
		}
		
		StringBuilder builder = new StringBuilder();
		
		for (int x = 0; x < campo.length; x++) {
			builder.append("[ ");
			for(int y = 0 ; y < campo[x].length ; y++){
				if (y != 0) {
					builder.append(", ");
				}
				builder.append(campo[y][x]);
			}
			builder.append(" ]\n");
		}
		
		String texto = builder.toString();
		
		System.out.println(texto);
	}
	
	/**
	 * Método que atualiza o cenário quando movemos o arqueiro na tela.
	 * @param arq
	 */
	public void atualizarCenario(Arqueiro arq) {

		for(ElementoDoJogo elemento : elementos) {
			int entrada = input.lerEntradas();
			elemento.atualizar(entrada);
		}
	}
	
}