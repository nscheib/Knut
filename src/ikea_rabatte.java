/** IMPORT */
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/* END Import */

/**
 * Applet zum Anzeigen von Rabatten durch Tannenbaeume
 *
 * Bei ausgewählten Rabatt wird der Baum gefällt, es ist möglich zwischen Nacht und Tag zu wechseln
 * @author Nick Scheib
 * @version v0.1
 */
public class ikea_rabatte extends Applet implements MouseListener, MouseMotionListener {

    private static final long serialVersionUID = 1L;

    /**
     * Initialisierung des Applets und setzen des MouseListerns
     * fuer die Verwendung von Maus-Ereignissen
     */
    public void init(){

		/* registriert Applet als MouseListener, so dass die jeweilige spezialisierte
		 * Methoden aufgerufen wird, wenn ein Mausereignis innerhalb des Applets ausgeloest
		 * wird
		 */
        this.addMouseListener(this);

        // Initialisiere Baeme, Mond und Sterne ...



    }

    /**
     * Zeichnen der Landschaft.
     *
     * Umsetzung der Methode
     * @see java.awt.Component#paint(java.awt.Graphics)
     *
     * @param g Graphik-Kontext, auf dem die Landschaft gezeichnet wird
     */
    public void paint(Graphics g){
        trees.drawTree(g);
        star.drawStar(g);
        moon.drawMoon(g);
        //hier wird alles gezeichnet

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
        int x, y;

        x = e.getX(); // x-Koordinate, an der Mausereignis stattgefunden hat
        y = e.getY(); // y-Koordinate, an der Mausereignis stattgefunden hat

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
