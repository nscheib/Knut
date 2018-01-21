/** IMPORT */
import java.awt.*;
/* END Import */

/**
 * Class Tree ist zustaendig um die Baeume zu zeichnen und zu pruefen,
 * ob diese gefaellt wurden oder nicht und gibt bei einem gefaellten Baum einen
 * Discount zwischen 5% und 30% aus.
 *
 * @author Christian Clausen
 * @author Nick Scheib
 *
 * @version v1.0
 */
public class Tree {
    //private Variablen, nicht manipulierbar
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
     * Methode Tree uebergibt die Parametern aus der Knut.class an die Tree.class
     * @param x -Wert der Baeume fuer die Positionierung, weißt einen Wert zu
     * @param y -Wert der Baeume fuer die Positionierung, weißt einen Wert zu
     * @param size -Wert der Baeume zum veraendern der groeße, weißt einen Wert zu*/
    public Tree(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.discount = ((int)(Math.random()*30)+5);

        // Polygon zeichnet einen Baum mit den Koordinaten
        xpoints = new int[]{4 * size + y, 6 * size + y, 5 * size + y, 7 * size + y, 6 * size + y, 8 * size + y, 5 * size + y, 5 * size + y, 3 * size + y, 3 * size + y, 0 * size + y, 2 * size + y, 1 * size + y, 3 * size + y, 2 * size + y, 4 * size + y};
        ypoints = new int[]{0 * size + x, 2 * size + x, 2 * size + x, 4 * size + x, 4 * size + x, 6 * size + x, 6 * size + x, 8 * size + x, 8 * size + x, 6 * size + x, 6 * size + x, 4 * size + x, 4 * size + x, 2 * size + x, 2 * size + x, 0 * size + x};
        npoints = xpoints.length;

        // gibt die Werte zum ausdrucken weiter
        p = new Polygon(xpoints,ypoints,npoints);

    }// END Tree(ohne discount)

    /**
     * Methode gibt an wie der Baum beim Klicken aussehen soll
     * @param x -Wert der Baeume fuer die Positionierung
     * @param y -Wert der Baeume fuer die Positionierung
     * @param size -Wert der Baeume zum veraendern der groeße
     * @param discount -Wert gibt einen Discount von 5% bis 30% in die Methode
     */
    public Tree(int x, int y, int size, int discount) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.discount = discount;

        // Polygon zeichnet einen Baum mit den Koordinaten
        xpoints = new int[]{4 * size + y, 6 * size + y, 5 * size + y, 7 * size + y, 6 * size + y, 8 * size + y, 5 * size + y, 5 * size + y, 3 * size + y, 3 * size + y, 0 * size + y, 2 * size + y, 1 * size + y, 3 * size + y, 2 * size + y, 4 * size + y};
        ypoints = new int[]{0 * size + x, 2 * size + x, 2 * size + x, 4 * size + x, 4 * size + x, 6 * size + x, 6 * size + x, 8 * size + x, 8 * size + x, 6 * size + x, 6 * size + x, 4 * size + x, 4 * size + x, 2 * size + x, 2 * size + x, 0 * size + x};
        npoints = xpoints.length;

        // gibt die Werte zum ausdrucken weiter
        p = new Polygon(xpoints,ypoints,npoints);

    }// END Tree(mit discount)

    /**
     * Methode, prueft die Position der Maus, beim Klick, ob diese, mit der Position des Baumes uebereinstimmt.
     * @param mousX um die X-Koordinaten der Maus zu ermitteln und vergleichen zu können
     * @param mousY um die Y-Koordinaten der Maus zu ermitteln und vergleichen zu können
     */
    public void chopDown(int mousX, int mousY) {
        if(p.intersects(mousX, mousY, 1, 1)) {
            //gefallene koordinaten
            xpoints = new int[]{0 * size + y , 2 * size + y, 2 * size + y, 4 * size + y, 4 * size + y, 6 * size + y, 6 * size + y, 8 * size + y, 8 * size + y, 6 * size + y, 6 * size + y, 4 * size + y, 4 * size + y, 2 * size + y, 2 * size + y, 0 * size + y};
            ypoints = new int[]{4 * size + x, 6 * size + x, 5 * size + x, 7 * size + x, 6 * size + x, 8 * size + x, 5 * size + x, 5 * size + x, 3 * size + x, 3 * size + x, 0 * size + x, 2 * size + x, 1 * size + x, 3 * size + x, 2 * size + x, 4 * size + x};
            p = new Polygon(xpoints, ypoints, npoints);
            choppedDown = true;
        }
    }// END chopDown()

    /**
     * Methode, dient dem grafischen "ausdrucken" der Baeume
     * @param g Graphik-Kontext, in dem jeder einzelne Baum gezeichnet wird
     */
    public void drawTree(Graphics g) {
        g.setColor(Color.white);
        g.fillPolygon(p);

        // prueft ob der Baum gefaellt wurde oder nicht und druck bei einem gefaellten Baum den Rabatt dazu
        if(choppedDown) {
            //discount anzeigen
            g.setColor(Color.BLACK);
            // gibt die Koordinaten der Maus in der Console aus
            System.out.println("X: " + x + ", Y: " + y);
            g.drawString(discount + "%",y + size * 3,x + size * 4);
        } else {
            //kein discount...
        }
    }// END drawTree()

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "size" ist.
     * @return size, um size außerhalb der Tree.class abfragen zu koennen.
     */
    public int getSizeTree() {
        return size;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "size" veraendern.
     * @param size -Wert um "size" von außerhalb der Tree.class aendern zu koennen
     */
    public void setSizeTree(int size) {
        this.size = size;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "x" ist.
     * @return gibt den Wert von "x" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getXTree() {
        return x;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "x" veraendern.
     * @param x -Wert um "x" von außerhalb der Tree.class aendern zu koennen
     */
    public void setXTree(int x) {
        this.x = x;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "y" ist.
     * @return gibt den Wert von "y" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getYTree() {
        return y;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "y" veraendern.
     * @param y -Wert um "y" von außerhalb der Tree.class aendern zu koennen
     */
    public void setYTree(int y) {
        this.y = y;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "discount" ist.
     * @return gibt den Wert von "discount" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "discount" veraendern.
     * @param discount -Wert um "discount" von außerhalb der Tree.class aendern zu koennen
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
