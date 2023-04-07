package bit.basic.obj6_inner;

//MemberInner, StaticInner, LocalInner, Anonymous
//외부에서는 내부로 접근이 불가

import javax.swing.*;

public class OutterClass extends JFrame {

    private int outterValue;
    private int x;

    public OutterClass() {
        System.out.println("OutterClass()");
        System.out.println("x = " + x);
        this.setBounds(100, 200, 200, 600);
    }

    private void outterMethod() {
        System.out.println("outterMethod");
        System.out.println("outter x = " + x);
    }

    //Inner 클래스 - 접근제한자에 상관없이 접근할 수 있는 것, friend의 개념, 외부의 선조도 접근가능
    //MemberInner
    public class Inner {
        private int innerValue;
        private int x;

        public Inner() {
            System.out.println("Inner()");
            setBounds(100, 200, 200, 600);

        }

        //내부클래스 안에서 외부클래스의 메서드,변수 사용가능
        //따로 객체 생성을 하면서 외부클래스의 요소들은 사용물가
        public void innerMethod() {
            outterValue = 100;
            OutterClass.this.x = 100;
            outterMethod();
        }
    }

    public static void main(String[] args) {
        OutterClass out = new OutterClass();
        Inner inner = out.new Inner();
        inner.innerMethod();

    }

}//여기까지 Member 영역

