package bit.app.exception;
public class Process implements ProcessInter{

    @Override
    public void fileCheck(){
        System.out.println("fileCheck");
    }

    @Override
    public void reSize(){
        System.out.println("reSize");

    }

    @Override
    public void sendData(){
        System.out.println("sendData");
    }

}






