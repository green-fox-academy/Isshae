package Drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class rainbowBoxes {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.


        int squareSize = 10;

        Color color = new Color(0, 0, 0);


        squareDraw(squareSize, colorRandomizer(color), graphics);

    }

    private static Color colorRandomizer(Color color) {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        Color randomColor = new Color(r, g, b);


        color = randomColor;
        return randomColor;
    }

    private static void squareDraw(int squareSize, Color color, Graphics graphics) {

        for (int firstBox = 0; firstBox < 1; firstBox++) {
            graphics.setColor(colorRandomizer(color));
            graphics.drawRect(((WIDTH / 2) - (squareSize / 2)), ((HEIGHT / 2) - (squareSize / 2)), squareSize, squareSize);
            for (int secondBoxes = 0; secondBoxes < WIDTH; secondBoxes++) {
                graphics.setColor(colorRandomizer(color));
                squareSize++;
                graphics.drawRect(((WIDTH / 2) - (squareSize / 2)), ((HEIGHT / 2) - (squareSize / 2)), squareSize, squareSize);
            }
        }
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