import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("Window");
		f.setLayout(null);

		JLabel jl1 = new JLabel();
		jl1.setText("Red");
		jl1.setForeground(Color.RED);
		jl1.setLocation(250,50);
		jl1.setSize(75,50);
		jl1.setFont(new Font("Times", Font.BOLD, 17));
		
		
		JLabel jl2 = new JLabel("Blue");
		jl2.setText("Blue");
		jl2.setForeground(Color.BLUE);
		jl2.setLocation(450,50);
		jl2.setSize(75,50);
		jl2.setFont(new Font("Times", Font.BOLD, 17));
		
		JLabel jl3 = new JLabel("Yellow");
		jl3.setText("Yellow");
		jl3.setForeground(Color.YELLOW);
		jl3.setLocation(650,50);
		jl3.setSize(75,50);
		jl3.setFont(new Font("Times", Font.BOLD, 17));

		
		f.add(jl1);
		f.add(jl2);
		f.add(jl3);

		
		JPanel p = new JPanel();
		f.add(p);
		p.setLayout(null);
		p.setBackground(Color.RED);
		p.setSize(150, 150);
		p.setLocation(200, 100);

		JPanel p2 = new JPanel();
		f.add(p2);
		p2.setLayout(null);
		p2.setBackground(Color.BLUE);
		p2.setSize(150, 150);
		p2.setLocation(400, 100);

		JPanel p3 = new JPanel();
		f.add(p3);
		p3.setLayout(null);
		p3.setBackground(Color.YELLOW);
		p3.setSize(150, 150);
		p3.setLocation(600, 100);

		f.setSize(800, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
