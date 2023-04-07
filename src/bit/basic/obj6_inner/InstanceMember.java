package bit.basic.obj6_inner;

public class InstanceMember extends SuperInstanceMember{

    private int x;
    public InstanceMember(){
//        this.superValidate();
    }

    private void outterMemberMethod(){
        System.out.println("x = " + x);
    }

    //Inner클래스
    public class Inner{
        private int x;
        public Inner(){
            InstanceMember.this.x = 100;
            this.x = 100;
            outterMemberMethod();
            superValidate();
        }
    }

    public static void main(String[] args) {
        InstanceMember.Inner inner = new InstanceMember().new Inner();
    }
}
