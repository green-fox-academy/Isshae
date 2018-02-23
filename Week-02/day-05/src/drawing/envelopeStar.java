package drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelopeStar {
    public static void mainDraw(Graphics graphics) {
       int xStart=0;
       int yStart=0;
       int xEnd=300;
       int yEnd=300;


        for (int i = 0; i <20 ; i++) {
            xStart+=WIDTH/40;
            yEnd+=HEIGHT/40;
        //    graphics.setColor(Color.blue);
            graphics.drawLine(xStart,yStart+(HEIGHT/2),xEnd,yEnd);
        }
        for (int i = 0; i <20 ; i++) {
            yStart+=HEIGHT/40;
            xEnd+=WIDTH/40;
          //  graphics.setColor(Color.yellow);
            graphics.drawLine(xStart,yStart,xEnd,yEnd-(HEIGHT/2));
        }
        for (int i = 0; i <20 ; i++) {
            xStart+=WIDTH/40;
            yEnd-=HEIGHT/40;
        //    graphics.setColor(Color.blue);
            graphics.drawLine(xStart,yStart,xEnd-(WIDTH/2),yEnd);
        }
        for (int i = 0; i <20 ; i++) {
            xStart+=WIDTH/40;
            yEnd-=HEIGHT/40;
           // graphics.setColor(Color.yellow);
            graphics.drawLine(xStart-WIDTH,yStart,xEnd-(WIDTH/2),yEnd+15);

        }
       // graphics.setColor(Color.yellow);
        //graphics.drawLine(0,300,300,300);



    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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