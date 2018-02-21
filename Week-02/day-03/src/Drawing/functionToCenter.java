package Drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class functionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 0;
        int y = 0;

        lineDrawer(x, y, graphics);


    }

    private static void lineDrawer(int x, int y, Graphics graphics) {
        Color color = new Color(0, 0, 0);
        int xCenter = WIDTH / 2;
        int yCenter = HEIGHT / 2;


        for (int top = 0; top < (WIDTH) / 20; top++) {
            graphics.setColor(colorRandomizer(color));
            graphics.drawLine(x, y, xCenter, yCenter);
            x += 20;
        }
        for (int right = 0; right < HEIGHT / 20; right++) {
            graphics.setColor(colorRandomizer(color));
            graphics.drawLine(x, y, xCenter, yCenter);
            y += 20;

        }
        for (int i = 0; i <WIDTH/20 ; i++) {
            graphics.setColor(colorRandomizer(color));
            graphics.drawLine(x, y, xCenter, yCenter);
            x-=20;
        }
        for (int i = 0; i <HEIGHT/20 ; i++) {
            graphics.setColor(colorRandomizer(color));
            graphics.drawLine(x, y, xCenter, yCenter);
            y-=20;
        }

    }

    private static Color colorRandomizer(Color color) {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        Color randomColor = new Color(r, g, b);


        return randomColor;
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}