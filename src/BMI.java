import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BMI extends JFrame implements ActionListener {
	JTextField l�ngdF�lt, viktF�lt;
	JLabel svar;
	
	BMI(){
		super("BMI");
		setLayout(new FlowLayout());
		JLabel l�ngd = new JLabel("Ange din l�ngd: ");
		add(l�ngd);
		l�ngdF�lt = new JTextField(5);
		add(l�ngdF�lt);
		JLabel vikt = new JLabel("Ange din vikt: ");
		add(vikt);
		viktF�lt = new JTextField(5);
		add(viktF�lt);
		JButton r�kna = new JButton("Ber�kna BMI");
		add(r�kna);
		r�kna.addActionListener(this);
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
		double l�ngd = Double.parseDouble(l�ngdF�lt.getText());
		double vikt = Double.parseDouble(viktF�lt.getText());
		double klar = vikt / (l�ngd * l�ngd); 
		svar.setText("Ditt BMI �r: " + klar);
		} catch(NumberFormatException e){
			svar.setText("Fel inmatning!");
		}
	
	}
}
