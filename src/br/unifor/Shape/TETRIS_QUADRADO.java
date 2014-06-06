/**
 * Classe que representa o quadrado e métodos associados.
 */
package br.unifor.Shape;

import br.unifor.Util.Ponto;
import br.unifor.Util.game_config;

public class TETRIS_QUADRADO extends Shape {

	public TETRIS_QUADRADO(){
		super();
	}
	
	public TETRIS_QUADRADO(int WIDTH,int HEIGHT){
		super(WIDTH, HEIGHT);
	}

	/**              ___
	 * (a,a)        |_|_|
	 * (a-W,a)      |_|_|
	 * (a-W,a-H)
	 * (a,a-H)
	 */
	@Override
	protected void config() {
		super.points = new Ponto[]{			
			new Ponto(game_config.X0 - game_config.WIDTH,game_config.Y0),
			new Ponto(game_config.X0,game_config.Y0),
			new Ponto(game_config.X0 - game_config.WIDTH,game_config.Y0 - game_config.HEIGHT),
			new Ponto(game_config.X0,game_config.Y0 - game_config.HEIGHT)
		};
	}

	@Override
	public void rotaciona() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Q";
	}
}
