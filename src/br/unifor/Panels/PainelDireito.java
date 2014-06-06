package br.unifor.Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelDireito extends JPanel implements IPainel {

	private PainelDireito(){
		config();
	}
	
	JPanel pPrevia;
	private static PainelDireito instance = null;
	public static PainelDireito getInstance(){
		return instance == null ? instance = new PainelDireito() : instance;
	}
	
	@Override
	public void config() {
		this.setBackground(Color.ORANGE);	
		setVisible(true);
		pPrevia = new JPanel();
		pPrevia.setBackground(Color.LIGHT_GRAY);
		pPrevia.setSize(new Dimension(50,50));		
		this.setLayout(new BorderLayout());
		this.add(pPrevia,BorderLayout.NORTH);
		pPrevia.add(new JLabel("== Próxima Peça =="));
		
		this.add(pCanvas.getInstance(),BorderLayout.CENTER);	
		this.add(new JPanel(),BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){
		PainelDireito.getInstance();
	}

}
