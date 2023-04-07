package bit.basic.array;


import java.util.Arrays;

//2차원 배열
public class ArrayEx2_2 {

    static int[][] m = new int[2][3];
    
    //전역 변수로 행, 열 지정
    int row = 0;
    int col = 0;

    //배열이 가득찼는지?
    public boolean isFull() {
        return m[m.length - 1][m[m.length - 1].length - 1] != 0;
    }

    //배열이 비었는지?
    public boolean isEmpty(int row, int col) {
        return m[row][col] == 0;
    }

    //배열을 추가(2배)
    public void increment() {
        //배열의 행만 2배로 늘림, 열은 유지
        int[][] tmp = new int[m.length * 2][m[m.length - 1].length];
        
        //임시 배열에 기존의 배열을 복사해주고
        System.arraycopy(m, 0, tmp, 0, m.length);
        
        //기존 배열의 주소값을 임시배열로 돌린다.
        m = tmp;
    }

    //검색
    //입력한 데이터와 첫번째로 일치하는 행과 열을 저장
    //일치하는 값이 없으면 -1 반환
    public int search(int data) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == data) {
                    row = i;
                    col = j;
                    return row;
                }
            }
        }
        return -1;
    }

    //수정
    //검색에서 원하는 값을 찾으면 그 값의 행과 열에 바꿀 데이터를 삽입
    //검색에서 원하는 값을 찾지 못하면 정해진 출력값이 나감
    public void modify(int findData, int changeData) {

        if (search(findData) >= 0) {
            m[row][col] = changeData;
            return;
        }
        System.out.println("바꿀 값을 찾지 못했습니다.");
    }

    //삭제
    //검색에서 삭제할 값을 찾으면 삭제, 아니면 무시함
    public void delete(int deleteData) {
        if (search(deleteData) >= 0) {
            m[row][col] = 0;
            for (int i = row; i < m.length-1; i++) {
                for (int j = col; j < m[i].length - 1; j++) {
                    m[i][j] = m[i][j+1];
                }
                col = 0;
                m[i][m[i].length-1] = m[i+1][0];
            }

            for(int i = 0; i < m[m.length-1].length-1;i++){
                m[m.length-1][i] = m[m.length-1][i+1];
            }
            m[m.length-1][m[m.length-1].length-1] = 0;
        }
    }

    //추가
    private void add(int data) {
        if (!isFull()) {    //만약 배열이 가득 차 있지 않으면 비어있는 제일 첫번째 인덱스에 값 추가
            for (int i = 0; i < m.length; i++) { // 비어있는 인덱스를 찾기 위한 포문
                for (int j = 0; j < m[i].length; j++) {
                    if (isEmpty(i, j)) {
                        m[i][j] = data;
                        return;
                    }
                }
            }
        }
        //배열이 가득 차 있으면 배열을 추가한 뒤, 추가 메서드 실행
        increment();
        add(data);
    }

    public static void main(String[] args) {
        ArrayEx2_2 arrayEx2 = new ArrayEx2_2();
        int i = -1;

        arrayEx2.add(10);
        arrayEx2.add(20);
        arrayEx2.add(30);
        arrayEx2.add(40);
        arrayEx2.add(50);
        arrayEx2.add(60);
        arrayEx2.add(70);
        arrayEx2.add(80);
        arrayEx2.add(90);
        arrayEx2.add(100);
        arrayEx2.add(110);
        arrayEx2.add(120);
        arrayEx2.add(130);
        arrayEx2.add(140);
        arrayEx2.add(150);
        arrayEx2.add(160);
        arrayEx2.add(170);
        arrayEx2.add(180);
        arrayEx2.add(190);
        arrayEx2.add(200);
        arrayEx2.add(210);

//        System.out.println("0이 입력되면 프로그램이 종료됩니다.");
        System.out.println("기존의 배열");
        System.out.println(Arrays.deepToString(m));
        System.out.println();
        arrayEx2.delete(50);
        System.out.println("delete : 50");
        System.out.println(Arrays.deepToString(m));
        System.out.println();
        System.out.println("modify : 30 -> 200");
        arrayEx2.modify(30,200);
        System.out.println(Arrays.deepToString(m));



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

