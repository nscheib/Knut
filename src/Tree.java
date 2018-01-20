import java.awt.*;


public class Tree {

    private int x;
    private int y;
    private int size;
    private int discount;
    private boolean choppedDown = false;

    public Tree(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        this.discount = discount;
    }

    public void treeDiscountChopDown(int x, int y, int size, int discount){
        this.x = y;
        this.y = x;
        this.size = size;
        discount = ((int)(Math.random()*30)+5);
    }

    public void chopDown(int x, int y, boolean choppedDown){
        choppedDown = true;
    }

    public void drawTree(Graphics g){

        int xpoints[]=new int[]{4*size+y, 6*size+y, 5*size+y, 7*size+y, 6*size+y, 8*size+y, 5*size+y, 5*size+y, 3*size+y, 3*size+y, 0*size+y, 2*size+y, 1*size+y, 3*size+y, 2*size+y, 4*size+y};
        int ypoints[]=new int[]{0*size+x, 2*size+x, 2*size+x, 4*size+x, 4*size+x, 6*size+x, 6*size+x, 8*size+x, 8*size+x, 6*size+x, 6*size+x, 4*size+x, 4*size+x, 2*size+x, 2*size+x, 0*size+x};
        int npoints = xpoints.length;

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Polygon p = new Polygon(xpoints, ypoints, npoints);
        g2d.setColor(Color.white);
        g2d.fillPolygon(p);
    }
}
