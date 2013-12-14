package eventos;

import java.awt.event.KeyListener;    
import java.awt.event.KeyEvent;    
import java.util.Scanner;

public class EntradasDoUsuario implements KeyListener{
	private int resultado;
	
	public void keyPressed(KeyEvent e){  
	    // N�o precisa de implementa��o, pois o KeyListener � uma interface que possui assinaturas de m�todos. 
		// E quando se utiliza uma interface, � obrigada a implementa��o de todos os seus m�todos. 
	}
	
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

