package eventos;

import java.awt.event.KeyListener;    
import java.awt.event.KeyEvent;    

public class EntradasDoUsuario implements KeyListener{
	int resultado;
	
	public void keyPressed(KeyEvent e){  
	    // N�o precisa de implementa��o, pois o KeyListener � uma interface que possui assinaturas de m�todos. 
		// E quando se utiliza uma interface, � obrigada a implementa��o de todos os seus m�todos. 
	}
	
	public void keyReleased(KeyEvent e){  
		// N�o precisa de implementa��o, pois o KeyListener � uma interface que possui assinaturas de m�todos.
		// E quando se utiliza uma interface, � obrigada a implementa��o de todos os seus m�todos. 
	}  
		  
	public void keyTyped(KeyEvent e){  
		if(e.getKeyCode() == KeyEvent.VK_UP){
			resultado = 1;
		} 
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			resultado = 0;
		}
	}
	
	public int lerEntradas(){
		return resultado;
	}
}

