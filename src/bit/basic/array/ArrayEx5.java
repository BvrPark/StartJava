package bit.basic.array;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

//최댓값, 최솟값, 근삿값, 편차, 최빈값, 합계, 평균, 개수, 평균이상 개수, 평균이하 개수
public class ArrayEx5 {

    private int[] m = new int[50];

    public ArrayEx5() {
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 100);
        }
    }

    public void print() {
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%5d", m[i]);
        }
        System.out.println();
        System.out.println("최댓값 : " + maxValue(1));
        System.out.println("최솟값 : " + minValue(1));
        System.out.println("근사값 : " + approximation(m));
        System.out.println("편차 : " + Arrays.toString(deviation(m)));
        System.out.println("최빈값 version1 : " + mode(m));
        System.out.println("최빈값 version2 : " + mode2(m));
        System.out.println("합계 : " + sum(m));
        System.out.println("평균 : " + average(m));
        System.out.println("개수 : " + count(m));
        System.out.println("평균이상 개수 : " + overAverage(m));
        System.out.println("평균이하 개수 : " + underAverage(m));


    }
    //근사값
    public int approximation(int[] m){
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i < m.length; i++){
            int a = Math.abs((int)(average(m)-m[i]));
            if(min > a){
                min = a;
                idx = i;
            }
        }
        return m[idx];
    }

    //편차
    public double[] deviation(int[] m){
        double[] n = new double[m.length];
        for(int i = 0; i < n.length; i++){
            n[i] = (double)m[i] - average(m);
        }
        return n;
    }

    //최빈값
    public ArrayList<Integer> mode(int[] m){
        int[] n = new int[101];
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < m.length; i++){
            n[m[i]]++;
            if(max < n[m[i]]){
                max = n[m[i]];
            }
        }
       for(int i = 0; i < n.length;i++){
           if(n[i] == max){
               list.add(i);
           }
       }
        return list;

    }

    //최빈값2
    public ArrayList<Integer> mode2(int[] m){
        int cnt = 0;
        int max = 0;

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(m);

        for (int i = 0; i < m.length - 1; i++) {
            if(m[i] != m[i+1]){
                if(cnt > max){
                    max = cnt;
                    list.clear();
                    list.add(m[i]);
                }else if(cnt == max){
                    list.add(m[i]);
                }
                cnt = 0;
            }else{
                cnt++;
            }
        }
        if(cnt == max){
            list.add(m[m.length-1]);
        }
        return list;
    }

    //평균이상 개수
    public int overAverage(int[] m){
        int cnt = 0;
        for(int i : m){
            if(i >= average(m)){
                cnt++;
            }
        }
        return cnt;
    }

    //평균이하 개수
    public int underAverage(int[] m){
        int cnt = 0;
        for(int i : m){
            if(i <= average(m)){
                cnt++;
            }
        }
        return cnt;
    }

    //갯수
    public int count(int[] m){
        int cnt = 0;
        for(int i : m){
            ++cnt;
        }
        return cnt;
    }

    //합계
    public int sum(int[] m){
        int s = 0;
        for(int i : m){
            s+=i;
        }
        return s;
    }

    //평균
    public double average(int[] m){
        return sum(m)/m.length*1.0;
    }

    //최댓값
    public int maxValue(int order) {
        sort(0);
        return m[order - 1];
    }

    //최솟값
    public int minValue(int order) {
        sort(1);
        return m[order - 1];
    }

    public void swap(int i, int j) {
        int imsi = 0;
        if (m[i] < m[j]) {
            imsi = m[i];
            m[i] = m[j];
            m[j] = imsi;
        }
    }

    public void sort(int order) {
        int imsi = 0;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (order == 0) {
                    swap(i, j);
                } else {
                    swap(j, i);
                }

            }

        }
    }
    //67 4 89 40 39

    public static void main(String[] args) {
        ArrayEx5 a = new ArrayEx5();
        a.print();
    }
}
