package bit.basic.obj3;

import java.util.Arrays;
import java.util.Comparator;

public abstract class AbstractSubSubClass extends AbstractSuperClass{

    public static void main(String[] args) {
        AbstractSuperClass test = new AbstractSubSubClass() {
            @Override
            public void abstractMethodSP() {

            }
        };


    }

}
