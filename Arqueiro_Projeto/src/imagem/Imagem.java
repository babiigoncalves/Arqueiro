package imagem;

import java.awt.Image;

import posicao.Ponto;

public class Imagem {
		
		protected Image imagem;
		
		protected Ponto posicao;
		
		private boolean visibilidade; //atributo que ir� checar quando a imagem dever� aparecer ou desaparecer do cen�rio
		protected boolean checar; //checa o ciclo de vida da imagem.
		
		protected int deslocamentoY;

		public Image getImagem() {
			return imagem;
		}

		public void setImagem(Image imagem) {
			this.imagem = imagem;
		}

		
		public boolean EhVisivel() {
			return visibilidade;
		}
		
		public void checar(){
			this.visibilidade = false;
		}
}
