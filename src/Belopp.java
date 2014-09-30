import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Belopp extends JFrame implements ActionListener {
	JTextField antalFält, prisFält;
	JLabel beloppLabel;
	Belopp(){
		super("Belopp");
		setLayout(new FlowLayout());
		add(new JLabel("Antal: "));
		antalFält = new JTextField(5);
		add(antalFält);
		add(new JLabel("Pris: "));
		prisFält = new JTextField(5);
		add(prisFält);
		JButton knapp = new JButton("Beräkna");
		add(knapp);
		knapp.addActionListener(this);
		add(new JLabel("Belopp = "));
		beloppLabel = new JLabel("?");
		add(beloppLabel);
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Belopp();

	}
	public void actionPerformed(ActionEvent ave){
		int antal = Integer.parseInt(antalFält.getText());
		try {
			double pris = Double.parseDouble(prisFält.getText());
			double belopp = pris * antal;
			beloppLabel.setText("" + belopp);
			} catch (NumberFormatException e){
				beloppLabel.setText("Fel!");
			}
	
	}
	
}
