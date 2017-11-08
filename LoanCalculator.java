
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class LoanCalculator extends JFrame {

	JTextField annualInterestRate1;
	JTextField numberOfYears1;
	JTextField loanAmount1;
	JTextField monthlyPayment1;
	JTextField totalPayment1;
	JPanel p;
	JPanel p2;
	JButton b;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;

	public LoanCalculator() {

		setTitle("LoanCalculator");
		setSize(100, 300);

		Font f = new Font("Arial", Font.BOLD, 12);
		b = new JButton("Compute Payment");
		b.setFont(f);
		b.addActionListener(new ButtonListener());

		l1 = new JLabel("Enter loan amount,interest rate, and years :");

		l2 = new JLabel("Annual Interest Rate :");
		l3 = new JLabel("Number Of Years :");
		l4 = new JLabel("Loan Amount :");
		l5 = new JLabel("Monthly Payment: ");
		l6 = new JLabel("Total Payment: ");
		JLabel l7 = new JLabel();
		JLabel l8 = new JLabel();
		JLabel l9 = new JLabel();
		JLabel l10 = new JLabel();

		annualInterestRate1 = new JTextField();
		loanAmount1 = new JTextField();
		monthlyPayment1 = new JTextField();
		numberOfYears1 = new JTextField();
		totalPayment1 = new JTextField();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p2 = new JPanel();

		p2.setLayout(new GridLayout(2, 1));
		p2.add(l1);
		p2.add(l8);

		p.setLayout(new GridLayout(7, 2));

		p.add(l2);
		p.add(annualInterestRate1);
		p.add(l3);
		p.add(numberOfYears1);
		p.add(l4);
		p.add(loanAmount1);
		p.add(l5);
		p.add(monthlyPayment1);
		p.add(l6);
		p.add(totalPayment1);
		p.add(l7);
		p.add(l9);
		p.add(l10);

		p.add(b);

		add(p2, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		pack();
		setVisible(true);

	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String x = annualInterestRate1.getText();
			String y = numberOfYears1.getText();
			String i = loanAmount1.getText();

			System.out.println(y);

			double annualInterestRate = Double.parseDouble(x);

			int numberOfYears = Integer.parseInt(y);

			double loanAmount = Double.parseDouble(i);

			Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

			double j = loan.getMonthlyPayment();
			double g = loan.getTotalPayment();

			System.out.println(j);
			System.out.println(g);

			monthlyPayment1.setText(j + "");
			totalPayment1.setText(g + "");
		}

	}

	public static void main(String[] args) {

		new LoanCalculator();

	}

}
