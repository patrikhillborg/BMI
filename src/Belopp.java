import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Belopp extends JFrame implements ActionListener {
	JTextField antalF�lt, prisF�lt;
	JLabel beloppLabel;
	Belopp(){
		super("Belopp");
		setLayout(new FlowLayout());
		add(new JLabel("Antal: "));
		antalF�lt = new JTextField(5);
		add(antalF�lt);
		add(new JLabel("Pris: "));
		prisF�lt = new JTextField(5);
		add(prisF�lt);
		JButton knapp = new JButton("Ber�kna");
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
		int antal = Integer.parseInt(antalF�lt.getText());
		try {
			double pris = Double.parseDouble(prisF�lt.getText());
			double belopp = pris * antal;
			beloppLabel.setText("" + belopp);
			} catch (NumberFormatException e){
				beloppLabel.setText("Fel!");
			}
	
	}
	
}
