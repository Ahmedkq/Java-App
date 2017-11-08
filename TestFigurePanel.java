import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFigurePanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawLine(10, 20, 100, 50);
		g.drawLine(100, 20, 10, 50);

		g.setColor(Color.BLUE);
		g.drawRect(150, 20, 70, 40);
		g.setColor(Color.BLUE);
		g.fillRect(150, 100, 70, 40);

		g.setColor(Color.RED);
		g.drawRoundRect(275, 20, 80, 50, 30, 30);
		g.setColor(Color.RED);
		g.fillRoundRect(275, 100, 80, 50, 30, 30);

		g.setColor(Color.BLACK);
		g.drawOval(10, 90, 100, 60);

	}

	public static void main(String[] args) {

		JFrame j = new JFrame("Panel");
		j.add(new TestFigurePanel());
		j.setSize(400, 200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}

}
