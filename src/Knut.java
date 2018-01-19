/** IMPORT */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
/* END Import */

/**
 * Applet zum Anzeigen von Rabatten durch Tannenbaeume
 *
 * Bei ausgewählten Rabatt wird der Baum gefällt, es ist möglich zwischen Nacht und Tag zu wechseln
 * @author Nick Scheib
 * @version v0.1
 */
public class Knut extends Applet implements MouseListener, MouseMotionListener {
    private static final long serialVersionUID = 1L;

    static Star stars;
    static Moon moon;

    Random rand = new Random();
    final int x = rand.nextInt(1000);
    final int y = rand.nextInt(1000);
    final int size = rand.nextInt(8) + 2;


    /**
     * Initialisierung des Applets und setzen des MouseListerns
     * fuer die Verwendung von Maus-Ereignissen
     */
    public void init() {
        setSize(1200,800);
        setBackground(new Color(0, 74, 71));

        stars = new Star();
        moon = new Moon();

        this.addMouseListener(this);


    }

    /**
     * Zeichnen der Landschaft.
     *
     * Umsetzung der Methode
     * @see java.awt.Component#paint(java.awt.Graphics)
     * @param g Graphik-Kontext, auf dem die Landschaft gezeichnet wird
     */
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //horizontale Linie
        g2d.setColor(Color.white);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(0,300,1200,300);

        Tree.drawTree(g);
        Star.drawStar(g);
        Moon.drawMoon(g);
    }

    /**
     * Aufloesung der x, y-Position, an der Mausbutton betaetigt wurde.
     *
     * Umsetzung der Methode
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     *
     * @param e Maus-Ereignis, das ausgeloest wurde
     */
    public void mouseClicked(MouseEvent e){

        int x = e.getX(); // x-Koordinate, an der Mausereignis stattgefunden hat
        int y = e.getY(); // y-Koordinate, an der Mausereignis stattgefunden hat

        // hier sollte dann der Maus-Event entsprechend verarbeitet werden



        // nach jeder Veraenderung soll der Graphik-Kontext neu gezeichnet werden
        repaint();
    }

    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    public void mouseEntered(MouseEvent e){
        // diese Methode bleibt einfach leer
    }

    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    public void mouseExited(MouseEvent e){
        // diese Methode bleibt einfach leer
    }


    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    public void mousePressed(MouseEvent e){
        // diese Methode bleibt einfach leer
    }

    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    public void mouseReleased(MouseEvent e){
        // diese Methode bleibt einfach leer
    }




    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
