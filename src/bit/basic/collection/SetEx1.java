package bit.basic.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {

    public void setProcess1() {
        String[] lesson = {"Java", "DataBase", "Servlet", "Spring", "Css", "Java", "Css"};
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (int i = 0; i < lesson.length; i++) {
            if (!set1.add(lesson[i])) {
                set2.add(lesson[i]);
            }
        }

        for (String item : set1){
            System.out.println(item);
        }

        Iterator<String> i = set1.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        HashSet<String> set3 = (HashSet<String>)set2.clone();
//        set3.clear();
        System.out.println(set1);
        System.out.println(set1.contains(new String("Java")));
        System.out.println(set1.remove("Java"));
        System.out.println(set1);
    }


    public static void main(String[] args) {
        SetEx1 s = new SetEx1();
        s.setProcess1();
    }
}
