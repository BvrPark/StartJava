package bit.basic.obj1;

//다형성

import java.io.*;
import java.util.*;

public class ObjectEx4 {

    public InputStream getBufferInput()throws Exception{
        return new FileInputStream(new File(""));
    }

    public List getList(){
        return new Stack();
    }
    public void methodObj1(){
        System.out.println("Data : ");

        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(br.readLine());
        }catch (Exception e){
            // TODO: handle exception
        }
    }

    public void methodObj2(Object value){
        ((Double)value).doubleValue();
    }

    public void methodObj2(double value){

    }


    public static void main(String[] args) {
        ObjectEx4 o = new ObjectEx4();
        o.methodObj1();
        o.methodObj2("2");
    }
}
