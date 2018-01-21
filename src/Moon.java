/** IMPORT */
import java.awt.*;
/* END Import */


/**
 * Class Moon ist zuständig um den Mond zu zeichnen und breitet den Tag und Nacht
 * wechsel beim klicken mit der Maus, auf den Baum vor.
 *
 * @author Christian Clausen
 * @author Nick Scheib
 *
 * @version v1.0
 */
public class Moon {
    //private Variablen, nicht manipulierbar
    private int x;
    private int y;
    private int radius;
    private int mousX;
    private int mousY;
    private boolean daytime = true;

    /**
     * Methode Moon übergibt die Parametern aus der Knut.class an die Moon.class
     * @param x -Wert des Moons fuer die Positionierung, weißt einen Wert zu
     * @param y -Wert des Moons fuer die Positionierung, weißt einen Wert zu
     * @param radius des Mondes wird fuer alle Klassen zugaenglich, weißt einen Wert zu
     */
    public Moon(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Methode, vergleicht die Position der Maus bei einem Klick und prüft ob an selber der Moon positioniert ist
     * @param mousX um die X-Koordinaten der Maus zu ermitteln und vergleichen zu können
     * @param mousY um die Y-Koordinaten der Maus zu ermitteln und vergleichen zu können
     */
    public void switchTime(int mousX, int mousY) {
        if((mousX > x ) && (mousX < x + radius) && (mousY > y) && (mousY < y + radius )) {
            if(daytime) {
                daytime = false;
            } else {
                daytime = true;
            }
        }
    }// END switchTime()

    /**
     * Methode, dient dem grafischen "ausdrucken" des Moons
     * @param g Graphik-Kontext, in dem der Mond gezeichnet wird
     */
    public void drawMoon(Graphics g) {

        if(daytime) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setStroke(new BasicStroke(3));
            g2d.setColor(Color.WHITE);
            g2d.drawOval(x, y, radius, radius);
        } else {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setStroke(new BasicStroke(3));
            g2d.setColor(Color.white);
            g2d.fillOval(x, y, radius, radius);
        }
    }// END drawMoon()

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, ob die Variable "daytime" true oder false ist.
     * @return daytime, um daytime außerhalb der Moon.class abfragen zu können.
     */
    public boolean getDayTime() {
        return daytime;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "daytime" verändern.
     * @param daytime, um daytime von außerhalb der Moon.class ändern zu können
     */
    public void setDaytime(boolean daytime) {
        this.daytime = daytime;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "y" ist.
     * @return gibt den Wert von "y" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getYMoon() {
        return y;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "y" veraendern.
     * @param y -Wert um "y" von außerhalb der Moon.class aendern zu koennen
     */
    public void setYMoon(int y) {
        this.y = y;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "x" ist.
     * @return gibt den Wert von "x" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getXMoon() {
        return x;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "x" veraendern.
     * @param x -Wert um "x" von außerhalb der Moon.class aendern zu koennen
     */
    public void setXMoon(int x) {
        this.x = x;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse abfragen, wie der Wert der Variable "radius" ist.
     * @return gibt den Wert von "radius" weiter, um diesen wo anderes auslesen zu koennen
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Mit dieser Methode kann man in einer anderen Klasse, die Variable "radius" veraendern.
     * @param radius -Wert um "radius" von außerhalb der Moon.class aendern zu koennen
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
