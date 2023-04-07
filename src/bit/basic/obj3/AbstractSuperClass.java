package bit.basic.obj3;

//추상클래스는 final을 쓰면 확장이 불가능하므로 추상클래스의 목적인 확장에서 벗어나서 쓰면 안됨
public abstract class AbstractSuperClass {

    public AbstractSuperClass(){

    }
    public void abstractSuperMethod(){
        System.out.println("abstractSuperMethod");
    }

    public abstract void abstractMethodSP(); //미완성
}
