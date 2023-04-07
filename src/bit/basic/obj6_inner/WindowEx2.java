package bit.basic.obj6_inner;

import javax.swing.*;

public class WindowEx2 extends JFrame {
    private int x;

    public WindowEx2(){
        new MouseAdapterEx(){

            @Override
            public void mouseClick() {
                x=100;
            }
        };
    }
}
