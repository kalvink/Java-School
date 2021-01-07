/* Unit Test - BirthdayCake
 * Kalvin Kao
 * ICS4U
 * Oct 30th 2012
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;

public class BirthdayCake extends JFrame {
	public static void main(String args[]) {
		JFrame frame = new BirthdayCake();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		Graphics2D ga = (Graphics2D) g;
		// Background
		Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 500, 400);
		ga.draw(background);
		ga.setColor(Color.blue);
		ga.fill(background);

		// Cake
		RoundRectangle2D.Float cake = new RoundRectangle2D.Float(120, 250, 250,
				150, 80, 51);
		ga.setColor(Color.pink);
		ga.draw(cake);
		ga.fill(cake);

		// Candles
		Rectangle2D.Float candle1 = new Rectangle2D.Float(150, 220, 10, 60);
		ga.setColor(Color.red);
		ga.draw(candle1);
		ga.fill(candle1);

		Rectangle2D.Float candle2 = new Rectangle2D.Float(180, 220, 10, 60);
		ga.setColor(Color.orange);
		ga.draw(candle2);
		ga.fill(candle2);

		Rectangle2D.Float candle3 = new Rectangle2D.Float(210, 220, 10, 60);
		ga.setColor(Color.green);
		ga.draw(candle3);
		ga.fill(candle3);

		Rectangle2D.Float candle4 = new Rectangle2D.Float(240, 220, 10, 60);
		ga.setColor(Color.GRAY);
		ga.draw(candle4);
		ga.fill(candle4);

		Rectangle2D.Float candle5 = new Rectangle2D.Float(270, 220, 10, 60);
		ga.setColor(Color.white);
		ga.draw(candle5);
		ga.fill(candle5);

		Rectangle2D.Float candle6 = new Rectangle2D.Float(300, 220, 10, 60);
		ga.setColor(Color.black);
		ga.draw(candle6);
		ga.fill(candle6);

		// Fire
		Ellipse2D.Float fire1 = new Ellipse2D.Float(150, 200, 10, 20);
		ga.setColor(Color.yellow);
		ga.draw(fire1);
		ga.fill(fire1);

		Ellipse2D.Float fire2 = new Ellipse2D.Float(180, 200, 10, 20);
		ga.setColor(Color.yellow);
		ga.draw(fire2);
		ga.fill(fire2);

		Ellipse2D.Float fire3 = new Ellipse2D.Float(210, 200, 10, 20);
		ga.setColor(Color.yellow);
		ga.draw(fire3);
		ga.fill(fire3);

		Ellipse2D.Float fire4 = new Ellipse2D.Float(240, 200, 10, 20);
		ga.setColor(Color.yellow);
		ga.draw(fire4);
		ga.fill(fire4);
		
		Ellipse2D.Float fire5 = new Ellipse2D.Float(270, 200, 10, 20);
		ga.setColor(Color.yellow);
		ga.draw(fire5);
		ga.fill(fire5);
		
		Ellipse2D.Float fire6 = new Ellipse2D.Float(300, 200, 10, 20);
		ga.setColor(Color.yellow);
		ga.draw(fire6);
		ga.fill(fire6);

		Rectangle2D.Float icing2 = new Rectangle2D.Float(140, 290, 200, 10);
		ga.setColor(Color.cyan);
		ga.draw(icing2);
		ga.fill(icing2);

		Rectangle2D.Float icing3 = new Rectangle2D.Float(140, 340, 200, 10);
		ga.setColor(Color.cyan);
		ga.draw(icing3);
		ga.fill(icing3);

		// Magenta cream
		GeneralPath icing = new GeneralPath();
		ga.setColor(Color.MAGENTA);
		icing.moveTo(140, 315);
		icing.lineTo(340, 315);
		icing.lineTo(340, 330);
		icing.lineTo(140, 330);
		ga.fill(icing);

	}

}
