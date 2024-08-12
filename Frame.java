import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame {
    private static final String TITLE = "cUnits 3D Physics Engine";
    private static final String VERSION = "1.0.0";
    private static final int HEIGHT = 800;
    private static final int WIDTH = 900;

    public Frame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(TITLE + " " + VERSION);
        frame.setResizable(false);
        frame.setSize(new Dimension(WIDTH,HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(0,0,0));

        App app = new App();
        app.startApplication();
    }
}
