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

    private int x;
    private int y;
    private int size;
    private int discount;
    private boolean daytime;

    private Moon moon;

    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Tree tree5;

    private Star star1;
    private Star star2;
    private Star star3;
    private Star star4;
    private Star star5;
    private Star star6;
    private Star star7;
    private Star star8;

    /**
     * Initialisierung des Applets und setzen des MouseListerns
     * fuer die Verwendung von Maus-Ereignissen
     */
    public void init() {
        setSize(1300,1000);
        setBackground(new Color(0, 74, 71));

        this.tree1 = new Tree(100,400,1);
        this.tree2 = new Tree(200,300,5);
        this.tree3 = new Tree(400,600,3);
        this.tree4 = new Tree(600,100,6);
        this.tree5 = new Tree(800,200,8);

        this.star1 = new Star(100,100,1);
        this.star2 = new Star(200, 160,3);
        this.star3 = new Star(320, 210,2);
        this.star4 = new Star(400, 135,5);
        this.star5 = new Star(610, 155,6);
        this.star6 = new Star(670, 50,7);
        this.star7 = new Star(780, 180,2);
        this.star8 = new Star(900, 250,1);

        this.moon = new Moon(1000, 100, 100);

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
        g2d.drawArc(0,300,1300,300,10,100);
        //g2d.drawLine(0,300,1300,300);

        moon.drawMoon(g);

        tree1.drawTree(g);
        tree2.drawTree(g);
        tree3.drawTree(g);
        tree4.drawTree(g);
        tree5.drawTree(g);

        star1.drawStar(g);
        star2.drawStar(g);
        star3.drawStar(g);
        star4.drawStar(g);
        star5.drawStar(g);
        star6.drawStar(g);
        star7.drawStar(g);
        star8.drawStar(g);
    }

    /**
     * Aufloesung der x, y-Position, an der Mausbutton betaetigt wurde.
     * Umsetzung der Methode
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     * @param e Maus-Ereignis, das ausgeloest wurde
     */
    public void mouseClicked(MouseEvent e){
/*
        if (clickAufMoon) {
            setBackground(new Color(32, 32, 32));
            daytime = true;
        }*/
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
