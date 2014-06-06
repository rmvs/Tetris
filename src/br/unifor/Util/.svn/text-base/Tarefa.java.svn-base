/**
 * Thread que interage na execução das formas
 */
package br.unifor.Util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.sound.sampled.EnumControl;

import br.unifor.Game.Main;
import br.unifor.Panels.Grid;
import br.unifor.Panels.PainelDireito;
import br.unifor.Panels.PainelEsquerdo;
import br.unifor.Shape.Shape;
import br.unifor.Shape.TETRIS_QUADRADO;

public class Tarefa extends Thread {
		
	    private static Tarefa instance = null;
	    public static int SLEEP_SPEED = game_config.SPEED_DEFAULT;
	    Shape shape;
	    Graphics g;
	    Runnable r;
	    Main principal;	    
	    int[] x = new int[10],y = new int[18];
	    Ponto[][] points = new Ponto[18][10];
	    private Tarefa(Graphics g,Main principal){	
	    	this.g = g;
		    this.principal = principal;
		    //cells = new Color[game_config.TELA_L][game_config.TELA_A];
		    cells = new Color[10][18];
		    System.out.println((int)Grid.getInstance().getBounds().getHeight());
		    this.principal.getGraphics().setColor(Color.BLACK);
		    this.principal.getGraphics().drawRect(100,100, 484, 484);
		    
		} 
	    
	    public static Tarefa getInstance(Graphics g,Main principal){
	    	if(instance == null)
	    		instance = new Tarefa(g,principal);
	    	return instance;
	    }
	    
	    public static Tarefa getInstance(){
	    	if(instance == null){	    		
	    	   return null;    	  
	    	}
	    	return instance;
	    }	    
	    
	    public static Color[][] cells;
	    Ponto temp = new Ponto();
	    Rectangle form;
	    private boolean suspend = false;
	    private Rectangle floor = null;
	    @Override
	    public void run() {	    		    	
	    	
	    	shape = ShapeQueue.getInstance().Dequeue();
	    	shape.setCor(Color.RED);
	    	g.setColor(shape.getCor());	    	
	    	synchronized(this){	    		
	    		while(true){
	        	  try {		        		  
	        		  // desenha na tela
	        		  draw(READ_DIR);
	        		  
	        		  // pausa por alguns segundos
					  sleep(SLEEP_SPEED);
					 
					  // se caso suspender,faz a thread esperar
					  if(suspend)
	        			  wait();
					 //clear();
					  principal.paint(g);					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	          }	    		
	    	}
	    	
	          
	    }
	    
	    ArrayList<Shape> s = new ArrayList<Shape>();
	    Integer idx = null,idy = null;
	    // limpa a posição anterior
	    private void clear(){	    	
	    	Ponto[] pts = shape.getPoints();
	    	for(int i = 0;i < pts.length;i++){	    		
	    		g.clearRect(pts[i].getX(), pts[i].getY(), this.shape.getWIDTH(), this.shape.getHEIGHT());	   		
	    	   
	    	}	    	
	    	
	    }
	    
	    boolean isLeftEnabled = true,isRightEnabled = true,isDownEnabled = true,
	    		fimShape = false,doNotClear = false,encostou = false;
	    
	    
	    int[] p = new int[4];
	    void teste(){
	    	if(isDrawed){
	    		for(int i = 0;i < pts.length;i++){
	    			if(!Grid.getInstance().
	    					getBounds().intersects(pts[i].getX(), pts[i].getY() + game_config.HEIGHT, 
	    							game_config.WIDTH, game_config.HEIGHT) && isCreated){
	    				parar = true;
	    			}
	    			/*
	    			if(PainelEsquerdo.getInstance()
	    					.getBounds().intersects(pts[i].getX() - game_config.WIDTH,pts[i].getY(),
	    							game_config.WIDTH,game_config.HEIGHT)){
	    				isLeftEnabled = false;
	    				pts[i].setX(pts[i].getX() + game_config.WIDTH);
	    			}
	    			
	    			if(PainelDireito.getInstance()
	    					.getBounds().intersects(pts[i].getX(),pts[i].getY(),
	    							game_config.WIDTH,game_config.HEIGHT)
	    							){	    				
	    				isRightEnabled = false;
	    			}	    	*/		
	    			try{
	    			if(/*cells[pts[i].getX()][pts[i].getY() > -1 ? pts[i].getY() + game_config.HEIGHT : 0] != null*/
	    					cells[pts[i].getX() / 30][((pts[i].getY() + 30) / 30)] != null
	    					){
	    			    parar = true;
	    			    System.out.println("d fim");
	    			    break;
	    			}
	    			}catch(Exception e){
	    				System.out.println();
	    			}
	    		}	    		
	    		
	    	}
	    }
	    
	    Ponto[] xtemp;
	    // desenha na tela	  
	    Ponto[] pts = null;
	   boolean isDrawed = false,parar = false,isShapeEnded = false,isCreated = false;
	    private void draw(CONST DIRECAO){		    	
	    	pts = shape.getPoints();	    	
	    	// realiza testes para depois caminhar n posições	    	
	    		    	
	    	// pinta os quadrados na tela
	    	for(int i = 0;i < pts.length;i++){
	    	    if(!parar){
	    	    	if(DIRECAO == CONST.ESQUERDA /*&& isLeftEnabled*/){
	    	    		   if(!PainelEsquerdo.getInstance()
	    					.getBounds().intersects(pts[i].getX() - game_config.WIDTH,pts[i].getY(),
	    							game_config.WIDTH,game_config.HEIGHT))
		    			     pts[i].setX(pts[i].getX() - game_config.WIDTH);
	    	    		   
	    	    	}
		    	    if(DIRECAO == CONST.DIREITA /*&& isRightEnabled*/){
		    	    	if(!PainelDireito.getInstance()
		    					.getBounds().intersects(pts[i].getX(),pts[i].getY(),
		    							game_config.WIDTH,game_config.HEIGHT))
		    	    	pts[i].setX(pts[i].getX() + game_config.WIDTH);
		    	    }
	    		   
		    	    pts[i].setY(pts[i].getY()+ game_config.HEIGHT);
	    	    }
	    	    g.setColor(shape.getCor());
	    		g.fillRect(pts[i].getX(), pts[i].getY(),
	    				 shape.getWIDTH(), shape.getHEIGHT());
	    		
	    		g.setColor(game_config.BLOCK_BORDER_COLOR);
	    		g.drawRect(pts[i].getX(), pts[i].getY(),
	    				 shape.getWIDTH(), shape.getHEIGHT());
	    	}	    	
	    	
	    	teste();
	    	if(!isCreated){
	    		isCreated = true;
	    	}
	    	
	    	if(parar){
	    		ShapeQueue.getInstance().AddDiscarded(shape);
	    		// guarda a posição da figura
	    		int tempx = -1,tempy = -1;
	    		for(int i = 0;i < shape.getPoints().length;i++){
	    			
	    			//cells[shape.getPoints()[i].getX()][shape.getPoints()[i].getY()] = shape.getCor();
	    			cells[pts[i].getX() / 30][pts[i].getY() / 30] = shape.getCor();
	    			if(ShapeQueue.getInstance().Peek() == null){
	    				System.out.println();
	    			}
	    			//if(tempx != pts[i].getX() / 30){
	    			   y[pts[i].getY()/30]++;
	    			   points[pts[i].getY() / 30][pts[i].getX() / 30] = pts[i];
	    			//}
	    			tempx = pts[i].getX() / 30;
	    			
	    			if(tempy != pts[i].getY() / 30){
	    				x[pts[i].getX() / 30]++;
	    				points[pts[i].getY() / 30][pts[i].getX() / 30] = pts[i];
	    			}
	    			tempy = pts[i].getY() / 30;
	    			/*
	    			if(x[pts[i].getX() / 30] == 18 || y[pts[i].getY() / 30] == 10){
	    				
	    			}
	    			*/
	    		}
	    		int idx = 17;
	    		while(idx > 0){
	    			if(this.y[idx] >= 10)
	    			   redistribui(idx);
	    			idx--;	    			
	    		}
	    		idx = 17;
	    		try{
	    		shape = ShapeQueue.getInstance().Dequeue();
	    		shape.setCor(getRandomColor());
	    		g.setColor(shape.getCor());
	    		}catch(Exception e){
	    			System.out.println("Fim de Jogo!");
	    			suspender();
	    		}
	    		parar = false;
	    		isCreated = false;
	    		isShapeEnded = true;
	    	}
	    	if(!isDrawed)
	    		isDrawed = true;
	    	
	    	READ_DIR = CONST.ZERO;
	    	
	}
	 Random random = new Random();   
	private Color getRandomColor(){
		return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
	}
	    
	private static CONST READ_DIR = CONST.ZERO;
	
	public static void READ_DIRECAO(CONST DIRECAO){
		READ_DIR = DIRECAO;
	}
	
	public void suspender(){
		suspend = true;
	}
	
	// resume a thread atual (notifica)
	public synchronized void resumir(){		
		suspend = false;
		notify();
	}
	
	public boolean isSuspendido(){
		return suspend;
	}
	
	private void redistribui(int j){
		for(int i = 0,t = 0;i < 10;i++){			
			points[j][i].setY(1000);
			this.y[j]--;
			cells[i][j] = null;
			t = j - 1;
			while(points[t][i] != null)
			{
				points[t][i].setY(points[t][i].getY() + 30);
				this.y[t]--;
				t--;
			}
			cells[i][t+1] = null;
		}
		
	}
	
	
}
