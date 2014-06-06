/**
 * Estado que representa quando o jogo começou ou resumiu
 */
package br.unifor.Util;

import java.util.logging.Logger;

import br.unifor.Game.Main;

public class StartState implements State {

	@Override
	public void doAction(Main context) {
		((Tarefa)context.getTarefa()).resumir();
		context.setAppState(this);
	}
	
	@Override
	public String toString() {
		return "Jogo Resumido";
	}

}
