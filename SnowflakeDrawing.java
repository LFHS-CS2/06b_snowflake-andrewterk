import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
class SnowflakeDrawing extends JPanel {

    private Graphics2D g2d;
    
    /**
     * Write a loop to create 6 line segments radiating from (x,y) of the given size.
     * After the loop is working, inside of it, recursively call drawStar() 
     * using the coordinates of the end of the line segment and one-third the size
     * to create a snow flake!
     * Don't forget that you need a base case.
     * 
     * g2d.drawLine(x1, y1, x2, y2) will draw a line from (x1, y1) to (x2, y2)
     */
    private void drawStar(int x, int y, int size)
    {

    }

    private void doDrawing(Graphics g) 
    {
        g2d = (Graphics2D) g;
        setBackground(Color.white);
        g2d.setColor(Color.blue );

        int width  = getSize().width;
        int height = getSize().height;
        int min;

        if ( height < width )
            min = height;
        else
            min = width;

        drawStar( width/2, height/2, min/4 );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
