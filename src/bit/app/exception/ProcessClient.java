package bit.app.exception;

public class ProcessClient {
    ProcessInter p;

    public void action1(){
        p.fileCheck();
        System.out.println("action");
    }

    public void action2(){
        p.fileCheck();
    }

    public void action3(){
        p.fileCheck();
    }

    public static void main(String[] args) {
        ProcessClient p = new ProcessClient();
        p.action1();
    }
}
