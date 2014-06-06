/**
 * Classe de configuração do jogo
 * aqui onde é setado a posição inicial assim como largura,altura e velocidade padrão.
 */
package br.unifor.Util;

import java.awt.Color;

public class game_config {
	
      public static final int 
      	      X0 = 163,
    		  Y0 = -5,
    		  WIDTH = 30, 
    		  HEIGHT = 30,
    		  TELA_L = 442,
    		  TELA_A = 580,
    		  SPEED_DEFAULT = 300,
    		  SPEED_HIGH = 50;
      
      public static final Color
      	       STAGE_COLOR = Color.GREEN.brighter(),
      	       BLOCK_BORDER_COLOR = Color.WHITE,
      	       BLOCK_FILL_COLOR = Color.RED,
      	       GRID_COLOR = Color.BLACK;
       
}
