import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;


public class JButton {

	public static void main(String[] args) {

		JFrame f = new JFrame("JButton Scoreboard");
		f.setSize(600, 400);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		f.add(p);
		p.setLayout(null);
		p.setSize(300, 200);
		p.setLocation(50, 50);

		JLabel jl1 = new JLabel();
		jl1.setText("Red Team");
		p.add(jl1);
		jl1.setForeground(Color.RED);
		jl1.setLocation(250, 50);
		jl1.setSize(75, 50);
		jl1.setFont(new Font("Times", Font.BOLD, 17));

		JLabel jl2 = new JLabel();
		p.add(jl2);
		jl2.setText("0");
		jl2.setForeground(Color.BLACK);
		jl2.setLocation(450, 50);
		jl2.setSize(75, 50);
		jl2.setFont(new Font("Times", Font.BOLD, 17));

		JLabel jl3 = new JLabel();
		p.add(jl3);
		jl3.setText("Blue Team");
		jl3.setForeground(Color.BLUE);
		jl3.setLocation(650, 50);
		jl3.setSize(75, 50);
		jl3.setFont(new Font("Times", Font.BOLD, 17));

		JLabel jl4 = new JLabel();
		p.add(jl4);
		jl2.setText("0");
		jl2.setForeground(Color.BLACK);
		jl2.setLocation(450, 50);
		jl2.setSize(75, 50);
		jl2.setFont(new Font("Times", Font.BOLD, 17));

		JButton b1 = new JButton();
		p.add(b1);
		b1.setText("Red Score");
		b1.setSize(100, 100);
		b1.setLocation(100, 105);

		JButton b2 = new JButton();
		p.add(b2);
		b2.setText("Blue Score");
		b2.setSize(100, 100);
		b2.setLocation(100, 105);

		JButton b3 = new JButton();
		p.add(b3);
		b3.setText("reset score");
		b3.setSize(100, 100);
		b3.setLocation(100, 105);

	}

}