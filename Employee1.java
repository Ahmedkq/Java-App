import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;

public class Employee1 extends JFrame {

	Font f;
	Connection conn;
	Statement stmt;
	ResultSet result;
	JTable Table;
	JScrollPane scrollPane;
	JTextField id, name, pos, hp;
	JPanel bottomPanel, p, p2;
	JButton b, b2, b3;
	JLabel lid, ln, lpos, lhp;
	String[][] rowData;
	String[] colNames;

	String q, w, e, r;

	public Employee1() {
		setLayout(new GridLayout(2, 1));
		setTitle("Employee");
		setSize(800, 400);
		bottomPanel = new BottomPanel();

		try {
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/personnel", "root", "");
			Statement stmt = conn.createStatement();
			String sqlStatement = "SELECT * FROM Employee";
			ResultSet result = stmt.executeQuery(sqlStatement);
			String[] colNames = { "EMPLOYEE ID", "NAME", "POSITION", "HOUR PAY RATE" };

			while (result.next()) {
				q = result.getString("employee_id");
				w = result.getString("name");
				e = result.getString("position");
				r = result.getString("HPR");
				System.out.println(q + " " + w + " " + e + " " + r);
				String[][] rowData = { { q, w, e, r } };
				Table = new JTable(rowData, colNames);
				scrollPane = new JScrollPane(Table);

			}

			stmt.close();
			conn.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		add(scrollPane, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class BottomPanel extends JPanel {

		public BottomPanel() {

			setLayout(new BorderLayout());

			setPreferredSize(new Dimension(500, 800));

			p2 = new JPanel();
			p = new JPanel();

			f = new Font("Arial", Font.BOLD, 12);
			b = new JButton("add");
			b.setFont(f);
			b.addActionListener(new ButtonListener());

			b2 = new JButton("Update");
			b2.setFont(f);
			b2.addActionListener(new ButtonListener());

			b3 = new JButton("Delete");
			b3.setFont(f);
			b3.addActionListener(new ButtonListener());

			id = new JTextField();
			name = new JTextField();
			pos = new JTextField();
			hp = new JTextField();
			lid = new JLabel("Employee ID");
			ln = new JLabel("Name");
			lpos = new JLabel("Position");
			lhp = new JLabel("Hourly Pay Rate");

			p2.setLayout(new GridLayout(4, 2));
			p2.add(lid);
			p2.add(id);
			p2.add(ln);
			p2.add(name);
			p2.add(lpos);
			p2.add(pos);
			p2.add(lhp);
			p2.add(hp);
			p.setLayout(new GridLayout(1, 3));
			p.add(b);
			p.add(b2);
			p.add(b3);

			add(p2);
			add(p, BorderLayout.SOUTH);

		}
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String x = id.getText();
			name.getText();
			pos.getText();
			String j = hp.getText();

			Integer.parseInt(x);
			Double.parseDouble(j);

			try {
				conn = DriverManager.getConnection("jdbc:mariadb://localhost/personnel", "root", "");
				stmt = conn.createStatement();

				if (e.getSource() == b) {
					result = stmt.executeQuery("INSERT INTO Employee VALUES(x,y,i,j)");

				} else if (e.getSource() == b2) {
					result = stmt.executeQuery("DELETE FROM Employee WHERE employee_ID = 'x'");
					result = stmt.executeQuery("INSERT INTO Employee VALUES(x,y,i,j)");

				} else if (e.getSource() == b3) {

					result = stmt.executeQuery("DELETE FROM Employee WHERE ProdNum = 'x'");

				}
				conn.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}

	}

	public static void main(String[] args) {

		new Employee1();

	}

}
