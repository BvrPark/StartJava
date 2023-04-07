package bit.basic.collection;

import java.util.*;

public class ListEx3 {

    public static void main(String[] args) {
        ArrayList<String> list;
        LinkedList<String> linked;
//        Vector<String> vector;
//        Stack<String> stack;

        Queue<String> q = new LinkedList<String>();
        PriorityQueue<String> pq = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        System.out.println(stack.toString());

        int intArray[][] = new int [4][3];
        int [] intArray2[] = new int [4][3];
        int [][] intArray3 = new int [4][3];
        int [][] intArray5 = new int[][] {{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
        int [][] intArray6 = {{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
    }
}
