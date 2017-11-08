import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class TemperatureConverter extends JFrame {

	JTextField celsius;
	JTextField fahrenheit;
	JPanel p;
	JButton b;
	JLabel l;
	JLabel ll;

	public TemperatureConverter() {
		setTitle("Temperature Converter");
		setSize(100, 100);

		Font f = new Font("Arial", Font.BOLD, 12);
		b = new JButton("Convert");
		b.setFont(f);
		b.addActionListener(new ButtonListener());

		l = new JLabel("celsius:");
		celsius = new JTextField();
		ll = new JLabel("fahrenheit:");
		fahrenheit = new JTextField();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p.add(l);
		p.add(celsius);
		p.add(ll);
		p.add(fahrenheit);
		p.add(b);
		p.setLayout(new GridLayout(1, 5));
		add(p);
		pack();
		setVisible(true);

	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String x = celsius.getText();

			double fah = Double.parseDouble(x) * 9 / 5 + 32;

			fahrenheit.setText(fah + "");

		}

	}

	public static void main(String[] args) {

		new TemperatureConverter();

	}

}


