package bit.basic.obj6_inner;

import javax.swing.*;

public class LocalOutter extends JPanel {

    private int value;
    private static final int DATA = 100;    //상수
    public class MemberInner{
        private int innerValue;
        public MemberInner(){
            System.out.println(DATA);
        }
    }
    public void method1(){
        int localValue= 10;
        final int FINALVALUE = 99;

        class LocalInner{
            public LocalInner(){
                //this.value = 10; //접근불가
                System.out.println(DATA);
                System.out.println(FINALVALUE); //상수는 접근이 가능하다
                System.out.println(localValue);


            }

            public void showLocal(){
                value = 10;
                //localValue = 100; 지역변수, 접근불가
            }
        }
        LocalInner in = new LocalInner();
        in.showLocal();
    }

    public static void main(String[] args) {
        LocalOutter local = new LocalOutter();
        local.method1();
    }
}
