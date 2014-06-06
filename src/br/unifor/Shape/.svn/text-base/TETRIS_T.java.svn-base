package br.unifor.Shape;

import br.unifor.Util.Ponto;
import br.unifor.Util.game_config;

public class TETRIS_T extends Shape {
	
	public TETRIS_T(){
		super();
	}
	
	public TETRIS_T(int WIDTH,int HEIGHT){
		super(WIDTH, HEIGHT);
	}
	
	/**                _____
	 *(a,a)           |_   _|
	 *(a+W,a)           |_|
	 *(a-W,a) 
	 *(a,a+H) 
	 **/
	
	@Override
	protected void config() {
		super.points = new Ponto[] {
		new Ponto(game_config.X0, game_config.Y0),
		new Ponto(game_config.X0 + game_config.WIDTH, game_config.Y0),
		new Ponto(game_config.X0 - game_config.WIDTH, game_config.Y0),
		new Ponto(game_config.X0, game_config.Y0 + game_config.HEIGHT)
		};
	}

	@Override
	public void rotaciona() {
		// TODO Auto-generated method stub

	}

}
