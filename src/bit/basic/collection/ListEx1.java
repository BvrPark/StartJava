package bit.basic.collection;

import bit.app.io.Member;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Iterator;
import java.util.*;
import java.io.*;
public class ListEx1 implements Serializable{

    private Scanner scanner = new Scanner(System.in);

    public void add() {
        BoardBean bean = new BoardBean();

        int no = 0;
        do {
            System.out.print("No : ");
            no = scanner.nextInt();
        } while (!ListDao.getDao().noCheck(no));
        bean.setNo(no);    //중복검사
        System.out.print("title : ");
        bean.setTitle(scanner.next());
        System.out.print("writer : ");
        bean.setWriter(scanner.next());
        System.out.print("contents : ");
        bean.setContents(scanner.next());
        System.out.print("password : ");
        bean.setPassword(scanner.next());
        Calendar c = Calendar.getInstance();
        String regdate = String.valueOf(c.get(Calendar.YEAR)).concat(String.valueOf(c.get(Calendar.MONTH) + 1)).
                concat(String.valueOf(c.get(Calendar.DATE)));
        bean.setRegdate(regdate);


        System.out.println(bean);
        ListDao.getDao().listInsert(bean);

        save();
    }

    //리스트 조회
    public void list() {
        Iterator<BoardBean> iter = ListDao.getDao().getList().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    //검색
    public int search() {
        System.out.print("IdNumber : ");
        int idNum = scanner.nextInt();
        if (ListDao.getDao().getidNumIndex(idNum) > -1) {
            return ListDao.getDao().getidNumIndex(idNum);
        } else {
            return -1;
        }
    }

    //정보
    public void info() {
        int idx = search();
        if (idx > -1) {
            System.out.println(ListDao.getDao().getIndexBean(idx));
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }

    //수정하기
    public void modify() {
        if (ListDao.getDao().clear(search())) {
            add();
        }
        save();
    }

    //삭제하기
    public void delete() {
        ListDao.getDao().clear(search());
    }

    //파일 읽기
    public void readFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof List) {
                    List<String> list = (List<String>) obj;
                    for (String str : list) {
                        System.out.println(str);
                    }
                }
            }
        } catch (EOFException e) {
            // 파일의 끝에 도달했을 때 처리할 로직을 작성
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //파일 쓰기
    public void writeFile(String filePath) {
        ArrayList<String> list = new ArrayList<>();
        Iterator<BoardBean> iter = ListDao.getDao().getList().iterator();
        try (ObjectOutputStream oos = new ObjectOutputStream(new PrintStream(filePath))) {
            while (iter.hasNext()) {
                list.add(iter.next().toString());
            }
            oos.writeObject(list);
            System.out.println("Write Object Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //파일 저장
    public void save() {
        writeFile("D:\\test.txt");
    }

    //파일 읽기
    public void open() {
        readFile("D:\\test.txt");
    }

    public void menu() {
        while (true) {
            System.out.println("1. Add 2.List 3.Info 4.Modify 5.Delete 6.Save 7.Open");
            switch (scanner.nextInt()) {
                case 1:
                    add();
                    save();
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    info();
                    break;
                case 4:
                    modify();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    save();
                    break;
                case 7:
                    open();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ListEx1 ex = new ListEx1();
        ex.menu();
    }

}
