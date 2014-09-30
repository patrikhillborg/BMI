import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Hej extends JFrame implements ActionListener {
	JTextField text = new JTextField(8);
	JLabel hels = new JLabel();
		
		Hej(){
			super("Här var det livat");
		setLayout(new FlowLayout());
		JLabel kommando = new JLabel("Skriv namn: ");
		add(kommando);
		add(text);
		JButton knapp = new JButton("Klar");
		knapp.addActionListener(this);
		add(knapp);
		add(hels);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		
		}
		public void actionPerformed(ActionEvent ave){
			String namn = text.getText();
			hels.setText("Hej " + namn + ", du ser bra ut idag!");
		
	}
		public static void main(String[]args){
			new Hej();
		}

}
