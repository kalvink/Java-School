/*
 * Logo (Imaginary Business Logo)
 * Kalvin Kao
 * Ms. Kapustina
 * ICS4U
 * September 24th 2012
 */

package graphics;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class Logo extends JFrame {

	public static void main(String args[]) {
		JFrame frame = new Logo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {

		Graphics2D ga = (Graphics2D) g;
		
		// Background
		Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 200, 200);
		ga.draw(background);
		GradientPaint bg = new GradientPaint(0, 1, new Color(255, 0, 0), 0,
				600, new Color(0, 191, 255), true);
		ga.setPaint(bg);
		ga.fill(background);

		// Circle
		Ellipse2D.Float circle = new Ellipse2D.Float(50, 60, 100, 100);
		ga.setPaint(Color.white);
		ga.draw(circle);
		ga.fill(circle);
		
		// Circle
		Ellipse2D.Float circle2 = new Ellipse2D.Float(57, 67, 86, 86);
		ga.setPaint(Color.red);
		ga.draw(circle2);
		ga.fill(circle2);
		
		Rectangle2D.Double rectangle = new Rectangle2D.Double(0, 0, 200, 200);
		ga.draw(rectangle);
		
		Font text = new Font("Arial", Font.BOLD, 102);
		g.setColor(Color.white);
		g.setFont(text);
		g.drawString("K", 62, 148);

		
	}

}