package bit.basic.collection;

import java.util.*;
import java.util.Map.Entry;

public class MapEx1 {

    public void mapProcess(){
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1, "딸기");
        map1.put(2, "수박");
        map1.put(3, "레몬");
        map1.put(4, "멜론");

//        Iterator<Integer> it = map1.keySet().iterator();
//
//        while (it.hasNext()) {
//            Integer key = it.next();
//            System.out.println("key : " + key+ " value : "+map1.get(key));
//        }

        Iterator<Entry<Integer, String>> iterator = map1.entrySet().iterator();
        for(;iterator.hasNext();){
            Entry<Integer, String> entry = iterator.next();
        }
    }

    public void mapProcess2(){
        HashMap<String, Object> m1 = new HashMap<>();
        m1.put("empno","7612");
        m1.put("name", "윤재웅");
        m1.put("sal", "7000");

        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("empno","7613");
        m2.put("name", "이도경");
        m2.put("sal", "7000");
        Vector<HashMap<String,Object>> vector = new Vector<>();
        vector.add(m1);
        vector.add(m2);

        Iterator<HashMap<String, Object>> vi = vector.iterator();
        while (vi.hasNext()) {
            HashMap<String, Object> node = vi.next();
            Iterator<Entry<String, Object>> ior = node.entrySet().iterator();
            for(;ior.hasNext();){
                Entry<String, Object> entry = ior.next();
                System.out.println(entry.getKey()+ " "+entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        MapEx1 m = new MapEx1();
        m.mapProcess();
        m.mapProcess2();

    }
}
