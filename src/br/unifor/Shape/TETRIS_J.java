package br.unifor.Shape;

import br.unifor.Util.Ponto;
import br.unifor.Util.game_config;

public class TETRIS_J extends Shape {
	public TETRIS_J(){
		super();
	}
	
	public TETRIS_J(int WIDTH,int HEIGHT){
		super(WIDTH, HEIGHT);
	}
	
	/**                    _
	 *(x,y)               | |
	 *(x ,y + A)         _| |
	 *(x ,y + A * 2)    |___| 
	 *(x - L,y + A * 2 )
	 **/
	
	@Override
	protected void config() {
		super.points = new Ponto[]{
				new Ponto(game_config.X0, game_config.Y0),
				new Ponto(game_config.X0, (game_config.Y0 + game_config.HEIGHT)),
				new Ponto(game_config.X0, (game_config.Y0 + game_config.HEIGHT*2)),
				new Ponto(game_config.X0 - game_config.WIDTH, (game_config.Y0 + game_config.HEIGHT*2)),
		};
	}

	@Override
	public void rotaciona() {
		// TODO Auto-generated method stub

	}

}
