package ufrn.imd.lp2.dominio;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Painel extends JFrame implements ActionListener{
	JButton listar = new JButton("Clicar");
	JButton close = new JButton("Fechar");
	public Painel(){
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		
		JPanel botoes = new JPanel();
		botoes.setLayout(new GridLayout(3,1));
		botoes.add(new JButton("Um"));
		botoes.add(new JButton("dois"));
		botoes.add(new JButton("três"));
		
		JPanel lateral = new JPanel();
		lateral.add(botoes);
		
		JPanel controle = new JPanel();
		c.setLayout(new GridLayout(1,2));
	

		
		c.add(listar);
		c.add(close);
		
		listar.addActionListener(this);
		close.addActionListener(this);
		
		c.add(BorderLayout.WEST,lateral);
		c.add(BorderLayout.CENTER,controle);
		

		setSize(400,350);
		setTitle("Combinando Paineis");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if (e.getSource()==listar){
			System.out.println("B1");
		}
		if (e.getSource()==close){
			System.out.println("B2");
		}
	}
	

	
	

}	
