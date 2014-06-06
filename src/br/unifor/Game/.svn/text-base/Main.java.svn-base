package br.unifor.Game;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Deque;
import java.util.EnumSet;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.unifor.Panels.Grid;
import br.unifor.Panels.PainelDireito;
import br.unifor.Panels.PainelEsquerdo;
import br.unifor.Panels.PainelInferior;
import br.unifor.Shape.*;
import br.unifor.Util.CONST;
import br.unifor.Util.ShapeQueue;
import br.unifor.Util.StartState;
import br.unifor.Util.State;
import br.unifor.Util.StopState;
import br.unifor.Util.Tarefa;
import br.unifor.Util.VerifyTask;
import br.unifor.Util.game_config;

public class Main extends JFrame {

	public Main(){		
		config();
	}
	
	Runnable tarefa;
	public static Deque<Shape> figuras = new LinkedList<Shape>();
	private JPanel painelEsquerdo = new JPanel(),
			painelDireito = new JPanel(),
			painelInferior = new JPanel();	
	
    State AppState = new StartState();
    Container context;
	private void config(){	
		/**
		 * método de configurações iniciais
		 */
		context = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		this.setResizable(false);
		
		Dimension d = new Dimension(game_config.TELA_L,game_config.TELA_A);
		this.setSize(d);		
		
		painelEsquerdo.setBackground(Color.RED);
		painelDireito.setBackground(Color.RED);
		painelInferior.setBackground(Color.BLACK);
		
		setLayout(new BorderLayout());
		this.getContentPane().add(PainelEsquerdo.getInstance(),BorderLayout.WEST);		
		this.getContentPane().add(PainelDireito.getInstance(),BorderLayout.EAST);	
		this.getContentPane().add(Grid.getInstance(),BorderLayout.CENTER);
		this.getContentPane().add(PainelInferior.getInstance(),BorderLayout.SOUTH);
		
		
		/*
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());
		ShapeQueue.getInstance().Enqueue(new TETRIS_I());*/
		for(int i = 1;i <= 11;i++){
			ShapeQueue.getInstance().Enqueue(new TETRIS_J());
		}
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				setTitle(arg0.getX() + " " + arg0.getY());
				
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		// cria uma nova Thread e a executa
	    tarefa = Tarefa.getInstance(this.getGraphics(),this);
	    Thread z = new Thread(new VerifyTask());
	    z.start();
	    tarefa.run();	    
	}
	LinkedList<Shape> objects;
	boolean isStarted = false;
	Shape shape;
	@Override
	public void paint(Graphics g) {	
		super.paint(g);	
		// repinta as instâncias de objetos descartados
		if(ShapeQueue.getInstance().discarded().size() > 0){
			for(int i = 0;i < ShapeQueue.getInstance().discarded().size() ; i++){
				shape =  ShapeQueue.getInstance().discarded().get(i);
				for(int j = 0;j < shape.getPoints().length;j++){
					g.setColor(shape.getCor());
					g.fillRect(shape.getPoints()[j].getX(), shape.getPoints()[j].getY(),
							shape.getWIDTH(), shape.getHEIGHT());

					g.setColor(game_config.BLOCK_BORDER_COLOR);
					g.drawRect(shape.getPoints()[j].getX(), shape.getPoints()[j].getY(),
							shape.getWIDTH(), shape.getHEIGHT());

				}
			}
		}		
	}
	protected void processKeyEvent(KeyEvent e) {
		
		{
			/**
			 * Processa os eventos de mouse
			 */
			if(e.getID() == KeyEvent.KEY_PRESSED){
				/**
				 * Se caso for um evento de o mouse ser pressionado
				 */
				
				// captura a interação das setas (esquerda ou direita)
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){					
					Tarefa.READ_DIRECAO(CONST.DIREITA);
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					Tarefa.READ_DIRECAO(CONST.ESQUERDA);
				}
				// captura o evento de velocidade enquanto a tecla S for pressionada
				if(e.getKeyCode() == KeyEvent.VK_S){
					Tarefa.SLEEP_SPEED = game_config.SPEED_HIGH;
				}
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					ShapeQueue.getInstance().getCurrent().rotaciona();
				}
				
				/**
				 * Pausa o jogo.
				 * Obs: é usado o padrão State
				 */
				
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
					if(getAppState() instanceof StartState){						
						setAppState(new StopState());
					}else{
						setAppState(new StartState());				
					}
					getAppState().doAction(this);
					System.out.println(getAppState());
					
					/*if(!((Tarefa)tarefa).isSuspendido())
					    ((Tarefa)tarefa).suspender();
					else
						((Tarefa)tarefa).resumir();*/
				}
				
			}
			/**
			 * Se caso o usuário soltar a tecla S,volta a velocidade normal
			 */
			if(e.getID() == KeyEvent.KEY_RELEASED){
				Tarefa.SLEEP_SPEED = game_config.SPEED_DEFAULT;
				//Tarefa.READ_DIRECAO(CONST.ZERO);
			}
		}
	
	};			


	/** rascunho..
	 * a.fillRect(70-25, 70, 25, 25);		
		a.fillRect(70, 70, 25, 25);
		a.fillRect(70, 70-25, 25, 25);
		a.fillRect(70+25, 45, 25, 25);
	 */
	
	public Runnable getTarefa() {
		return tarefa;
	}

	public void setTarefa(Runnable tarefa) {
		this.tarefa = tarefa;
	}

	public State getAppState() {
		return AppState;
	}

	public void setAppState(State appState) {
		AppState = appState;
	}

	public JPanel getPainelEsquerdo() {
		return painelEsquerdo;
	}

	public void setPainelEsquerdo(JPanel painelEsquerdo) {
		this.painelEsquerdo = painelEsquerdo;
	}

	public JPanel getPainelDireito() {
		return painelDireito;
	}

	public void setPainelDireito(JPanel painelDireito) {
		this.painelDireito = painelDireito;
	}

	public JPanel getPainelInferior() {
		return painelInferior;
	}

	public void setPainelInferior(JPanel painelInferior) {
		this.painelInferior = painelInferior;
	}


	public static void main(String[] args){
		new Main();
	}

}
