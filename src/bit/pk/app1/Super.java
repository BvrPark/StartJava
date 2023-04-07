package bit.pk.app1;

public class Super {
    public int publicData;          //다 접근이 가능
    protected int protectedData;    //다른 패키지에서도 접근이 가능
    int defaultData;                //같은 패키지내에서만 접근이 가능
    private int privateData;        //같은 클래스내에서만 접근이 가능
}
