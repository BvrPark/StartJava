package bit.basic.obj2;

public class ObjectEx1 {
    private static final int cnt;

    static {
        cnt =90;
    }

//    public ObjectEx1(){
//        cnt = 90;
//    }

    public static void main(String[] args) {
        System.out.println(ObjectEx1.cnt);
        System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
//        ObjectEx1 o2 = new ObjectEx1();  //create cnt 90
//        ObjectEx1 o1 = new ObjectEx1();  //create cnt 90
//        ObjectEx1 o3 = new ObjectEx1();  //create cnt 90

    }
}
