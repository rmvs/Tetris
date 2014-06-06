package br.unifor.Panels;

import java.awt.Color;
import java.awt.Graphics;

import br.unifor.Util.game_config;


public class Grid extends javax.swing.JPanel implements IPainel {
          
	private Grid(){
        config();
    }
	protected static Grid instance = null;
	public static Grid getInstance(){
		return instance == null ? instance = new Grid() : instance;
	}
	
	public void config(){
		this.setBackground(game_config.STAGE_COLOR);		
	}
	
	boolean isBuild = false;
	@Override
	public void paint(Graphics g) {				
		super.paint(g);
		g.setColor(game_config.GRID_COLOR);	  
		
		for(int i = 1,j = game_config.HEIGHT;i <= 18;i++,j += game_config.HEIGHT){
			g.drawLine(0, j,(int) this.getBounds().getWidth(), j);				
		}
		
		for(int i = 1,j = game_config.WIDTH;i <= 10;i++,j+=game_config.WIDTH){
			g.drawLine(j, 0, j,(int) this.getBounds().getHeight());				
		}
	}
          
}
