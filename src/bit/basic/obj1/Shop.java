package bit.basic.obj1;

public class Shop {

    private String name;
    private String locate;
    private int number;
    private String category;

    public Shop(){

    }
    public Shop(String name) {
        this.name = name;
    }

    public Shop(String name, String locate) {
        this.name = name;
        this.locate = locate;
    }

    public Shop(String name, String locate, int number) {
        this.name = name;
        this.locate = locate;
        this.number = number;
    }

    public Shop(String name, String locate, int number, String category) {
        this.name = name;
        this.locate = locate;
        this.number = number;
        this.category = category;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
    }
}
