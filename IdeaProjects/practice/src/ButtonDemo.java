import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
    JLabel jlab;

    ButtonDemo(){
        JFrame jfrm = new JFrame("A Button Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);
        jlab = new JLabel("Press a button");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed up.");
        else
            jlab.setText("You pressed down");
    }
    public static void main(String[]args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
