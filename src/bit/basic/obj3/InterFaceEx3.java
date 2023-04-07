package bit.basic.obj3;
//인터페이스는 다중상속이 가능
public interface InterFaceEx3 extends InterfaceEx1, InterFaceEx2{
    @Override
    default void InterFaceEx2Method() {

    }

    void InterSuper();
}
