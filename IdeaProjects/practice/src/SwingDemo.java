import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    SwingDemo() {
        JFrame jfrm = new JFrame("A Simple Swing Application");
        jfrm.setSize(275,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel(" GUI programming with Swing.");
        jfrm.add(jlab, BorderLayout.NORTH);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }

}
