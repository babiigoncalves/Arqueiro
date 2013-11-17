package eventos;

import java.awt.event.KeyListener;    
import java.awt.event.KeyEvent;    
import java.util.Scanner;

public class EntradasDoUsuario implements KeyListener{
	private int resultado;
	int xBola=10, yBola=300;
/*	public void keyPressed(KeyEvent e){  
	    // N�o precisa de implementa��o, pois o KeyListener � uma interface que possui assinaturas de m�todos. 
		// E quando se utiliza uma interface, � obrigada a implementa��o de todos os seus m�todos. 
	}
	*/
	public void keyReleased(KeyEvent e){  
		// N�o precisa de implementa��o, pois o KeyListener � uma interface que possui assinaturas de m�todos.
		// E quando se utiliza uma interface, � obrigada a implementa��o de todos os seus m�todos. 
	}  
		  
	public void keyTyped(char teclaPressionada){  
		 
		 //teclaPressionada = e.getKeyChar();
		 
		if(teclaPressionada == KeyEvent.VK_UP){
			this.resultado = 1;
		} 
		
		if(teclaPressionada == KeyEvent.VK_DOWN){
			this.resultado = 0;
		}
	}
	
	public int lerEntradas(){
		
		return this.resultado;
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
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


/*	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			xBola = +10;
			
		}
		
	}*/
}

