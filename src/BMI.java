import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BMI extends JFrame implements ActionListener {
	JTextField längdFält, viktFält;
	JLabel svar;
	
	BMI(){
		super("BMI");
		setLayout(new FlowLayout());
		JLabel längd = new JLabel("Ange din längd: ");
		add(längd);
		längdFält = new JTextField(5);
		add(längdFält);
		JLabel vikt = new JLabel("Ange din vikt: ");
		add(vikt);
		viktFält = new JTextField(5);
		add(viktFält);
		JButton räkna = new JButton("Beräkna BMI");
		add(räkna);
		räkna.addActionListener(this);
		JLabel bmi = new JLabel(" ");
		add(bmi);
		svar = new JLabel(" ");
		add(svar);
		setSize(250, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new BMI();
		
	}

	public void actionPerformed(ActionEvent ave){
		try {
		double längd = Double.parseDouble(längdFält.getText());
		double vikt = Double.parseDouble(viktFält.getText());
		double klar = vikt / (längd * längd); 
		svar.setText("Ditt BMI är: " + klar);
		} catch(NumberFormatException e){
			svar.setText("Fel inmatning!");
		}
	
	}
}
