package controladores;

import java.util.Scanner;

import classesBasicas.Alvo;
import classesBasicas.Arqueiro;
import classesBasicas.Cenario;
import classesBasicas.CenarioTeste;
import posicao.Ponto;
import eventos.EntradasDoUsuario;
import eventos.Movimentos;
/**
 * M�todo que faz as chamadas dos m�todos para inicializar o jogo
 * @author Babi
 *
 */
public class Jogo {

	public static void main(String[] args) {
		
		
		 CenarioTeste game = new CenarioTeste();
		  game.run();
		
		
	/*	Cenario cenario = new Cenario();
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

		//la�o para as entradas
		
		while(x>0){
		//mov.MovimentoArqueiro(arq.getPosicao(),arq);
		pontoAux =mov.MovimentoArqueiro(arq.getPosicao(),arq);
		arq.setPosicao(pontoAux);
		
		//System.out.println("Teste nova posi��o "+pontoAux);
		cenario.atualizarCenario(arq);
		cenario.imprimirTabuleiro();
		x--;
		}
	
		//cenario.inicializarTabuleiro();
		
		//cenario.testeCenario(cenario);
*/	}
	
	

}
