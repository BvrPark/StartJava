package bit.basic.obj2;

public class ActionFactory {//공장

    private static ActionFactory actionFactory;

    public static ActionFactory getInstance(){
        if(actionFactory==null){
            actionFactory = new ActionFactory();
        }
        return actionFactory;
    }

    public Action getAction(String command){
        if(command.equals("Login")){
            return new LoginAction("LoginView",true);   //Action action = new LoginAction();
        }
        if (command.equals("List")) {
            return new ListAction("ListView", true);    //Action action = new ListAction();
        }
        return null;
    }
}
