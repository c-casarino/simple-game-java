import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
    final int SIZE_WIDTH = 800;
    final int SIZE_HEIGHT = 600;

    public GamePanel() {
        this.setPreferredSize(new Dimension(SIZE_WIDTH, SIZE_HEIGHT));
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawString("Game Over", 50, 50);
        g.dispose();
    }

}