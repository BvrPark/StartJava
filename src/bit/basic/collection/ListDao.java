package bit.basic.collection;

import java.io.Serializable;
import java.util.*;
import java.util.List;

public class ListDao {
    private static ArrayList<BoardBean> list = new ArrayList<>();
    private static ListDao dao;
    public static ListDao getDao(){
        if(dao == null){
            dao = new ListDao();
        }
        return dao;
    }

    public int getidNumIndex(int idNum){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNo() == idNum){
                return i;
            }
        }
        return - 1;
    }

    public boolean clear(int idx){
        if(idx > -1){
            list.remove(idx);
            System.out.println("삭제가 완료되었습니다.");
            return true;
        }else{
            System.out.println("해당 인덱스를 찾을 수 없습니다.");
            return false;
        }
    }

    public BoardBean getIndexBean(int index){
        return list.get(index);
    }

    public void listInsert(BoardBean bean){
        list.add(bean);
        System.out.println("Insert Success!");
    }

    public List<BoardBean> getList(){
        return list;
    }

    public boolean noCheck(int no){
        if(list.isEmpty()){
            return true;
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNo()==no){
                return false;
            }
        }
        return true;
    }


}
