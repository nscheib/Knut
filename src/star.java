import java.awt.*;

private class star {
    int x = 10;
    int y = 10;

    public static void starMethode(int x, int y){

    }

    public static void drawStar(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawOval(1, 1, 100, 100);
        g2d.setColor(Color.YELLOW);
    }

}
