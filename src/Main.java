import javax.swing.JFrame;

void main() {
    JFrame window = new JFrame("Moving Test");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setLocationRelativeTo(null);
    window.setVisible(true);

    GamePanel gamePanel = new GamePanel();

    window.add(gamePanel);
    window.pack();

    gamePanel.startGameThread();
}