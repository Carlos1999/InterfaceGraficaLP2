package ufrn.imd.lp2.dominio;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.GridLayout;

public class MinhaJanela extends JFrame {
	public MinhaJanela(){
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		ct.add(new JLabel("Login:"));
	    Icon icone1 = new ImageIcon("índice.jpeg");
	    Icon icone2 = new ImageIcon("índice.jpeg");
	    Icon icone3 = new ImageIcon("índice.jpeg");
	    
	    JButton b1 = new JButton("Avião de caça",icone1);
	    JButton b2 = new JButton("Avião de carga",icone2);
	    JButton b3 = new JButton("Avião de seila",icone3);
	    
	    ct.add(b1);
	    ct.add(b2);
	    ct.add(b3);
	    
	    
		setSize(400,350);
		setTitle("Minha Primeira Janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}
