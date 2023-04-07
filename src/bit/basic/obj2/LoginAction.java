package bit.basic.obj2;

public class LoginAction extends Action{
    private String path;
    private boolean redirect;

    public LoginAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    @Override
    public ActionForward excute() {
        System.out.println("LoginAction");
        return new ActionForward(path,redirect);
    }
}
