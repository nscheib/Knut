import java.awt.*;
import java.util.Random;

public class Star {
    private int x;
    private int y;
    private int size;


    public Star(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void drawStar(Graphics g){
        int anzahlSterne = 8;
        int anzahl = 0;

        boolean schleife = false;

        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int pos1 = 5, pos2 = 4, pos3 = 0, pos4 = 3, pos5 = 1, pos6 = 5, pos7 = 8, pos8 = 7, pos9 = 10, pos10 = 6, pos11 = 5;
        int pos20 = 0, pos21 = 4, pos22 = 4, pos23 = 6, pos24 = 10, pos25 = 7, pos26 = 10, pos27 = 6, pos28 = 4, pos29 = 4, pos30 = 0;

        int xpoints[] = {pos1*size+x, pos2*size+x, pos3*size+x, pos4*size+x, pos5*size+x, pos6*size+x, pos7*size+x, pos8*size+x, pos9*size+x, pos10*size+x, pos11*size+x};
        int ypoints[] = {pos20*size+y, pos21*size+y, pos22*size+y, pos23*size+y, pos24*size+y, pos25*size+y, pos26*size+y, pos27*size+y, pos28*size+y, pos29*size+y, pos30*size+y};
        int npoints = 11;

        Polygon p = new Polygon(xpoints, ypoints, npoints);
        g2d.setColor(new Color(191, 174, 0));
        g2d.setStroke(new BasicStroke(3));
        g2d.fillPolygon(p);

    
    }

}
