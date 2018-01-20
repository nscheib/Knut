import java.awt.*;
import java.util.Random;

public class Star {
    private int x;
    private int y;
    private int size;
    private boolean daytime = false;

    public Star(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void drawStar(Graphics g){

        if (daytime) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int xpoints[] = {0*size+x, 2*size+x, 2*size+x, 4*size+x, 4*size+x, 6*size+x, 6*size+x, 8*size+x, 8*size+x, 6*size+x, 6*size+x, 4*size+x, 4*size+x, 2*size+x, 2*size+x, 0*size+x};
            int ypoints[] = {4*size+y, 6*size+y, 5*size+y, 7*size+y, 6*size+y, 8*size+y, 5*size+y, 5*size+y, 3*size+y, 3*size+y, 0*size+y, 2*size+y, 1*size+y, 3*size+y, 2*size+y, 4*size+y};
            int npoints = 11;

            Polygon p = new Polygon(xpoints, ypoints, npoints);
            g2d.setColor(new Color(191, 174, 0));
            g2d.setStroke(new BasicStroke(3));
            g2d.fillPolygon(p);
        }
    
    }

}
