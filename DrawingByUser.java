import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class DrawingByUser extends JFrame {

	private JPanel topPanel, bottomPanel;
	private Color color;
	private JCheckBox check;
	JButton b;
	JButton b2;
	int shape;
	int x, y, w, h;

	public DrawingByUser() {

		setPreferredSize(new Dimension(500, 300));
		topPanel = new TopPanel();
		bottomPanel = new BottomPanel();
		add(topPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.EAST);

		pack();
		setTitle("Draw Circle");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class TopPanel extends JPanel {

		JTextField tx;
		JTextField ty;
		JTextField tw;
		JTextField th;
		JLabel lx;
		JLabel ly;
		JLabel lw;
		JLabel lh;
		JLabel lf;

		public TopPanel() {

			Font f = new Font("Arial", Font.BOLD, 12);
			b = new JButton("          Oval");
			b.setFont(f);
			b.addActionListener(new ButtonListener());
			b2 = new JButton("         Rec");
			b2.setFont(f);
			b2.addActionListener(new ButtonListener());

			tx = new JTextField();
			ty = new JTextField();
			tw = new JTextField();
			th = new JTextField();

			lx = new JLabel("           x");
			ly = new JLabel("           y");
			lw = new JLabel("           w");
			lh = new JLabel("           h");
			lf = new JLabel("         filld");

			check = new JCheckBox();

			setLayout(new GridLayout(6, 2));
			add(lx);
			add(tx);
			add(ly);
			add(ty);
			add(lw);
			add(tw);
			add(lh);
			add(th);
			add(lf);
			add(check);
			add(b);
			add(b2);
		}

		private class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

				String r = tx.getText();
				String z = ty.getText();
				String i = tw.getText();
				String q = th.getText();

				x = Integer.parseInt(r);
				y = Integer.parseInt(z);
				w = Integer.parseInt(i);
				h = Integer.parseInt(q);

				if (e.getSource() == b) {
					
					shape = 0;


				} else if (e.getSource() == b2) {
					
					shape = 1;

				}

			}

		}

	}

	private class BottomPanel extends JPanel {

		public BottomPanel() {

			setPreferredSize(new Dimension(200, 200));
			setBackground(Color.WHITE);
			setBorder(BorderFactory.createLineBorder(Color.RED));

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			if (shape == 0 && check.isSelected() == true) {
				g.fillOval(x, y, w, h);
			}

			else if (shape == 0) {
				g.drawOval(x, y, w, h);
			}

			if (shape == 1 && check.isSelected() == true) {
				g.fillRect(x, y, w, h);
			}
			else if (shape == 1) {
				g.drawRect(x, y, w, h);
			}
			repaint();
		}

	}

	public static void main(String[] args) {

		new DrawingByUser();

	}
}