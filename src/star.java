import java.awt.*;
import java.util.Random;

public class star {

    private static void starMethode(int x, int y){
        /*if (daytime = true){

        }*/
    }

    protected static void drawStar(Graphics g){
        int anzahlSterne = 8;
        int anzahl = 0;

        boolean schleife = false;

        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        while (!schleife) {
            int pos1 = 5, pos2 = 4, pos3 = 0, pos4 = 3, pos5 = 1, pos6 = 5, pos7 = 8, pos8 = 7, pos9 = 10, pos10 = 6, pos11 = 5;
            int pos20 = 0, pos21 = 4, pos22 = 4, pos23 = 6, pos24 = 10, pos25 = 7, pos26 = 10, pos27 = 6, pos28 = 4, pos29 = 4, pos30 = 0;

            Random rand = new Random();
            final int A = rand.nextInt(900);
            final int B = rand.nextInt(100);
            final int Z = rand.nextInt(6);

            if (anzahlSterne == anzahl) {
                schleife = true;
            } else {
                int xpoints[] = {pos1*Z+A, pos2*Z+A, pos3*Z+A, pos4*Z+A, pos5*Z+A, pos6*Z+A, pos7*Z+A, pos8*Z+A, pos9*Z+A, pos10*Z+A, pos11*Z+A};
                int ypoints[] = {pos20*Z+B, pos21*Z+B, pos22*Z+B, pos23*Z+B, pos24*Z+B, pos25*Z+B, pos26*Z+B, pos27*Z+B, pos28*Z+B, pos29*Z+B, pos30*Z+B};
                int npoints = 11;

                Polygon p = new Polygon(xpoints, ypoints, npoints);
                g2d.setColor(Color.white);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawPolygon(p);

                anzahl++;
            }
        }
        return;
    }

}
