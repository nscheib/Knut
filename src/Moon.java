import java.awt.*;

public class Moon {
    private int x;
    private int y;
    private int radius;
    private boolean daytime = false;

    public Moon(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void switchTime(int x, int y, boolean daytime){
    }

    public void drawMoon(Graphics g){

            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setStroke(new BasicStroke(3));
            g2d.setColor(Color.white);
            g2d.drawOval(x, y, radius, radius);

    }
}
