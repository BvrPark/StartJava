package bit.app.exception;

public class ElementClass implements Cloneable {
    private int count;
    private String msg;

    public ElementClass(){

    }

    public ElementClass(int count, String msg) {
        this.count = count;
        this.msg = msg;
    }

    public void method(){
        ElementClass et = new ElementClass(100,"class");
        System.out.println(et);
        try {
            et.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ElementClass{" +
                "count=" + count +
                ", msg='" + msg + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ElementClass e = new ElementClass();
        e.method();
    }
}
