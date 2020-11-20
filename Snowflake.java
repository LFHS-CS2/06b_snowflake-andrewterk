import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Snowflake extends JFrame {

    public Snowflake() {
        initUI();
    }

    private void initUI() {

        add(new SnowflakeDrawing());

        setTitle("Snow Flake Recursion");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Snowflake ex = new Snowflake();
                    ex.setVisible(true);
                }
            });
    }
}
