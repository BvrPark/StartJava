package bit.basic.obj1;

public class SuperClass extends Object {

    private int superClassValue;

    public SuperClass(int superClassValue){
        this.superClassValue = superClassValue;
    }

    public SuperClass(){
        super();
    }

    public void actionProcess(){
        System.out.println("actionProcess");
    }

    public void sub3Action(){
        System.out.println("sub1Action");
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "superClassValue=" + superClassValue +
                '}';
    }
}
