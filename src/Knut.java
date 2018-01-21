/** IMPORT */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/* END Import */

/**
 * Applet, fuer eine Knut-Rabattaktion. Die Baeume kann man faellen und zeigen im neuen Zustand den Rabatt an. Wenn man
 * auf die Sonne klickt, kann man die Tageszeit wechseln und die Umgebung veraendert sich, dabei erscheinen Sterne am Himmel.
 *
 * Aendert die Szene zwischen Tag und Nacht beim Mausklick auf den Mond
 * Aendert jeden einzelnen Baum, bei Mausklick auf diesen. Dadurch wird der Baum als gefaellt dargestellt und
 * gibt einen zufaelligen Rabatt aus.
 *
 * @author Christian Clausen
 * @author Nick Scheib
 *
 * @version v1.0
 */
public class Knut extends Applet implements MouseListener, MouseMotionListener {
    private static final long serialVersionUID = 1L;

    // private Variablen, nicht manipulierbar
    private int mousX;
    private int mousY;

    private Moon moon;
    private Tree tree1,tree2,tree3,tree4,tree5;
    private Star star1,star2,star3,star4,star5,star6,star7,star8;

    /**
     * Initialisierung des Applets und setzen des MouseListerns
     * fuer die Verwendung von Maus-Ereignissen
     */
    public void init() {

        this.tree1 = new Tree(400,100,30);
        this.tree2 = new Tree(300,400,15);
        this.tree3 = new Tree(500,500,35);
        this.tree4 = new Tree(290,750,20);
        this.tree5 = new Tree(270,1000,12);

        this.star1 = new Star(100,100,1);
        this.star2 = new Star(200, 160,3);
        this.star3 = new Star(320, 210,2);
        this.star4 = new Star(400, 135,5);
        this.star5 = new Star(610, 155,6);
        this.star6 = new Star(670, 50,7);
        this.star7 = new Star(780, 180,2);
        this.star8 = new Star(900, 250,1);

        this.moon = new Moon(1000, 100, 150);

        this.addMouseListener(this);
    }// END init()

    /**
     * Zeichnen des Mondes, der Baeume und der Sterne.
     * @see java.awt.Component#paint(java.awt.Graphics)
     * @param g Graphik-Kontext, auf dem die Elemente gezeichnet werden,
     * 			mit denen interagiert wird oder sich aenderen kann.
     */
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        background(g);

        moon.drawMoon(g);

        tree1.drawTree(g);
        tree2.drawTree(g);
        tree3.drawTree(g);
        tree4.drawTree(g);
        tree5.drawTree(g);

        if(!moon.getDayTime()) {
            star1.drawStar(g);
            star2.drawStar(g);
            star3.drawStar(g);
            star4.drawStar(g);
            star5.drawStar(g);
            star6.drawStar(g);
            star7.drawStar(g);
            star8.drawStar(g);
        }
    }// END paint()

    /**
     * Methode druckt den Hintergrund mit Himmel und Boden. Wechselt bei Tag und Nacht die Farben
     * @param g Graphik-Kontext, auf dem der fest definierte Hintergrund gezeichnet wird.
     */
    public void background(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        this.setSize(1300,800);
        if(!moon.getDayTime()) {
            // Oberer Teil des Hintergrundes
            g2d.setColor(new Color(0, 27, 24));
            g2d.fillRect(0, 0, 2000, 2000);
            //Unterer Teil des Hintergundes
            g2d.setColor(new Color(0, 0, 0));
            g2d.fillRect(0, 370, 50000, 5000);
            g2d.fillOval(700, 315, 900, 200);
        } else {
            // Oberer Teil des Hintergrundes
            g2d.setColor(new Color(169, 234, 238));
            g2d.fillRect(0, 0, 2000, 2000);
            //Unterer Teil des Hintergundes
            g2d.setColor(new Color(86, 122, 126));
            g2d.fillRect(0, 370, 50000, 5000);
            g2d.fillOval(700, 315, 900, 200);
        }
    }// END background()

    /**
     * Aufloesung der x, y-Position, an der Mausbutton betaetigt wurde.
     * Umsetzung der Methode
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     * @param e Maus-Ereignis, das ausgeloest wurde
     */
    public void mouseClicked(MouseEvent e) {
        mousX = e.getX(); // x-Koordinate, an der Mausereignis stattgefunden hat
        mousY = e.getY(); // y-Koordinate, an der Mausereignis stattgefunden hat

        // hier sollte dann der Maus-Event entsprechend verarbeitet werden
        moon.switchTime(mousX, mousY);
        tree1.chopDown(mousX, mousY);
        tree2.chopDown(mousX, mousY);
        tree3.chopDown(mousX, mousY);
        tree4.chopDown(mousX, mousY);
        tree5.chopDown(mousX, mousY);

        // nach jeder Veraenderung soll der Graphik-Kontext neu gezeichnet werden
        repaint();
    }// END mouseClicked()

    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    public void mouseEntered(MouseEvent e) {
        // diese Methode bleibt einfach leer
    }

    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    public void mouseExited(MouseEvent e) {
        // diese Methode bleibt einfach leer
    }

    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    public void mousePressed(MouseEvent e) {
        // diese Methode bleibt einfach leer
    }

    /** Faengt Mouse-Event ab, ohne ihn weiter zu verarbeiten
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    public void mouseReleased(MouseEvent e) {
        // diese Methode bleibt einfach leer
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}// END Knut.CLASS()
