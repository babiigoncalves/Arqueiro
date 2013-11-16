package eventos;
   
import java.awt.event.KeyEvent;    

public class EntradasDoUsuario{
	KeyEvent tecla;
	int resultado;
		  
	public int lerEntradas(){
		resultado = 0;
		if(tecla.getKeyCode() == KeyEvent.VK_UP){
			resultado = 1;
		}
		
		if(tecla.getKeyCode() == KeyEvent.VK_DOWN){
			resultado = 0;
		}
		
		return resultado;
	}     
}