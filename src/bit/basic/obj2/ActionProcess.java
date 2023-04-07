package bit.basic.obj2;

import java.util.*;

public class ActionProcess {    //Controller(Mapper)
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        String command = "";

        while (true) {
            System.out.println("1.Login 2.List 3.Delete 4.Modify 5.Exit");

            switch (scanner.nextInt()) {
                case 1:
                    command = "Login";
                    break;
                case 2:
                    command = "List";
                    break;
                case 3:
                    command = "Delete";
                    break;
                case 4:
                    command = "Modify";
                    break;
                case 5:
                    return;
            }
            Action action = ActionFactory.getInstance().getAction(command);
            ActionForward af = action.excute();//비지니스 로직 수행
            if(af.isRedirect()){
                System.out.println(af.getPath()+"직접이동");
            }else {
                System.out.println(af.getPath()+"간접이동");
            }
        }


    }

    public static void main(String[] args) {
        new ActionProcess().menu();
    }
}
