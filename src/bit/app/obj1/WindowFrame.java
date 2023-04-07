package bit.app.obj1;

import java.awt.*;
import java.awt.event.*;

public class WindowFrame extends Frame{

    public WindowFrame(){

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }
        });

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                WindowFrame.this.dispose();
            }

        });

        this.addMouseListener(new MouseAdaptor() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
            }

        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
            }
        });
        this.setBounds(500,100,700,700);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        WindowFrame w = new WindowFrame();
    }


}
