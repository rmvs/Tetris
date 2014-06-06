/**
 * Classe Forma: classe pai para as demais formas do jogo
 */
package br.unifor.Shape;

import java.awt.Color;
import java.awt.Rectangle;

import br.unifor.Util.Ponto;
import br.unifor.Util.game_config;

public abstract class Shape {
 
	    // TODO: DEVE ESPECIALIZAR A FORMA
	    protected boolean isRotated = false;
	    protected Ponto[] points;	    
	    private Color cor;
	    	    
	    public boolean isEncostou = false;
	    private int WIDTH,HEIGHT;
	    
	    public Color getCor(){
	    	return cor;
	    }
	    
	    public void setCor(Color cor){
	    	this.cor = cor;
	    }
	    
	    public void create(){
	    	Rectangle r = new Rectangle();
	    	
	    }

		public int getWIDTH() {
			return WIDTH;
		}

		public void setWIDTH(int wIDTH) {
			WIDTH = wIDTH;
		}

		public int getHEIGHT() {
			return HEIGHT;
		}

		public void setHEIGHT(int hEIGHT) {
			HEIGHT = hEIGHT;
		}

		public Ponto[] getPoints() {
			return points;
		}

		public void setPoints(Ponto[] points) {
			this.points = points;
		}
		
		public Shape(){
			setWIDTH(game_config.WIDTH);
			setHEIGHT(game_config.HEIGHT);
			config();
		}
		
		public Shape(int WIDTH,int HEIGHT){
			setWIDTH(WIDTH);
			setHEIGHT(HEIGHT);
			config();
		}
		
		protected abstract void config();
		
		public abstract void rotaciona();
		private Rectangle rectangle = null;
        public Rectangle getRectangle(){
        	if(this.rectangle == null){
        		return new Rectangle(game_config.WIDTH*4,game_config.HEIGHT*4);
        	}
        	return this.rectangle;
        }
		public String Cor = "";
}
