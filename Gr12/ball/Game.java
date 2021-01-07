/*
 * Ball Assignment
 * Kalvin Kao
 * ICS4U
 * Oct 12th 2012
 */

package ball;

import java.awt.*;
import javax.swing.*;

public class Game extends JFrame {

	int ah, bh, xh, yh; // parameters of the rectangle frame
	Color[] ColorAr = { Color.red, Color.blue, Color.pink, Color.green,
			Color.yellow, Color.magenta, Color.black, Color.orange, Color.gray,
			Color.cyan };
	Ball b[];
	int quantity = 10;

	public void paint(Graphics g) {
		int i;
		((Graphics2D) g).setPaint(Color.black);
		((Graphics2D) g).drawRect(ah, bh, xh, yh);
		for (i = quantity - 1; i >= 0; i--) {
			b[i].hide(g);
		}
		for (i = 0; i < quantity; i++) {
			b[i].show(g);
		}
	}

	// public void update(Graphics g){}

	public void prepare() {
		int i; // creating new balls
		ah = 20;
		bh = 40;
		xh = 400;
		yh = 400;
		b = new Ball[quantity];
		for (i = 0; i < quantity; i++) {
			b[i] = new Ball(100, 100, (int) (Math.random() * 20) - 10,
					(int) (Math.random() * 20) - 10,
					(int) ((Math.random() * 10) * (Math.random() * 10) + 20),
					ColorAr[(int) (Math.random() * 9)]);
		}
	}

	public void run() {
		int i;
		while (true) {
			for (i = 0; i < quantity; i++)
				b[i].move(ah, bh, xh, yh);// move balls
			for (int j = 0; j < 10000 * 3000; j++)
				; // delay;

			repaint();
		}
	}

	public static void main(String args[]) {
		Game frame = new Game();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.lightGray);
		frame.setSize(450, 470);
		frame.prepare();
		frame.setVisible(true);
		frame.run();
	}

}
