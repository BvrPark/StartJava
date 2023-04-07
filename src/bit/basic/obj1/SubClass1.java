package bit.basic.obj1;

public class SubClass1 extends SuperClass{

    private int subClass1Value;

    public SubClass1(){

    }

    public SubClass1(int superClassValue, int subClass1Value){
        super(superClassValue);
        this.subClass1Value=subClass1Value;
    }

    @Override
    public void actionProcess() {
        System.out.println("SubClass1 actionProcess");
    }

    public void sub1Action(){
        System.out.println("sub1Action");
    }

    @Override
    public String toString() {
        return super.toString() + "SubClass1{" +
                "subClass1Value=" + subClass1Value +
                '}';
    }
}
