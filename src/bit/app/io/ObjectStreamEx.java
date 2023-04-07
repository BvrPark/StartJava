package bit.app.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamEx {

    private final String PATH = "d:\\test.txt";

    public void writeMember() {
        List<Member> list = new ArrayList<>();
        try (ObjectOutputStream oos = new ObjectOutputStream(new PrintStream(new File(PATH)))) {
            list.add(new Member("BLACK", "red", 189.9));
            list.add(new Member("BLACK2", "red2", 1235));
            list.add(new Member("BLACK3", "red3", 156));
            oos.writeObject(list);
            System.out.println("Write Object Success");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void readMember() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(PATH)))) {
            System.out.println(ois.readObject());
            List<Member> list = (List<Member>) ois.readObject();
            for (Member member : list) {
                System.out.println(member);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ObjectStreamEx o = new ObjectStreamEx();
        o.readMember();
//        o.writeMember();


    }
}
