import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPicker extends JFrame {

	JPanel p;
	int r;
	int g;
	int b;

	public ColorPicker() {

		setTitle("ColorPicker");
		setLayout(null);
		setSize(400, 400);

		p = new JPanel();
		p.setLayout(null);
		p.setSize(600, 600);

		p.addMouseMotionListener(new Listener1());

		add(p);


		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public class Listener1 extends MouseMotionAdapter {

		public void mouseMoved(MouseEvent e) {

			r = e.getX();
			b = e.getY();
			g = e.getX() + e.getY() * 0;

			p.setBackground(new Color(r, g, b));
		}
	}
	
	public static void main(String[] args) {

		new ColorPicker();
	}

}
