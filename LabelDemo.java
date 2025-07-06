 // Fig 9.13: LabelDemo.java
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {
    public static void main(String[] args) {
        // Label with plain text
        JLabel northLabel = new JLabel("North");

        // Icon from image file (make sure "GUItip.gif" is in your project directory)
        ImageIcon labelIcon = new ImageIcon("src\\bear-eating-ice-cream-k9at8cc3lq3ucxk1.gif");

        // Center label with image only
        JLabel centerLabel = new JLabel(labelIcon);

        // South label with image and text
        JLabel southLabel = new JLabel(labelIcon);
        southLabel.setText("South");

        // Frame setup
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setLayout(new BorderLayout());

        // Add labels to specific regions
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        application.setSize(300, 300); 
        application.setVisible(true);
    }
}

