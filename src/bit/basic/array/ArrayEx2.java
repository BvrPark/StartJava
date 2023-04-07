package bit.basic.array;


import java.util.Arrays;

public class ArrayEx2 {

    static int[] m = new int[5]; // [10], [20], [30], [40], [50]

    public boolean isFull() {
        return m[m.length - 1] != 0;
    }

    public boolean isEmpty(int idx) {
        return m[idx] == 0;
    }

    public void increment() { // 배열 사이즈 늘리는 거임. *2 이거나 *2 + 1
        int[] tmp = new int[m.length * 2];

//        for (int i = 0; i < m.length; i++) {
//            tmp[i] = m[i];
//        }

        System.arraycopy(m, 0, tmp, 0, m.length);

        m = tmp;
    }

    public int search(int data) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] == data) {
                return i;
            }
        }

        return -1;
    }

    public void modify(int findData, int changeData) {
        int searchedData = search(findData);

        if (searchedData >= 0) {
            m[searchedData] = changeData;
            return;
        }

        System.out.println("바꿀 값을 찾지 못했습니다.");
    }

    public void delete(int deleteData) {
        int searchIdx = search(deleteData);

        if (searchIdx >= 0) {
            m[searchIdx] = 0;

            for (int i = searchIdx; i < m.length - 1; i++) {
                m[i] = m[i + 1];
            }
        }
    }

    private void add(int data) {
        if (!isFull()) {
            for (int i = 0; i < m.length; i++) { // 비어있는 인덱스를 찾기 위한 포문
                if (isEmpty(i)) {
                    m[i] = data;
                    return;
                }
            }
        }

        increment();
        add(data);
    }

    public static void main(String[] args) {
        ArrayEx2 arrayEx2 = new ArrayEx2();
        int i = -1;

        arrayEx2.add(10);
        arrayEx2.add(20);
        arrayEx2.add(30);
        arrayEx2.add(40);
        arrayEx2.add(50);
        arrayEx2.add(60);
        arrayEx2.add(70);

        arrayEx2.modify(10, 100);

//        arrayEx2.delete(100);

        System.out.println("0이 입력되면 프로그램이 종료됩니다.");
        System.out.println(Arrays.toString(m));

//        while (i != 0) {
////            Scanner scanner = new Scanner(System.in);
////            i = scanner.nextInt();
//
//
//            if (i == 0) {
////                scanner.close();
//            }
//        }
    }
}

