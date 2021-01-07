/*
 * Ball Assignment
 * Kalvin Kao
 * ICS4U
 * Oct 12th 2012
 */

package ball;

import java.awt.*;
import java.awt.geom.*;

public class Ball {
	int i;
	float x, y; // coordinates of ball rectangle
	float xo, yo;
	float vx, vy; // coordinates of velocity vector
	Color colour; // ball colour
	float d; // diameter of the ball or sizes of ball rectangle
	float a = 120;
	Ellipse2D.Float circle;

	// overloaded constructor
	Ball(int x, int y, int vx, int vy, int d, Color colour) {
		this.x = x;
		this.y = y;
		this.d = d;
		xo = x;
		yo = y;
		this.setColour(colour);
		this.setVelocity(vx, vy);
		circle = new Ellipse2D.Float(x, y, d, d);
	}

	public void setColour(Color colour) {
		this.colour = colour;
	}

	public void setVelocity(int vx, int vy) {
		this.vx = vx;
		this.vy = vy;
	}
	
	public void show(Graphics g) {
		((Graphics2D) g).setPaint(colour);
		if (i == 0) {
            d++;
			circle.setFrame(x, y, d, d);
			((Graphics2D) g).fill(circle);
			xo = x;
			yo = y;
		} 
		else if (i==1){
            d--;
			circle.setFrame(x, y, d, d);
			((Graphics2D) g).fill(circle);
			xo = x;
			yo = y;
		}
	}

	public void hide(Graphics g) {
		if (d==a && i==0){
			i=1;
		}
		else if (d<=5 && i==1){
			i=0;
		}
		Color c = ((Graphics2D) g).getBackground();
		((Graphics2D) g).setPaint(c);
			circle.setFrame(xo, yo, d, d);
			((Graphics2D) g).fill(circle);
	}

	public void setPosition(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void move(int a, int b, int xh, int yh) {
		if (vy > 0) {
			if (y + d + vy - yh - b > 0) {
				y = yh + b - d;
				vy = -vy;
			} else
				y += vy;
		} else {
			if (y + vy <= b) {
				y = b;
				vy = -vy;
			} else
				y += vy;
		}
		if (vx > 0) {
			if (x + d + vx - xh - a > 0) {
				x = xh + a - d;
				vx = -vx;
			} else
				x += vx;
		} else {
			if (x + vx <= a) {
				x = a;
				vx = -vx;
			} else
				x += vx;
		}
	}

} // ball class
