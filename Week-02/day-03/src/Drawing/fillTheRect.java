package Drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fillTheRect {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Random random=new Random();



        for (int i = 0; i <4 ; i++) {
          int r= random.nextInt(256);
          int g= random.nextInt(256);
          int b= random.nextInt(256);
          Color randomColor=new Color(r,g,b);
            int x= random.nextInt(321);
            int y=random.nextInt(344);
            int width=random.nextInt(100);
            int height=random.nextInt(100);
            graphics.setColor(randomColor);
            graphics.fillRect(x,y,width,height);

        }

    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}