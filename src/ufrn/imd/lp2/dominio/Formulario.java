package ufrn.imd.lp2.dominio;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario	extends JFrame implements ActionListener{
	JButton ok = new JButton("OK");	
	JTextField nome = new JTextField();
	JTextField idade = new JTextField();
	JTextField cpf = new JTextField();
	JTextField rg = new JTextField();
	public Formulario() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel formulario = new JPanel();
		formulario.setLayout(new GridLayout(5,6));
		
		formulario.add(new JLabel("Nome.:"));	
		formulario.add(nome);
		
		formulario.add(new JLabel("Idade.:"));
		formulario.add(idade);
		
		formulario.add(new JLabel("cpf.:"));
		formulario.add(cpf);
		
		formulario.add(new JLabel("RG.:"));		
		formulario.add(rg);
		
		
		formulario.add(ok);
		c.add(formulario);
		
		ok.addActionListener(this);
		setSize(400,350);
		setTitle("Combinando Paineis");
		setLocation(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String []args){
		
		Formulario f = new Formulario();
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Nome:"+nome.getText());
		System.out.println("Idade:"+idade.getText());
		System.out.println("CPF:"+cpf.getText());
		System.out.println("RG"+rg.getText());
		
		
	}
}
