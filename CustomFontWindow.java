import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CustomFontWindow extends JFrame {

	JTextField tf;
	JPanel p;
	JPanel p2;
	JPanel p3;

	JRadioButton arial;
	JRadioButton times;
	JRadioButton verdana;
	ButtonGroup radioButtonGroup;

	JCheckBox bold;
	JCheckBox red;

	Font f;
	String name;
	String font;
	int size;
	int style;

	public CustomFontWindow() {

		setTitle("Font Customizer");
		setPreferredSize(new Dimension(300, 200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tf = new JTextField();
		arial = new JRadioButton("Arial");
		times = new JRadioButton("Times");
		verdana = new JRadioButton("Verdana");

		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(arial);
		radioButtonGroup.add(times);
		radioButtonGroup.add(verdana);

		bold = new JCheckBox("Bold");
		red = new JCheckBox("Red");

		arial.addActionListener(new Listener());
		times.addActionListener(new Listener());
		verdana.addActionListener(new Listener());

		bold.addItemListener(new ItemListener1());

		red.addItemListener(new ItemListener1());

		p = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		p2.setLayout(new GridLayout(1, 1));
		p2.add(tf);

		p.setLayout(new GridLayout(2, 3));
		p.add(arial);
		p.add(times);
		p.add(verdana);
		p.add(bold);
		p.add(red);

		f = p.getFont();
		name = f.getName();
		font = f.getFamily();
		size = f.getSize();
		style = f.getStyle();

		add(p2, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);

		pack();

		setVisible(true);

	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String x = tf.getText();

			if (e.getSource() == arial) {

				Font f = new Font("Arial", style, 18);
				tf.setFont(f);

			}

			if (e.getSource() == times) {
				Font r = new Font("Times", style, 18);
				tf.setFont(r);

			}

			if (e.getSource() == verdana) {
				Font w = new Font("Verdana", style, 18);
				tf.setFont(w);

			}

		}
	}

	private class ItemListener1 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {

			if (e.getSource() == red) {

				if (red.isSelected()) {

					tf.setForeground(Color.RED);
				}

				else {

					tf.setForeground(Color.BLACK);
					red.setForeground(Color.black);
				}
			}

			if (e.getSource() == bold) {

				if (bold.isSelected()) {
					tf.setFont(new Font("fontFamily", Font.BOLD, size));
				}

				else {

					tf.setFont(new Font("fontFamily", Font.PLAIN, size));

				}
			}

		}
	}

	public static void main(String[] args) {

		new CustomFontWindow();

	}
}
