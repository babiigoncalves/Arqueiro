package eventos;

import java.awt.event.KeyListener;    
import java.awt.event.KeyEvent;    

public class EntradasDoUsuario implements KeyListener{
	int resultado;
	
	public void keyPressed(KeyEvent e){  
	    // Não precisa de implementação, pois o KeyListener é uma interface que possui assinaturas de métodos. 
		// E quando se utiliza uma interface, é obrigada a implementação de todos os seus métodos. 
	}
	
	public void keyReleased(KeyEvent e){  
		// Não precisa de implementação, pois o KeyListener é uma interface que possui assinaturas de métodos.
		// E quando se utiliza uma interface, é obrigada a implementação de todos os seus métodos. 
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

