import java.awt.*;


public class Moon {
    private int x;
    private int y;
    private int radius;
    private int mousX;
    private int mousY;
    private boolean daytime = true;

    /**
     *
     * @param x -Wert des Mondes
     * @param y -Wert des Mondes, auf das
     * @param radius des Mondes wird für alle Klassen zugänglich
     */
    public Moon(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     *
     * @param mousX
     * @param mousY
     */
    public void switchTime(int mousX, int mousY){
        if((mousX > x ) && (mousX < x + radius) && (mousY > y) && (mousY < y + radius )){
            if(daytime){
                daytime = false;
            }
            else {
                daytime = true;
            }
        }
    }// END switchTime()

    /**
     *
     * @param g
     */
    public void drawMoon(Graphics g){

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

    //get daytime
    public boolean getDayTime(){
        return daytime;
    }

    //set dayTime
    public void setDaytime(boolean daytime){
        this.daytime = daytime;
    }


}
