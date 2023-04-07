package bit.basic.obj6_inner;

//StaticInner
public class StaticOutter {
    private static int outterStaticValue;
    private int instanceOutterValue;

    public static class StaticInner{
        private int innerValue;
        public StaticInner(){

        }

        public void innerMethod(){
            int value;
        }
    }

    public static void main(String[] args) {
        StaticOutter.StaticInner inner = new StaticOutter.StaticInner();
    }
}
