import java.awt.*;


public class Tree {

    private int x;
    private int y;
    private int size;
    private int discount;
    private boolean choppedDown = false;
    private int xpoints[];
    private int ypoints[];
    private int npoints;
    private Polygon p;

    /**
     *
     * @param x
     * @param y
     * @param size
     */
    public Tree(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        this.discount = ((int)(Math.random()*30)+5);

        xpoints = new int[]{4 * size + y, 6 * size + y, 5 * size + y, 7 * size + y, 6 * size + y, 8 * size + y, 5 * size + y, 5 * size + y, 3 * size + y, 3 * size + y, 0 * size + y, 2 * size + y, 1 * size + y, 3 * size + y, 2 * size + y, 4 * size + y};
        ypoints = new int[]{0 * size + x, 2 * size + x, 2 * size + x, 4 * size + x, 4 * size + x, 6 * size + x, 6 * size + x, 8 * size + x, 8 * size + x, 6 * size + x, 6 * size + x, 4 * size + x, 4 * size + x, 2 * size + x, 2 * size + x, 0 * size + x};
        npoints = xpoints.length;

        p = new Polygon(xpoints,ypoints,npoints);
    }// END Tree(ohne discount)

    /**
     *
     * @param x
     * @param y
     * @param size
     * @param discount
     */
    public Tree(int x, int y, int size, int discount){
        this.x = x;
        this.y = y;
        this.size = size;
        this.discount = discount;

        xpoints = new int[]{4 * size + y, 6 * size + y, 5 * size + y, 7 * size + y, 6 * size + y, 8 * size + y, 5 * size + y, 5 * size + y, 3 * size + y, 3 * size + y, 0 * size + y, 2 * size + y, 1 * size + y, 3 * size + y, 2 * size + y, 4 * size + y};
        ypoints = new int[]{0 * size + x, 2 * size + x, 2 * size + x, 4 * size + x, 4 * size + x, 6 * size + x, 6 * size + x, 8 * size + x, 8 * size + x, 6 * size + x, 6 * size + x, 4 * size + x, 4 * size + x, 2 * size + x, 2 * size + x, 0 * size + x};
        npoints = xpoints.length;

        p = new Polygon(xpoints,ypoints,npoints);
    }// END Tree(mit discount)

    /**
     *
     * @param mousX
     * @param mousY
     */
    public void chopDown(int mousX, int mousY){
        if(p.intersects(mousX, mousY, 1, 1)){
            //gefallene koordinaten
            xpoints = new int[]{0 * size + y , 2 * size + y, 2 * size + y, 4 * size + y, 4 * size + y, 6 * size + y, 6 * size + y, 8 * size + y, 8 * size + y, 6 * size + y, 6 * size + y, 4 * size + y, 4 * size + y, 2 * size + y, 2 * size + y, 0 * size + y};
            ypoints = new int[]{4 * size + x, 6 * size + x, 5 * size + x, 7 * size + x, 6 * size + x, 8 * size + x, 5 * size + x, 5 * size + x, 3 * size + x, 3 * size + x, 0 * size + x, 2 * size + x, 1 * size + x, 3 * size + x, 2 * size + x, 4 * size + x};
            p = new Polygon(xpoints, ypoints, npoints);
            choppedDown = true;
        }// END chopDown()
    }

    /**
     *
     * @param g
     */
    public void drawTree(Graphics g){
        g.setColor(Color.white);
        g.fillPolygon(p);

        if(choppedDown){
            //discount anzeigen
            g.setColor(Color.BLACK);
            System.out.println("X: " + x + ", Y: " + y);
            //verwirrt ...                 X koordinate mit y,  Y koordinate mit x
            g.drawString(discount + "%",y + size * 3,x + size * 4);
        }
        else{
            //kein discount...
        }

    }// END drawTree()

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDiscount() {
        return discount;
    }
}
