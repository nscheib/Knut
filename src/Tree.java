import java.awt.*;

public class Tree {

    int x;
    int y;
    int size;
    int discount;
    boolean choppedDown = false;


    public void tree(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        this.discount = ((int)(Math.random()*30)+5);
    }


    private void treeDiscountChopDown(int x, int y, int size, int discount){
        this.x = y;
        this.y = x;
        this.size = size;
    }


    private void chopDown(int x, int y, boolean choppedDown){

    }


    protected static void drawTree(Graphics g){
        int treeAnzahl = 5;
        int anzahl = 0;
        boolean schleife = false;

        int pos1 = 20, pos2 = 12, pos3 = 17, pos4 = 8, pos5 = 12, pos6 = 2, pos7 = 12, pos8 = 0, pos9 = 17, pos10 = 17, pos11 = 22, pos12 = 22, pos13 = 40, pos14 = 27, pos15 = 37, pos16 = 27, pos17 = 32, pos18 = 22, pos19 = 27, pos20 = 20;
        int pos40 = 10, pos21 = 20, pos22 = 20, pos23 = 30, pos24 = 30, pos25 = 40, pos26 = 40, pos27 = 50, pos28 = 50, pos29 = 60, pos30 = 60, pos31 = 50, pos32 = 50, pos33 = 40, pos34 = 40, pos35 = 30, pos36 = 30, pos37 = 20, pos38 = 20, pos39 = 10;
        int npoints = 20;

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        while (!schleife) {
            if (treeAnzahl == anzahl){
                schleife = true;
            } else {
                int xpoints[] = new int[]{pos1*size+x, pos2*size+x, pos3*size+x, pos4*size+x, pos5*size+x, pos6*size+x, pos7*size+x, pos8*size+x, pos9*size+x, pos10*size+x, pos11*size+x, pos12*size+x, pos13*size+x, pos14*size+x, pos15*size+x, pos16*size+x, pos17*size+x, pos18*size+x, pos19*size+x, pos20*size+x};
                int ypoints[] = new int[]{pos40*size+y, pos21*size+y, pos22*size+y, pos23*size+y, pos24*size+y, pos25*size+y, pos26*size+y, pos27*size+y, pos28*size+y, pos29*size+y, pos30*size+y, pos31*size+y, pos32*size+y, pos33*size+y, pos34*size+y, pos35*size+y, pos36*size+y, pos37*size+y, pos38*size+y, pos39*size+y};
                Polygon p = new Polygon(xpoints, ypoints, npoints);
                g2d.setColor(Color.white);
                g2d.fillPolygon(p);

                anzahl++;
            }
        }
    }

}
