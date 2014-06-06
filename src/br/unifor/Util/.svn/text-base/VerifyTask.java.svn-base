package br.unifor.Util;

import java.awt.Color;
import java.awt.Graphics;

import br.unifor.Panels.Grid;

public class VerifyTask implements Runnable {

	@Override
	public void run() {
		int x = 0,y = 0;
		boolean pontuar = false;
		synchronized(this){
			while(true){
			   for(Color[] c : Tarefa.cells){
				   for(Color a : c){
					   if(a != null){
						   pontuar = true;
					   }else{
						   pontuar = false;
						   break;
					   }
					   x++;
				   }
				   if(pontuar){
					   ajustar(x,y);
					   pontuar = false;
				   }
				   y++;
			   }
			   x = y = 0;
			}			
		}
	}
	
	void ajustar(int x,int y){
		Graphics g = Grid.getInstance().getGraphics();	
		//desloca na vertical
		for(int y1 = 1;y1 <= Grid.getInstance().getBounds().getHeight();y1++){
			
			g.setColor(game_config.BLOCK_BORDER_COLOR);
			g.drawRect(x, y1, game_config.WIDTH, game_config.HEIGHT);
			
			Color e = Tarefa.cells[x][y - 1];
			g.setColor(e);
			g.fillRect(x, y1, game_config.WIDTH, game_config.HEIGHT);
			Tarefa.cells[x][y - 1] = null;
		}
		
		Grid.getInstance().paint(g);
	}
	
}
