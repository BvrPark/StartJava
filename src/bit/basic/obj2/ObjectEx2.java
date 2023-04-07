package bit.basic.obj2;

public class ObjectEx2 {
    private String message;

    private static ObjectEx2 instance;

    public static ObjectEx2 getInstance() {
        if (instance == null) {
            instance = new ObjectEx2();
        }
        return instance;

    }

    private ObjectEx2() {
        message = "hi";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
