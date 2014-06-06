/**
 * Classe que utilitária que armazena um par de coordenadas
 */
package br.unifor.Util;

import java.awt.Point;
import java.awt.Rectangle;

public class Ponto {
        private int x,y;
        private Rectangle rect;
        public Ponto(){
        	
        }
        
        public Ponto(int x,int y){
        	setX(x);
        	setY(y);
        	rect = new Rectangle(new Point(x,y));
        	rect.width = game_config.WIDTH;
        	rect.height = game_config.HEIGHT;
        }
        
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		public Rectangle getRect(){
			return rect;
		}
		
		@Override
		public String toString() {
		   return "X: " + getX() + " Y: "+ getY();
		}
}
