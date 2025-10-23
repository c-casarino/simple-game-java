import javax.swing.JFrame;

void main() {
    JFrame window = new JFrame("Simple Window");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(800, 600);
    window.setResizable(false);
    window.setLocationRelativeTo(null);
    window.setVisible(true);

    window.add(new GamePanel());
    window.pack();


}