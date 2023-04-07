package bit.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {

    public void listProcess1(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("지현");
        list1.add("진근");
        list1.add("경민");
        list1.add("가영");

        Iterator<String> i = list1.iterator();  //노드의 구조에 상관없이 반복하는 패턴 = Iterator패턴
        
        
        
        
        System.out.println(list1.toString());
    }

    public static void main(String[] args) {
        ListEx2 list = new ListEx2();
        list.listProcess1();
    }
}
