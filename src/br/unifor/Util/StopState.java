/**
 * Estado que representa quando o jogo parou
 */
package br.unifor.Util;

import br.unifor.Game.Main;

public class StopState implements State {

	@Override
	public void doAction(Main context) {
		((Tarefa)context.getTarefa()).suspender();
		context.setAppState(this);
	}
	
	@Override
	public String toString() {
		return "Jogo Pausado";
	}

}
