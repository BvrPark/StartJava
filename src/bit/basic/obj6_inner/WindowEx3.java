package bit.basic.obj6_inner;

import javax.swing.*;
import java.util.ArrayList;

public class WindowEx3 extends JFrame {

    private ArrayList<String> list = new ArrayList<String>(){

        @Override
        public String toString() {
            return "this ToString";
        }
    };


    public void actionString(){
//        System.out.println(this.toString());
        System.out.println(list.toString());
    }

//    @Override
//    public String toString() {
//        return "this ToString";
//    }

    public static void main(String[] args) {
        WindowEx3 w = new WindowEx3();
        w.actionString();
    }

}
