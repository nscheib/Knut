/** IMPORT */
import java.awt.*;
/* END Import */

/**
 * Class Star ist zuständig um die Sterne zu zeichnen, wenn der Mond bei Tag geklickt wurde.
 *
 * @author Christian Clausen
 * @author Nick Scheib
 *
 * @version v1.0
 */
public class Star {
    //private Variablen, nicht manipulierbar
    private int x;
    private int y;
    private int size;

    /**
     * Methode Star uebergibt die Parametern aus der Knut.class an die Star.class
     * @param x -Wert des der einzelnen Sterne fuer die Positionierung, weißt einen Wert zu
     * @param y -Wert des der einzelnen Sterne fuer die Positionierung, weißt einen Wert zu
     * @param size -Wert der Sterne zum veraendern der groeße, weißt einen Wert zu
     */
    public Star(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }// END Star()

    /**
     * Methode, dient dem grafischen "ausdrucken" der Stars
     * @param g Graphik-Kontext, in dem jeder einzelne Star gezeichnet wird
     */
    public void drawStar(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int xpoints[] = {0*size+x, 3*size+x, 2*size+x, 5*size+x, 8*size+x, 7*size+x, 10*size+x, 6*size+x, 5*size+x, 4*size+x, 0*size+x};
        int ypoints[] = {4*size+y, 6*size+y, 10*size+y, 7*size+y, 10*size+y, 6*size+y, 4*size+y, 4*size+y, 0*size+y, 4*size+y, 4*size+y};
        int npoints = xpoints.length;

        Polygon p = new Polygon(xpoints, ypoints, npoints);
        g2d.setColor(new Color(191, 174, 0));
        g2d.setStroke(new BasicStroke(3));
        g2d.fillPolygon(p);
    }// END drawStar()

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "size" ist.
     * @return size, um size außerhalb der Star.class abfragen zu koennen.
     */
    public int getSizeStar() {
        return size;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "size" veraendern.
     * @param size -Wert um "size" von außerhalb der Star.class aendern zu koennen
     */
    public void setSizeStar(int size) {
        this.size = size;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "y" ist.
     * @return gibt den Wert von "y" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getYStar() {
        return y;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "y" veraendern.
     * @param y -Wert um "y" von außerhalb der Star.class aendern zu koennen
     */
    public void setYStar(int y) {
        this.y = y;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "x" ist.
     * @return gibt den Wert von "x" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getXStar() {
        return x;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "x" veraendern.
     * @param x -Wert um "x" von außerhalb der Star.class aendern zu koennen
     */
    public void setXStar(int x) {
        this.x = x;
    }
}
