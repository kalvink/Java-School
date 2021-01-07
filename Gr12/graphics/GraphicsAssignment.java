/*
 * Graphics Assignment (20 shapes)
 * Kalvin Kao
 * Ms. Kapustina
 * ICS4U
 * September 24th 2012
 */

package graphics;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class GraphicsAssignment extends JFrame {

	public static void main(String args[]) {
		JFrame frame = new GraphicsAssignment();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 700);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {

		Graphics2D ga = (Graphics2D) g;

		// Sky
		Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 1200, 700);
		ga.draw(background);
		GradientPaint sky = new GradientPaint(0, 1, new Color(124, 206, 253),
				0, 600, new Color(30, 144, 255), true);
		ga.setPaint(sky);
		ga.fill(background);

		// Sun
		Ellipse2D.Float sun = new Ellipse2D.Float(-50, -50, 200, 200);
		ga.setPaint(Color.yellow);
		ga.draw(sun);
		ga.fill(sun);

		// Sun ray 1
		ga.setColor(Color.yellow);
		GeneralPath sunray = new GeneralPath();
		sunray.moveTo(0, 0);
		sunray.lineTo(100, 100);
		sunray.lineTo(100, 200);
		ga.fill(sunray);

		// Sun ray 2
		ga.setColor(Color.yellow);
		GeneralPath sunray2 = new GeneralPath();
		sunray2.moveTo(100, 50);
		sunray2.lineTo(16, 60);
		sunray2.lineTo(30, 200);
		ga.fill(sunray2);

		// Sun ray 3
		ga.setColor(Color.yellow);
		GeneralPath sunray3 = new GeneralPath();
		sunray3.moveTo(0, 60);
		sunray3.lineTo(200, 150);
		sunray3.lineTo(100, 25);
		ga.fill(sunray3);

		// Sun ray 4
		ga.setColor(Color.yellow);
		GeneralPath sunray4 = new GeneralPath();
		sunray4.moveTo(0, 40);
		sunray4.lineTo(210, 60);
		sunray4.lineTo(-20, -40);
		ga.fill(sunray4);

		// Cloud A
		Ellipse2D.Float cloud1a = new Ellipse2D.Float(630, 55, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud1a);
		ga.fill(cloud1a);

		Ellipse2D.Float cloud2a = new Ellipse2D.Float(650, 55, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud2a);
		ga.fill(cloud2a);

		Ellipse2D.Float cloud3a = new Ellipse2D.Float(670, 55, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud3a);
		ga.fill(cloud3a);

		// Cloud B
		Ellipse2D.Float cloud1b = new Ellipse2D.Float(320, 155, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud1b);
		ga.fill(cloud1b);

		Ellipse2D.Float cloud2b = new Ellipse2D.Float(350, 155, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud2b);
		ga.fill(cloud2b);

		Ellipse2D.Float cloud3b = new Ellipse2D.Float(380, 155, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud3b);
		ga.fill(cloud3b);

		// Cloud C
		Ellipse2D.Float cloud1c = new Ellipse2D.Float(920, 155, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud1c);
		ga.fill(cloud1c);

		Ellipse2D.Float cloud2c = new Ellipse2D.Float(950, 155, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud2c);
		ga.fill(cloud2c);

		Ellipse2D.Float cloud3c = new Ellipse2D.Float(980, 155, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud3c);
		ga.fill(cloud3c);

		// Cloud D
		Ellipse2D.Float cloud1d = new Ellipse2D.Float(-20, 255, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud1d);
		ga.fill(cloud1d);

		Ellipse2D.Float cloud2d = new Ellipse2D.Float(10, 255, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud2d);
		ga.fill(cloud2d);

		Ellipse2D.Float cloud3d = new Ellipse2D.Float(40, 255, 40, 80);
		ga.setPaint(Color.white);
		ga.draw(cloud3d);
		ga.fill(cloud3d);

		// Cloud E
		Ellipse2D.Float cloud1e = new Ellipse2D.Float(1130, 55, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud1e);
		ga.fill(cloud1e);

		Ellipse2D.Float cloud2e = new Ellipse2D.Float(1150, 55, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud2e);
		ga.fill(cloud2e);

		Ellipse2D.Float cloud3e = new Ellipse2D.Float(1170, 55, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud3e);
		ga.fill(cloud3e);

		// Cloud F
		Ellipse2D.Float cloud1f = new Ellipse2D.Float(1160, 185, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud1f);
		ga.fill(cloud1f);

		Ellipse2D.Float cloud2f = new Ellipse2D.Float(1180, 185, 30, 60);
		ga.setPaint(Color.white);
		ga.draw(cloud2f);
		ga.fill(cloud2f);

		// Hill 1
		Ellipse2D.Float hill1 = new Ellipse2D.Float(425, 490, 423, 400);
		Paint hilla = new Color(46, 139, 87);
		ga.setPaint(hilla);
		ga.draw(hill1);
		ga.fill(hill1);

		// Hill 2
		Ellipse2D.Float hill2 = new Ellipse2D.Float(550, 540, 440, 300);
		Paint hillb = new Color(0, 100, 0);
		ga.setPaint(hillb);
		ga.draw(hill2);
		ga.fill(hill2);

		// Hill 3
		Ellipse2D.Float hill3 = new Ellipse2D.Float(850, 490, 440, 300);
		Paint hillc = new Color(34, 139, 34);
		ga.setPaint(hillc);
		ga.draw(hill3);
		ga.fill(hill3);

		// Hill 4
		Ellipse2D.Float hill4 = new Ellipse2D.Float(250, 550, 350, 150);
		Paint hilld = new Color(34, 150, 34);
		ga.setPaint(hilld);
		ga.draw(hill4);
		ga.fill(hill4);

		// Hill 5
		Ellipse2D.Float hill5 = new Ellipse2D.Float(-40, 500, 350, 250);
		ga.setPaint(hillb);
		ga.draw(hill5);
		ga.fill(hill5);

		// Ground
		Rectangle2D.Float ground = new Rectangle2D.Float(0, 600, 1200, 100);
		GradientPaint grass = new GradientPaint(0, 1, new Color(34 - 139 - 34),
				342, 999, new Color(0, 100, 0), true);
		ga.setPaint(grass);
		ga.draw(ground);
		ga.fill(ground);

		// House
		Rectangle2D.Float house = new Rectangle2D.Float(150, 550, 80, 80);
		Paint h = new Color(178, 34, 34);
		ga.setPaint(h);
		ga.draw(house);
		ga.fill(house);

		// Doors
		Rectangle2D.Float door = new Rectangle2D.Float(180, 600, 20, 29);
		ga.draw(door);
		Paint d = new Color(139, 71, 38);
		ga.setPaint(d);
		ga.fill(door);

		// Steps
		Rectangle2D.Float steps = new Rectangle2D.Float(180, 630, 20, 40);
		Paint s = new Color(205, 201, 201);
		ga.setPaint(s);
		ga.draw(steps);
		ga.fill(steps);

		// Building Steps
		Rectangle2D.Float Bsteps = new Rectangle2D.Float(320, 630, 20, 40);
		ga.setPaint(s);
		ga.draw(Bsteps);
		ga.fill(Bsteps);

		// Tower Steps
		Rectangle2D.Float Tsteps = new Rectangle2D.Float(420, 630, 20, 40);
		ga.setPaint(s);
		ga.draw(Tsteps);
		ga.fill(Tsteps);

		// Restaurant Steps
		Rectangle2D.Float Rsteps = new Rectangle2D.Float(590, 630, 20, 40);
		ga.setPaint(s);
		ga.draw(Rsteps);
		ga.fill(Rsteps);

		// Windows
		Rectangle2D.Float window1 = new Rectangle2D.Float(160, 560, 20, 20);
		ga.draw(window1);
		Paint w = new Color(202, 225, 255);
		ga.setPaint(w);
		ga.fill(window1);
		Rectangle2D.Float window2 = new Rectangle2D.Float(200, 560, 20, 20);
		ga.draw(window2);
		ga.setPaint(w);
		ga.fill(window2);

		// Roof
		ga.setColor(Color.black);
		GeneralPath body = new GeneralPath();
		body.moveTo(146, 550);
		body.lineTo(233, 550);
		body.lineTo(190, 500);
		body.closePath();
		ga.fill(body);

		// Tower
		Rectangle2D.Float tower = new Rectangle2D.Float(400, 290, 60, 340);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(tower);
		ga.fill(tower);

		// Below Glass of Tower
		Ellipse2D.Float towertop = new Ellipse2D.Float(380, 280, 100, 40);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(towertop);
		ga.fill(towertop);

		// Glass of Tower
		RoundRectangle2D.Double towerglass = new RoundRectangle2D.Double(380,
				250, 100, 50, 30, 200);
		ga.setPaint(Color.cyan);
		ga.draw(towerglass);
		ga.fill(towerglass);

		// Top of Glass of Tower
		RoundRectangle2D.Double towertop2 = new RoundRectangle2D.Double(380,
				250, 100, 20, 30, 200);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(towertop2);
		ga.fill(towertop2);

		// Above tower
		Rectangle2D.Float towerAbove = new Rectangle2D.Float(400, 235, 60, 15);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(towerAbove);
		ga.fill(towerAbove);

		// Above tower 2
		Rectangle2D.Float towerAbove2 = new Rectangle2D.Float(410, 220, 40, 15);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(towerAbove2);
		ga.fill(towerAbove2);

		// Pointy thing
		Rectangle2D.Float towerPoint = new Rectangle2D.Float(425, 180, 13, 40);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(towerPoint);
		ga.fill(towerPoint);

		// Pointy thing 2
		Rectangle2D.Float towerPoint2 = new Rectangle2D.Float(430, 140, 3, 80);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(towerPoint2);
		ga.fill(towerPoint2);

		// Glass on Tower
		Rectangle2D.Float towerGlass2 = new Rectangle2D.Float(419, 320, 20, 300);
		ga.setPaint(Color.cyan);
		ga.draw(towerGlass2);
		ga.fill(towerGlass2);

		// Building
		Rectangle2D.Float building = new Rectangle2D.Float(300, 400, 60, 230);
		ga.setPaint(Color.DARK_GRAY);
		ga.draw(building);
		ga.fill(building);

		// Building door
		Rectangle2D.Float bdoor = new Rectangle2D.Float(320, 601, 20, 29);
		ga.setPaint(Color.white);
		ga.draw(bdoor);
		ga.fill(bdoor);

		// Glass on Building
		Rectangle2D.Float buildingGlass = new Rectangle2D.Float(305, 410, 15,
				15);
		Rectangle2D.Float buildingGlass2 = new Rectangle2D.Float(340, 410, 15,
				15);
		Rectangle2D.Float buildingGlass3 = new Rectangle2D.Float(305, 435, 15,
				15);
		Rectangle2D.Float buildingGlass4 = new Rectangle2D.Float(340, 435, 15,
				15);
		Rectangle2D.Float buildingGlass5 = new Rectangle2D.Float(305, 460, 15,
				15);
		Rectangle2D.Float buildingGlass6 = new Rectangle2D.Float(340, 460, 15,
				15);
		Rectangle2D.Float buildingGlass7 = new Rectangle2D.Float(305, 485, 15,
				15);
		Rectangle2D.Float buildingGlass8 = new Rectangle2D.Float(340, 485, 15,
				15);
		Rectangle2D.Float buildingGlass9 = new Rectangle2D.Float(305, 510, 15,
				15);
		Rectangle2D.Float buildingGlass10 = new Rectangle2D.Float(340, 510, 15,
				15);
		Rectangle2D.Float buildingGlass11 = new Rectangle2D.Float(305, 535, 15,
				15);
		Rectangle2D.Float buildingGlass12 = new Rectangle2D.Float(340, 535, 15,
				15);
		Rectangle2D.Float buildingGlass13 = new Rectangle2D.Float(305, 560, 15,
				15);
		Rectangle2D.Float buildingGlass14 = new Rectangle2D.Float(340, 560, 15,
				15);
		ga.setPaint(Color.cyan);
		ga.draw(buildingGlass);
		ga.fill(buildingGlass);
		ga.draw(buildingGlass2);
		ga.fill(buildingGlass2);
		ga.draw(buildingGlass3);
		ga.fill(buildingGlass3);
		ga.draw(buildingGlass4);
		ga.fill(buildingGlass4);
		ga.draw(buildingGlass5);
		ga.fill(buildingGlass5);
		ga.draw(buildingGlass6);
		ga.fill(buildingGlass6);
		ga.draw(buildingGlass7);
		ga.fill(buildingGlass7);
		ga.draw(buildingGlass8);
		ga.fill(buildingGlass8);
		ga.draw(buildingGlass9);
		ga.fill(buildingGlass9);
		ga.draw(buildingGlass10);
		ga.fill(buildingGlass10);
		ga.draw(buildingGlass11);
		ga.fill(buildingGlass11);
		ga.draw(buildingGlass12);
		ga.fill(buildingGlass12);
		ga.draw(buildingGlass13);
		ga.fill(buildingGlass13);
		ga.draw(buildingGlass14);
		ga.fill(buildingGlass14);

		// Restaurant
		Rectangle2D.Float store = new Rectangle2D.Float(500, 545, 200, 85);
		ga.setPaint(Color.white);
		ga.draw(store);
		ga.fill(store);

		// Restaurant door
		Rectangle2D.Float rdoor = new Rectangle2D.Float(590, 601, 20, 29);
		ga.setPaint(Color.red);
		ga.draw(rdoor);
		ga.fill(rdoor);

		// Restaurant window outline in black
		ga.setPaint(Color.black);
		Rectangle2D.Float rwindo = new Rectangle2D.Float(505, 585, 70, 40);
		Rectangle2D.Float rwindo2 = new Rectangle2D.Float(625, 585, 70, 40);
		ga.draw(rwindo);
		ga.fill(rwindo);
		ga.draw(rwindo2);
		ga.fill(rwindo2);
		
		// Restaurant window
		Rectangle2D.Float rwind = new Rectangle2D.Float(510, 590, 60, 30);
		ga.setPaint(Color.cyan);
		ga.draw(rwind);
		ga.fill(rwind);
		Rectangle2D.Float rwind2 = new Rectangle2D.Float(630, 590, 60, 30);
		ga.draw(rwind2);
		ga.fill(rwind2);

		// Roof
		ga.setPaint(h);
		GeneralPath body1 = new GeneralPath();
		body1.moveTo(488, 550);
		body1.lineTo(715, 550);
		body1.lineTo(603, 500);
		body1.closePath();
		ga.fill(body1);

		// Road
		Rectangle2D.Float road = new Rectangle2D.Float(0, 640, 1200, 30);
		Paint r = new Color(205, 201, 201);
		ga.setPaint(r);
		ga.draw(road);
		ga.fill(road);
		
		// Road center lines
		Rectangle2D.Float rline = new Rectangle2D.Float(0, 650, 1200, 5);
		ga.setPaint(Color.yellow);
		ga.draw(rline);
		ga.fill(rline);
		
		
		// Car top
		Rectangle2D.Float ctop = new Rectangle2D.Float(920, 610, 40, 20);
		ga.setPaint(Color.orange);
		ga.draw(ctop);
		ga.fill(ctop);

		// Car windows
		Rectangle2D.Float cwindow = new Rectangle2D.Float(925, 615, 10, 10);
		Rectangle2D.Float cwindow2 = new Rectangle2D.Float(945, 615, 10, 10);
		ga.setPaint(Color.cyan);
		ga.draw(cwindow);
		ga.draw(cwindow2);
		ga.fill(cwindow);
		ga.fill(cwindow2);

		// Car lights
		Rectangle2D.Float clight = new Rectangle2D.Float(973, 635, 10, 10);
		ga.setPaint(Color.red);
		ga.draw(clight);
		ga.fill(clight);

		// Car wheels
		Ellipse2D.Float wheel = new Ellipse2D.Float(905, 640, 20, 20);
		Ellipse2D.Float wheel2 = new Ellipse2D.Float(955, 640, 20, 20);
		ga.setPaint(Color.black);
		ga.draw(wheel);
		ga.fill(wheel);
		ga.draw(wheel2);
		ga.fill(wheel2);

		// Car
		Rectangle2D.Float car = new Rectangle2D.Float(900, 630, 80, 20);
		ga.setPaint(Color.orange);
		ga.draw(car);
		ga.fill(car);

		// Tree
		RoundRectangle2D.Double tree = new RoundRectangle2D.Double(80, 560, 35,
				60, 30, 10);
		Paint t = new Color(139, 87, 66);
		ga.setPaint(t);
		ga.draw(tree);
		ga.fill(tree);

		// Leaves
		Ellipse2D.Float leaf = new Ellipse2D.Float(76, 525, 45, 45);
		Ellipse2D.Float leaf2 = new Ellipse2D.Float(70, 515, 40, 45);
		Ellipse2D.Float leaf3 = new Ellipse2D.Float(90, 510, 36, 45);
		ga.setPaint(Color.green);
		ga.draw(leaf);
		ga.draw(leaf2);
		ga.draw(leaf3);
		ga.fill(leaf);
		ga.fill(leaf2);
		ga.fill(leaf3);

		// Tree2
		RoundRectangle2D.Double tree2 = new RoundRectangle2D.Double(750, 560,
				35, 60, 30, 10);
		ga.setPaint(t);
		ga.draw(tree2);
		ga.fill(tree2);

		// Leaves
		Ellipse2D.Float leaf4 = new Ellipse2D.Float(746, 525, 45, 45);
		Ellipse2D.Float leaf5 = new Ellipse2D.Float(740, 515, 40, 45);
		Ellipse2D.Float leaf6 = new Ellipse2D.Float(760, 510, 36, 45);
		ga.setPaint(Color.green);
		ga.draw(leaf4);
		ga.draw(leaf5);
		ga.draw(leaf6);
		ga.fill(leaf4);
		ga.fill(leaf5);
		ga.fill(leaf6);

	}
}