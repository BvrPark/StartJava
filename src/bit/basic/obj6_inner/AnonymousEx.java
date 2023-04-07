package bit.basic.obj6_inner;
//AnonyMous***
public class AnonymousEx {
    
    private int x,y;
    private AbleInterFace i = new AbleInterFace() {
        @Override
        public void fileCheck() {
            System.out.println("instance fileCheck");
        }

        @Override
        public void fileOpen() {

        }

        @Override
        public void validate() {

        }
    };
    public void anonymousMethod1(){

        //Anonymous Class
        new AbleInterFace(){
            int yy;

            @Override
            public void fileCheck() {
                System.out.println("fileCheck");
                //익명클래스라서 this가 안됨
            }

            @Override
            public void fileOpen() {

            }

            @Override
            public void validate() {

            }
        };
    }

    public static void main(String[] args) {
        AnonymousEx a = new AnonymousEx();


    }

}
