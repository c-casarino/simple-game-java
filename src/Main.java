import javax.swing.JFrame;

void main() {
    JFrame window = new JFrame("Simple Window");
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
}