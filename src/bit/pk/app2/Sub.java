package bit.pk.app2;

import bit.pk.app1.Super;

public class Sub extends Super {
    public Sub(){   //package가 다른 후손영역
        this.publicData = 10;
        this.protectedData = 10;
    }
    
}
