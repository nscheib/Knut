

import java.awt.*;
import java.awt.event.MouseEvent;

public class Moon {
    private int X;
    private int Y;
    private int radius = 10;
    private boolean daytime = false;

    private static void moonMethode(int x, int y, int radius){

    }

    private void switchTime(int x, int y, boolean daytime){
    }

    public static void drawMoon(Graphics g/*, boolean daytime*/){

        //if (daytime == true) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setStroke(new BasicStroke(3));
            g2d.setColor(Color.white);
            g2d.drawOval(1000, 100, 100, 100);
        /*} else {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setStroke(new BasicStroke(3));
            g2d.setColor(Color.white);
            g2d.fillOval(1000, 100, 100, 100);
        }*/
    }
}
