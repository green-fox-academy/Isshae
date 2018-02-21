import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class toTheCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.


        int x=0;
        int y=0;

      drawToCenter(x,y,graphics);



    }

    private static void drawToCenter(int x, int y, Graphics graphics) {
        Random random=new Random();
       int x2=160;
       int y2=170;
        for (int i = 0; i < 3; i++) {
             x=random.nextInt(321);
             y=random.nextInt(341);
            graphics.setColor(Color.blue);
             graphics.drawLine(x,y,x2,y2);
        }



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 340;

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