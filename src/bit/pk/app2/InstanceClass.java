package bit.pk.app2;

import bit.pk.app1.Super;

import java.io.BufferedOutputStream;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
// import java.util.*;

public class InstanceClass {

    public InstanceClass(){//package가 다른 일반 영역
        Super s = new Super();
        s.publicData = 10;
        ArrayList list = new ArrayList();
        Vector<String> v = new Vector<>();
        Stack<String> st = new Stack<>();
        BufferedOutputStream bs;
    }
}
