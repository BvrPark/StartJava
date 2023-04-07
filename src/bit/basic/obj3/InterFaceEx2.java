package bit.basic.obj3;

//interface 속성(final) + 기능
public interface InterFaceEx2{

    public void InterFaceEx2Method();
    public default void showDefaultMethod(){
        System.out.println("디폴트");
    }
}
