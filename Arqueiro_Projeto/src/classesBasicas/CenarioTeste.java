package classesBasicas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;

import eventos.EntradasDoUsuario;
import posicao.Ponto;
/**
 * Método que constrói o cenário gráfico e desenha os elementos do jogo
 * @author Babi
 *
 */
public class CenarioTeste extends JFrame implements KeyListener{

	private EntradasDoUsuario input;
	private List<ElementoDoJogo> elementos = new LinkedList<ElementoDoJogo>();
	

	 BufferedImage backBuffer; 
	 int FPS = 30;
	 int janelaW = 800;
	 int janelaH = 600;
	 char teclaPressionada;
	 int xBola =10 ,yBola =300;
	 Arqueiro arq = new Arqueiro();
	 Alvo alvo = new Alvo();
	 Flecha flecha = new Flecha();
	 
	 public Ponto PosicaoArq(){
		Ponto ponto = new Ponto(xBola,yBola);	
		arq.setPosicao(ponto);
		
		return arq.getPosicao();
		
	}
	 
	 public Ponto PosicaoAlvo(){
		 Ponto ponto = new Ponto(600,500);
		 alvo.setPosicao(ponto);
		 
		 return alvo.getPosicao();
	 }
	 
	 public Ponto PosicaoFlecha(){
		 Ponto ponto = new Ponto();
		 ponto.setCoordenadaX(arq.getPosicao().getCoordenadaX());
		 ponto.setCoordenadaY(arq.getPosicao().getCoordenadaY());
		 
		 flecha.setPosicao(ponto);
		 
		 return flecha.getPosicao();
		 
	 }
	
	 public void desenharGraficos() {
		  int x,y;
		  Graphics g = getGraphics(); 
		  Graphics bbg = backBuffer.getGraphics();
		  Graphics bbg2 = backBuffer.getGraphics();
		  Graphics bbg3 = backBuffer.getGraphics();
		  
		  bbg.setColor(Color.GREEN);
		  bbg2.setColor(Color.BLUE);
		  bbg3.setColor(Color.CYAN);
		  bbg.fillRect(0, 0, janelaW, janelaH); 
		   
		  bbg.setColor(Color.RED);
		  PosicaoArq();
		  x=arq.getPosicao().getCoordenadaX();
		  y=arq.getPosicao().getCoordenadaY();
		  
		  //DESENHA UMA BOLA VERMELHA NA TELA
		  bbg.fillOval(x, y, 50, 50);
		  //DESENHA UMA BOLA AZUL -ALVO
		  
		  PosicaoAlvo();
		  x=alvo.getPosicao().getCoordenadaX();
		  y=alvo.getPosicao().getCoordenadaY();
		  bbg2.fillOval(x, y, 30, 30);
		  
		  PosicaoFlecha();
		  x=flecha.getPosicao().getCoordenadaX();
		  y=flecha.getPosicao().getCoordenadaY();
		  
		  bbg3.fillOval(x, y, 20, 30);
		   
		  g.drawImage(backBuffer, 0, 0, this);
		 }
	 
	 
	 public void inicializar() {
		  setTitle("Arqueiro");
		  setSize(janelaW, janelaH);
		  setResizable(false);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setLayout(null);
		  setVisible(true);
		  backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);
		   
		 //Keylistener
		  addKeyListener(this);
		 }
	 public void atualizar() {
		 
	 }
	 public void run() {
		  inicializar();
		  while (true) {
		   atualizar();
		   desenharGraficos();
		    try {
		     Thread.sleep(1000/FPS);
		    } catch (Exception e) {
		     
		    	System.out.println("Thread interrompida!");
		    }
		  }
		 }
	 
	 /*Testar*/
	 public void inicializarCenario()
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

	 
	 
	 
	 /*Eventos do teclado*/
	 public void keyPressed(KeyEvent e) {
		   
		  
		  //teclaPressionada = e.getKeyChar();
		   
		  
		  if(e.getKeyCode() == KeyEvent.VK_UP){
		   yBola -= 10;
		  }
		  
		  if(e.getKeyCode() == KeyEvent.VK_DOWN){
		   yBola += 10;
		  }
		   
		 }


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			xBola = +10;
			
		}
		
	}
}
