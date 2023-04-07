package bit.basic.obj1;

public class Member {

    public String name;
    public String id;
    private String email;
    private int countValue;

    public Member() {
        super();
    }
    public Member(String name, String id, String email, int countValue) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.countValue = countValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCountValue() {
        return countValue;
    }

    public void setCountValue(int countValue) {
        this.countValue = countValue;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", countValue=" + countValue +
                '}';
    }
}
