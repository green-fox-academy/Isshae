import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingFractals {

  static int WIDTH = 600;
  static int HEIGHT = 600;
  static int iterator = 1;
  static double length = 60;

  private static void mainDraw(Graphics graphics) {
    int x0 = WIDTH / 2;
    int y0 = HEIGHT - 50;

    double angle = 0;

    drawTree(graphics, x0, y0, length, angle);
  }

  private static void drawTree(Graphics graphics, int x0, int y0, double length, double angle) {
    if (length <= 60 - (iterator * 6)) {
      return;
    } else {
      int x1 = ((int) (x0 + length * Math.sin(Math.toRadians(angle))));
      int y1 = ((int) (y0 - length * Math.cos(Math.toRadians(angle))));

      graphics.setColor(colorRandomizer());
      graphics.drawLine(x0, y0, x1, y1);

      drawTree(graphics, x1, y1, length - 6, angle + 30);
      drawTree(graphics, x1, y1, length - 6, angle - 30);
      drawTree(graphics, x1, y1, length - 6, angle);
    }
  }

  private static Color colorRandomizer() {
    Random random = new Random();
    int colorRange = 256;
    int r = random.nextInt(colorRange);
    int g = random.nextInt(colorRange);
    int b = random.nextInt(colorRange);
    Color randomColor = new Color(r, g, b);


    return randomColor;
  }


  // Don't touch the code below


  public static void main(String[] args) throws InterruptedException {
    JFrame jFrame = new JFrame("My beautiful picture");
    ImagePanel imagePanel = new ImagePanel();

    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    imagePanel.setBackground(Color.black);

    boolean isSwitch = true;
    while (true) {
      if (iterator == 10) {
  isSwitch=false;
      }else if (iterator==0){
        isSwitch=true;
      }
      if (isSwitch){
        iterator++;
      }else{
        iterator--;
      }

      imagePanel.repaint();
      Thread.sleep(300-(iterator*10));

    }
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}