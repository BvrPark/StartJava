package bit.app.exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

//RUNTIME | COMPILE
public class ExceptionEx1 {


    public void arithmeticException() {
//        System.out.println((int)(Math.random()*50));
//        Random random = new Random();
//        int rs = random.nextInt(5);
//        System.out.println(rs);
//        System.out.println(random.nextBoolean());
        int[] m = new int[5];
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) Math.random() * 100;
            int rs = 100 / m[i];
        }

    }

    //[STONE] x=150 y=300
    public void numberFormatException(String message) {
        if (message.startsWith("[STONE]")) {
            int x = Integer.parseInt(message.substring(message.indexOf("x")).split(" ")[0].split("=")[1]);
            System.out.println(x);
        }
        if (message.startsWith("[ROOM]")) {
            System.out.println("ROOM ...");
        }

    }

    public void nullPointerException(int x, int y, int z) {
        String str = null;
        if((x+y+z)>=5 && (x+y+z)<=10){
            str = "Java";
        }
        System.out.println(Integer.parseInt(str));
        System.out.println(str.substring(0));

    }

    public void arrayIndexOutOfBoundsException() {
        int[] m = new int[5];
        for (int i = 0; i <= m.length; i++) {

            try {
                System.out.println("TryStartLine");
                m[i] = 100;
                System.out.println("Data = " + m[i]);
                System.out.println("TryEndLine");
            } catch (ArrayIndexOutOfBoundsException e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            } finally {
                System.out.println("finally");
            }
        }
    }

    public void stringIndexOutOfBoundsException(String value){
        System.out.println(value.substring(1,4));
        System.out.println(value.substring(3,4));
    }

    public void cloneNotSupportException(){
        ElementClass et = new ElementClass(100, "class");
        System.out.println(et);

    }

    public void noSuchElementException(){
        ArrayList<Integer> list1 = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(70);
        System.out.println("list1 = " + list1);
        System.out.println("hs = " + hs);

        Iterator<Integer> i = list1.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        for(;i.hasNext();){
//            System.out.println(i.next());
//        }
//        for(Integer e : list1){
//            System.out.println(e);
//        }

        Iterator<Integer> itor = hs.iterator();

        while(itor.hasNext()){
            System.out.println(itor.next());
        }
    }

    public static void main(String[] args) {
        ExceptionEx1 e = new ExceptionEx1();
//        e.numberFormatException("[STONE] x=150 y=300");
//        e.numberFormatException("[ROOM]안녕하세요.");
//        e.nullPointerException(5,2,15);
//        e.stringIndexOutOfBoundsException("abcd");
//        e.cloneNotSupportException();
        e.noSuchElementException();
    }
}
