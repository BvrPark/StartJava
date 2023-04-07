package bit.basic.obj1;

public class SuperMain {

    public static void main(String[] args) {
//        SuperClass sp = new SuperClass();
//        SubClass1 sc1 = new SubClass1();    //SubClass1(    SuoerClass( Object()    )   )
//        SubClass2 sc2 = new SubClass2();
//        SuperClass sp1 = new SubClass2();   //SubClass2(    SuperClass( Object()    )   )
//        sp.actionProcess();
//        sc2.actionProcess();

//        SubClass1 s1 = new SubClass1(10,20);
//        System.out.println(s1);
//
//        String str1 = "abc";
//        String str2 = new String("abc");
//        System.out.println(str1.hashCode() == str2.hashCode());


        SuperClass s = new SubClass1();
        s.actionProcess();

    }
}
