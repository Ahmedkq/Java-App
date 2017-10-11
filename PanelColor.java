import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("Window");
		f.setLayout(null);

		JPanel p = new JPanel();
		f.add(p);
		p.setLayout(null);
		p.setBackground(Color.RED);
		p.setSize(150, 150);
		p.setLocation(200, 100);

		JPanel p2 = new JPanel();
		f.add(p2);
		p2.setLayout(null);
		p2.setBackground(Color.GREEN);
		p2.setSize(150, 150);
		p2.setLocation(400, 100);

		JPanel p3 = new JPanel();
		f.add(p3);
		p3.setLayout(null);
		p3.setBackground(Color.BLUE);
		p3.setSize(150, 150);
		p3.setLocation(600, 100);

		f.setSize(800, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
