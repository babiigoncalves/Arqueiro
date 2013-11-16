package eventos;

import java.util.Scanner;

import posicao.Ponto;
import classesBasicas.Arqueiro;
import classesBasicas.Cenario;

public class Movimentos {
	
	public Movimentos(){
		
	}
	
	public Ponto MovimentoArqueiro(Ponto ponto,Arqueiro arq){
		
		Scanner input = new Scanner(System.in);
		int entrada;
		//int teste;
		//Cenario cenario = new Cenario();
		Ponto teste = null;
		//entrada.lerEntradas();
		System.out.println("Informe o movimento");
		entrada = input.nextInt();
		
		if(entrada == 1){
			teste = deslocamentoYup(arq);
		}
		if(entrada ==2){
			teste  = deslocamentoYdown(arq);
		}
		
		//System.out.println("O teste eh\n" + teste.toString());
		
		return teste;
	}
	
	public Ponto deslocamentoYup(Arqueiro arq){
		Ponto pontoAtual;
		Ponto pontoNovo = new Ponto();
		
		int eixoY;
		
		pontoAtual = arq.PosicaoDoArqueiro(arq);//atualizar aqui
		eixoY=arq.PosicaoDoArqueiro(arq).getCoordenadaY(); //tá aqui pq o arqueiro não sobe quando tem que subir;Ajeitar a matriz;
		
		eixoY++;
		
		pontoNovo.setCoordenadaY(eixoY);
		pontoNovo.setCoordenadaX(0);

		return pontoNovo;
	}
	
	public Ponto deslocamentoYdown(Arqueiro arq){
		Ponto pontoAtual;
		Ponto pontoNovo = new Ponto();
		
		int eixoY;
		
		pontoAtual = arq.PosicaoDoArqueiro(arq);
		eixoY=arq.PosicaoDoArqueiro(arq).getCoordenadaY();
		
		eixoY--;
		
		pontoNovo.setCoordenadaY(eixoY);
		pontoNovo.setCoordenadaX(0);
		
		return pontoNovo;
	}
	
	
}
