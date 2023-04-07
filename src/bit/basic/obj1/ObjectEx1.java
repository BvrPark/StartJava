package bit.basic.obj1;

//묶음(데이터 + 기능)
public class ObjectEx1{

    public ObjectEx1(){
        System.out.println("뭘 해야 하나?");
    }

    public static void main(String[] args) {
        String str = new String("수박");  //궁극적인 목적 => instance변수 초기화, 자동호출

        ObjectEx1 ex = new ObjectEx1();


        int arr = 1;

        String tmp1 = "562";
        int tmp = Integer.parseInt(tmp1);
        System.out.println(Integer.toString(tmp)==(tmp1));

        ++arr;
        System.out.println(tmp);

        String str2;
        str2 = str;
        str += "흙";
        System.out.println(str2);


    }

}
