

import java.awt.*;
import java.util.*;


public class trees {

    private int x = 10;
    private int y = 10;
    private int size = 10;
    private int discount = ((int)(Math.random()*15)+1);
    private boolean choppedDown = false;


    public void tree(int x, int y, int size){


    }


    private void treeDiscountChopDown(int x, int size, int discount){
        discount = ((int)(Math.random()*15)+1);
    }


    private void chopDown(int x, int y, boolean choppedDown){

    }


    protected static void drawTree(Graphics g){

        int pos1 = 20, pos2 = 12, pos3 = 17, pos4 = 8, pos5 = 12, pos6 = 2, pos7 = 12, pos8 = 0, pos9 = 17, pos10 = 17, pos11 = 22, pos12 = 22, pos13 = 40, pos14 = 27, pos15 = 37, pos16 = 27, pos17 = 32, pos18 = 22, pos19 = 27, pos20 = 20;
        int pos40 = 10, pos21 = 20, pos22 = 20, pos23 = 30, pos24 = 30, pos25 = 40, pos26 = 40, pos27 = 50, pos28 = 50, pos29 = 60, pos30 = 60, pos31 = 50, pos32 = 50, pos33 = 40, pos34 = 40, pos35 = 30, pos36 = 30, pos37 = 20, pos38 = 20, pos39 = 10;

        int treeAnzahl = 5;
        int anzahl = 0;
        boolean schleife = false;

        int npoints = 20;

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        while (!schleife) {
            //Random wert = new Random();
            final int A = (int)(Math.random() * 1000);
            final int B = (int)(Math.random() * 450)+200;
            final int Z = (int)(Math.random() * 5) + 2;

            if (treeAnzahl == anzahl){
                schleife = true;
            } else {
                int xpoints[] = new int[]{pos1*Z+A, pos2*Z+A, pos3*Z+A, pos4*Z+A, pos5*Z+A, pos6*Z+A, pos7*Z+A, pos8*Z+A, pos9*Z+A, pos10*Z+A, pos11*Z+A, pos12*Z+A, pos13*Z+A, pos14*Z+A, pos15*Z+A, pos16*Z+A, pos17*Z+A, pos18*Z+A, pos19*Z+A, pos20*Z+A};
                int ypoints[] = new int[]{pos40*Z+B, pos21*Z+B, pos22*Z+B, pos23*Z+B, pos24*Z+B, pos25*Z+B, pos26*Z+B, pos27*Z+B, pos28*Z+B, pos29*Z+B, pos30*Z+B, pos31*Z+B, pos32*Z+B, pos33*Z+B, pos34*Z+B, pos35*Z+B, pos36*Z+B, pos37*Z+B, pos38*Z+B, pos39*Z+B};

                Polygon p = new Polygon(xpoints, ypoints, npoints);
                g2d.setColor(Color.white);
                g2d.fillPolygon(p);

                anzahl++;
            }
        }
        return;
    }

}
