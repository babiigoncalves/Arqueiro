package controladores;

import java.util.Scanner;

import classesBasicas.Alvo;
import classesBasicas.Arqueiro;
import classesBasicas.Cenario;
import posicao.Ponto;
import eventos.EntradasDoUsuario;
import eventos.Movimentos;
/**
 * Método que faz as chamadas dos métodos para inicializar o jogo
 * @author Babi
 *
 */
public class Jogo {

	public static void main(String[] args) {
		Cenario cenario = new Cenario();
		Arqueiro arq = new Arqueiro();
		Alvo alvo = new Alvo();
		Ponto pontoAux = new Ponto();
		//EntradasDoUsuario entrada = null;
		Movimentos mov = new Movimentos();
		int x = 3;
		
		Scanner input = new Scanner(System.in);	
		
		String entrada;
		
	
		
		
		cenario.inicializarTabuleiro();
		arq.inicializarArqueiroNoCenario(arq);
		alvo.inicializarAlvoNoCenario(alvo);
		cenario.imprimirTabuleiro();

		//laço para as entradas
		
		while(x>0){
		//mov.MovimentoArqueiro(arq.getPosicao(),arq);
		pontoAux =mov.MovimentoArqueiro(arq.getPosicao(),arq);
		arq.setPosicao(pontoAux);
		//System.out.println("Teste nova posição "+pontoAux);
		cenario.atualizarCenario(arq);
		cenario.imprimirTabuleiro();
		x--;
		}
	
		//cenario.inicializarTabuleiro();
		
		//cenario.testeCenario(cenario);
	}
	
	

}
