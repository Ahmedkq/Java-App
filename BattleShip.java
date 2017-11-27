
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BattleShip {

	private JFrame frame = new JFrame("Battleship Game");
	private JPanel gameFields = new JPanel();
	private JLabel gaveOver = new JLabel(" ", SwingConstants.CENTER);

	private int xMax = 7;
	private int yMax = 7;

	private int attempts = 0;

	// x and y coordinates of ship fields, and how many times we hit the ship
	// to be known when the ship is sunk

	private int[] ship1x = { -1 };
	private int[] ship1y = { -1 };
	private int ship1hits = 0;
	private int[] ship2x = { -1, -1 };
	private int[] ship2y = { -1, -1 };
	private int ship2hits = 0;
	private int[] ship3x = { -1, -1, -1 };
	private int[] ship3y = { -1, -1, -1 };
	private int ship3hits = 0;

	private int[][] valueMatrix = new int[xMax][yMax];
	private JButton[][] buttonMatrix = new JButton[xMax][yMax];

	public BattleShip() {

		gameFields.setLayout(new GridLayout(this.xMax, this.yMax));

		// create empty matrix containing 0 values

		generateEmptyMatrix();

		// generate boats automatically

		generateBoats();

		// generate the buttons and the listeners for those buttons

		generateGameFields();

		this.gaveOver.setFont(new Font("Serif", Font.PLAIN, 20));
		this.frame.add(gameFields, BorderLayout.NORTH);
		this.frame.add(gaveOver, BorderLayout.SOUTH);

		startGame();
	}

	// Generate empty matrix (null values) for the game
	// and valueMatrix, all zeros
	private void generateEmptyMatrix() {

		for (int x = 0; x < this.xMax; x++) {
			this.valueMatrix[x] = new int[this.yMax];
			this.buttonMatrix[x] = new JButton[this.yMax];

			for (int y = 0; y < this.yMax; y++) {
				this.valueMatrix[x][y] = 0;
				this.buttonMatrix[x][y] = null;
			}
		}

	}

	private void generateGameFields() {
		// start the x from max and go to min to be in the right order

		for (int x = this.xMax - 1; x >= 0; x--) {
			for (int y = 0; y < this.yMax; y++) {

				// create custom button with appropriate coordinates
				JButton field = new JButton();

				field.setPreferredSize(new Dimension(40, 40));

				// final variables to call them in the action listener

				final int xCoo = x;
				final int yCoo = y;

				field.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// when the button is clicked check for hit.
						// there are more connected methods which will color the
						// button
						// or finish the game if all the boats are hit
						checkForHit(xCoo, yCoo);

					}
				});

				this.gameFields.add(field, x, y);
				this.buttonMatrix[x][y] = field;
			}
		}
	}

	private void generateBoats() {
		Random rn = new Random();

		int boatsSet = 0;

		while (boatsSet != 3) {
			// everything in try catch block , trying to access
			// a non existing array will result continuing the game and set up
			// the same boat again
			// example this.valueMatrix[-1]

			try {
				int randomStartFieldX = rn.nextInt(this.xMax);
				int randomStartFieldY = rn.nextInt(this.yMax);
				// generate integer for a direction
				// 0 - W
				// 1 - N
				// 2 - E
				// 3 - S
				int randomDirection = rn.nextInt(4);

				// put first coordinates and then add other based on the random
				// direction
				if (boatsSet == 0) {
					this.ship1x[0] = randomStartFieldX;
					this.ship1y[0] = randomStartFieldY;
					this.valueMatrix[randomStartFieldX][randomStartFieldY] = 1;
					boatsSet++;
					continue;
				}

				if (boatsSet == 1) {
					this.ship2x[0] = randomStartFieldX;
					this.ship2y[0] = randomStartFieldY;
				} else if (boatsSet == 2) {
					this.ship3x[0] = randomStartFieldX;
					this.ship3y[0] = randomStartFieldY;
				}
				switch (randomDirection) {
				// generate all the boat coordinates and store them in the boat
				// array
				case 0:
					if (boatsSet == 1) {
						this.ship2x[1] = randomStartFieldX;
						this.ship2y[1] = randomStartFieldY - 1;
					} else if (boatsSet == 2) {
						this.ship3x[1] = randomStartFieldX;
						this.ship3y[1] = randomStartFieldY - 1;
						this.ship3x[2] = randomStartFieldX;
						this.ship3y[2] = randomStartFieldY - 2;
					}
					break;
				case 1:
					if (boatsSet == 1) {
						this.ship2x[1] = randomStartFieldX - 1;
						this.ship2y[1] = randomStartFieldY;
					} else if (boatsSet == 2) {
						this.ship3x[1] = randomStartFieldX - 1;
						this.ship3y[1] = randomStartFieldY;
						this.ship3x[2] = randomStartFieldX - 2;
						this.ship3y[2] = randomStartFieldY;
					}
					break;
				case 2:
					if (boatsSet == 1) {
						this.ship2x[1] = randomStartFieldX + 1;
						this.ship2y[1] = randomStartFieldY;
					} else if (boatsSet == 2) {
						this.ship3x[1] = randomStartFieldX + 1;
						this.ship3y[1] = randomStartFieldY;
						this.ship3x[2] = randomStartFieldX + 2;
						this.ship3y[2] = randomStartFieldY;
					}
					break;
				case 3:
					if (boatsSet == 1) {
						this.ship2x[1] = randomStartFieldX;
						this.ship2y[1] = randomStartFieldY + 1;
					} else if (boatsSet == 2) {
						this.ship3x[1] = randomStartFieldX;
						this.ship3y[1] = randomStartFieldY + 1;
						this.ship3x[2] = randomStartFieldX;
						this.ship3y[2] = randomStartFieldY + 2;
					}

					break;

				default:
					// something went wrong, go back to putting the boat
					continue;
				}
				if (boatsSet == 1) {
					// check if coordinates are ok for ship 2 , and if they are
					// set up the ship
					// if they are not code will continue and go back to the
					// loop
					// because we didn't increase boatsset it will set up the
					// same boat again
					if (ship2valid() && ship2x[1] >= 0 && ship2y[1] >= 0) {
						this.valueMatrix[this.ship2x[0]][this.ship2y[0]] = 1;
						this.valueMatrix[this.ship2x[1]][this.ship2y[1]] = 1;
						boatsSet++;
						continue;
					}
				} else if (boatsSet == 2) {
					if (ship3valid()) {
						this.valueMatrix[this.ship3x[0]][this.ship3y[0]] = 1;
						this.valueMatrix[this.ship3x[1]][this.ship3y[1]] = 1;
						this.valueMatrix[this.ship3x[2]][this.ship3y[2]] = 1;
						boatsSet++;
						continue;
					}
				}
			} catch (Exception e) {
				// do nothing, just continue
			}
		}
	}

	private boolean ship2valid() {
		// if absolute value between x or y coordinates are less then 1,
		// that means that the ships will be touching
		if ((Math.abs(this.ship2x[0] - this.ship1x[0]) <= 1 && Math.abs(this.ship2y[0] - this.ship1y[0]) <= 1)
				|| (Math.abs(this.ship2x[1] - this.ship1x[0]) <= 1 && Math.abs(this.ship2y[1] - this.ship1y[0]) <= 1)
				|| ship2x[1] < 0 || ship2y[1] < 0 || ship2x[1] >= xMax || ship2y[1] >= yMax) {
			return false;
		}
		return true;
	}

	private boolean ship3valid() {
		// if absolut value between x or y coordinates are less then 1,
		// that means that the ships will be touching

		// compare ship 3 with ship 1
		if ((Math.abs(this.ship3x[0] - this.ship1x[0]) <= 1 && Math.abs(this.ship3y[0] - this.ship1y[0]) <= 1)
				|| (Math.abs(this.ship3x[1] - this.ship1x[0]) <= 1 && Math.abs(this.ship3y[1] - this.ship1y[0]) <= 1)
				|| (Math.abs(this.ship3x[2] - this.ship1x[0]) <= 1 && Math.abs(this.ship3y[2] - this.ship1y[0]) <= 1)
				|| ship3x[1] < 0 || ship3y[1] < 0 || ship3x[2] < 0 || ship3y[2] < 0 || ship3x[1] >= xMax
				|| ship3y[1] >= yMax || ship3x[2] >= xMax || ship3y[2] >= yMax) {
			return false;
		}

		// compare ship 3 with ship 2
		else if ((Math.abs(this.ship3x[0] - this.ship2x[0]) <= 1 && Math.abs(this.ship3y[0] - this.ship2y[0]) <= 1)
				|| (Math.abs(this.ship3x[1] - this.ship2x[1]) <= 1 && Math.abs(this.ship3y[1] - this.ship2y[1]) <= 1)
				|| (Math.abs(this.ship3x[2] - this.ship2x[0]) <= 1 && Math.abs(this.ship3y[2] - this.ship2y[0]) <= 1)
				|| (Math.abs(this.ship3x[0] - this.ship2x[1]) <= 1 && Math.abs(this.ship3y[0] - this.ship2y[1]) <= 1)
				|| (Math.abs(this.ship3x[1] - this.ship2x[0]) <= 1 && Math.abs(this.ship3y[1] - this.ship2y[0]) <= 1)
				|| (Math.abs(this.ship3x[2] - this.ship2x[1]) <= 1 && Math.abs(this.ship3y[2] - this.ship2y[1]) <= 1)
				|| ship3x[1] < 0 && ship3y[1] < 0 && ship3x[2] < 0 && ship3y[2] < 0
				|| ship3x[1] >= xMax && ship3y[1] >= yMax && ship3x[2] >= xMax && ship3y[2] >= yMax) {
			return false;
		}
		return true;
	}

	public void checkForHit(int x, int y) {
		if (this.valueMatrix[x][y] != 0) {

			findShipAndCheckIfSunk(x, y);
		}
		// if not hit mark the matrix, change the button color and disable the
		// button
		else {
			this.buttonMatrix[x][y].setBackground(Color.ORANGE);
			this.buttonMatrix[x][y].setEnabled(false);
		}

		this.attempts++;
		checkIfGameOver();
	}

	private void findShipAndCheckIfSunk(int x, int y) {
		// check if firs ship is hit and sunk it
		if (x == this.ship1x[0] && y == this.ship1y[0]) {
			ship1hits++;
			this.buttonMatrix[x][y].setBackground(Color.RED);
			this.buttonMatrix[x][y].setEnabled(false);
			return;
		}

		// check if second ship is hit
		for (int i = 0; i < this.ship2x.length; i++) {
			if (x == this.ship2x[i] && y == this.ship2y[i]) {
				ship2hits++;
				this.buttonMatrix[x][y].setBackground(Color.BLUE);
				this.buttonMatrix[x][y].setEnabled(false);
			}
		}
		// check if you need to sink the second ship
		if (ship2hits == ship2x.length) {
			this.buttonMatrix[ship2x[0]][ship2y[0]].setBackground(Color.RED);
			this.buttonMatrix[ship2x[0]][ship2y[0]].setEnabled(false);
			this.buttonMatrix[ship2x[1]][ship2y[1]].setBackground(Color.RED);
			this.buttonMatrix[ship2x[1]][ship2y[1]].setEnabled(false);
		}

		// check if third ship is hit
		for (int i = 0; i < this.ship3x.length; i++) {
			if (x == this.ship3x[i] && y == this.ship3y[i]) {
				ship3hits++;
				this.buttonMatrix[x][y].setBackground(Color.BLUE);
				this.buttonMatrix[x][y].setEnabled(false);
			}
		}
		// check if you need to sink the third ship
		if (ship3hits == ship3x.length) {
			this.buttonMatrix[ship3x[0]][ship3y[0]].setBackground(Color.RED);
			this.buttonMatrix[ship3x[0]][ship3y[0]].setEnabled(false);
			this.buttonMatrix[ship3x[1]][ship3y[1]].setBackground(Color.RED);
			this.buttonMatrix[ship3x[1]][ship3y[1]].setEnabled(false);
			this.buttonMatrix[ship3x[2]][ship3y[2]].setBackground(Color.RED);
			this.buttonMatrix[ship3x[2]][ship3y[2]].setEnabled(false);
		}

	}

	public void startGame() {

		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().add(this.gameFields, BorderLayout.CENTER);

		this.frame.pack();

		this.frame.setVisible(true);
	}

	// check if all the boats are hit, and if they are, disable all buttons
	// and print a game over message
	private void checkIfGameOver() {
		int hits = 0;
		int boatFields = ship1x.length + ship2x.length + ship3x.length;

		// based on boat array calculate how many max hits in the game there are

		for (int x = 0; x < this.xMax; x++) {
			for (int y = 0; y < this.yMax; y++) {
				if (this.buttonMatrix[x][y].getBackground() == Color.RED) {
					hits++;
				}
			}
		}

		if (hits == boatFields) {

			// game over, you hit all boats
			finishGame();
		}
	}

	// disable all buttons and print a game over message.
	private void finishGame() {
		for (int x = 0; x < this.buttonMatrix.length; x++) {
			for (int y = 0; y < this.buttonMatrix[0].length; y++) {
				this.buttonMatrix[x][y].setEnabled(false);
			}
		}

		this.gaveOver.setText("Game finished! Attempts: " + this.attempts);
	}

	public static void main(String[] args) {
		new BattleShip();
	}
}
