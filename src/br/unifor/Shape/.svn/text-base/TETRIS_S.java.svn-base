/**
 * Classe que representa o S e métodos associados.
 */
package br.unifor.Shape;

import br.unifor.Util.Ponto;
import br.unifor.Util.game_config;

public class TETRIS_S extends Shape {

	/**
	 * Configurações do S (a-L,a) (a,a) (a,a-H) (a+L,a - H)
	 */

	protected void config() {
		super.points = new Ponto[] {
				/*new Ponto(game_config.X0 - getWIDTH(), game_config.Y0),
				new Ponto(game_config.X0, game_config.Y0), // centro
				new Ponto(game_config.X0, game_config.Y0 - getHEIGHT()),
				new Ponto(game_config.X0 + getWIDTH(), game_config.Y0
						- getHEIGHT())*/
				new Ponto(game_config.X0, game_config.Y0),
				new Ponto(game_config.X0 + getWIDTH(), game_config.Y0),
				new Ponto(game_config.X0, game_config.Y0 + getHEIGHT()), // centro
				new Ponto(game_config.X0 - getWIDTH(),game_config.Y0 + getHEIGHT())				
				};
	}

	public TETRIS_S(int WIDTH, int HEIGHT) {
		super(WIDTH, HEIGHT);
	}

	public TETRIS_S() {
		super();
	}

	@Override
	public void rotaciona() {
		// TODO Auto-generated method stub
		if (!isRotated) {
			super.points[3] = new Ponto(super.points[3].getX() + game_config.WIDTH*2,super.points[3].getY() - game_config.HEIGHT*2);
			isRotated = true;
		} else {
			super.points[3] = new Ponto(super.points[3].getX() - game_config.WIDTH*2,super.points[3].getY() + game_config.HEIGHT*2);
			isRotated = false;
		}
	}

	@Override
	public String toString() {
		return "S";
	}
}
