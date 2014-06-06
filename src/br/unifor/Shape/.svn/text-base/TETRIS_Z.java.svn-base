package br.unifor.Shape;

import br.unifor.Util.Ponto;
import br.unifor.Util.game_config;

public class TETRIS_Z extends Shape{

	public TETRIS_Z(){
		super();
	}
	
	public TETRIS_Z(int WIDTH,int HEIGHT){
		super(WIDTH, HEIGHT);
	}
	/**
	 * (a,a)
	 * (a-W,a)
	 * (a,a-H)
	 * (a+W,a-H)
	 **/
	@Override
	protected void config() {
		super.points = new Ponto[]{
		new Ponto(game_config.X0, game_config.Y0),
		new Ponto(game_config.X0 - game_config.WIDTH,game_config.Y0),
		new Ponto(game_config.X0,game_config.Y0 + game_config.HEIGHT),
		new Ponto(game_config.X0 + game_config.WIDTH,game_config.Y0 + game_config.HEIGHT)
		};
		
	}
	
	public Ponto[] getPrevia(){
		return new Ponto[]{
				new Ponto(10, 10),
				new Ponto(5,10),
				new Ponto(10,20),
				new Ponto(20,20)
		};
	}

	@Override
	public void rotaciona() {
		if(!isRotated){
			super.points[1] = new Ponto(super.points[1].getX() + game_config.WIDTH*2,super.points[1].getY() + game_config.HEIGHT*2);
			isRotated = true;
		}else{
			super.points[1] = new Ponto(super.points[1].getX() - game_config.WIDTH*2,super.points[1].getY() - game_config.HEIGHT*2);
			isRotated = false;
		}
	}

}
