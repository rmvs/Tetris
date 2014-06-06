package br.unifor.Shape;

import br.unifor.Util.Ponto;
import br.unifor.Util.game_config;

public class TETRIS_I extends Shape {
	
	public TETRIS_I(){
		super();
	}
	
	public TETRIS_I(int WIDTH,int HEIGHT){
		super(WIDTH, HEIGHT);
	}
	/**
	 * (a,a)
	 * (a,a-H)
	 * (a,a+H)
	 * (a,a+H)
	 **/
	@Override
	protected void config() {
		super.points = new Ponto[]{
				new Ponto(game_config.X0, game_config.Y0),
				new Ponto(game_config.X0, game_config.Y0 + game_config.HEIGHT),
				new Ponto(game_config.X0, game_config.Y0 + game_config.HEIGHT*2),
				//new Ponto(game_config.X0, game_config.Y0 + game_config.HEIGHT*3),
		};
	}

	@Override
	public void rotaciona() {
		if(!isRotated){
			
		}else{
			
		}
	}

}
