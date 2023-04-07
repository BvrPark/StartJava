package bit.basic.obj1;

import java.util.*;

public class ObjectEx3 {

    //이름, 나이, 오늘생일, 성별, 지역, 띠, 나이평균, 나이별 정렬, 성씨별 인원수
    static String[] member = {"공지현#961210-1010678#051)234-8910",
            "김가영#990119-2010678#02)934-8910",
            "김민준#580219-1010978#031)734-8910",
            "김병훈#880323-1910678#02)634-8910",
            "박규민#960210-1010678#051)234-8910"};
    int today = 123;
    String[] name = new String[member.length];
    static int[] idxs = new int[member.length];
    List<Integer> year = new ArrayList<>();
    ArrayList<String> birthDay = new ArrayList<>();
    String[] gender = new String[member.length];
    String[] locate = new String[member.length];
    String[] ddi = new String[member.length];
    String birth = "0323";
    String[] ddis = {"닭띠", "개띠", "돼지띠", "쥐띠", "소띠", "범띠", "토끼띠", "용띠", "뱀띠", "말띠", "양띠", "원숭이띠"};

    //이름
    public String[] name(String[] member) {
        for (int i = 0; i < member.length; i++) {
            String[] arr = member[i].split("#");
            name[i] = arr[0];
        }
        return name;
    }

    //나이
    public List<Integer> year(String[] member) {
        for (int i = 0; i < member.length; i++) {
            String[] arr = member[i].split("#");
            int jumin = Integer.parseInt(arr[1].substring(0, 2));

            if(jumin > 23){
                year.add(today - jumin + 1);
            }else{
                year.add(today-100 - jumin + 1);
            }
        }
        return year;
    }

    //오늘 생일
    public ArrayList<String> birth(String[] member) {
        for (int i = 0; i < member.length; i++) {
            String[] arr = member[i].split("#");
            if (birth.equals(arr[1].substring(2, 6))) {
                birthDay.add(arr[0]);
            }
        }
        return birthDay;
    }

    //성별
    public String[] gender(String[] member) {
        for (int i = 0; i < member.length; i++) {
            String[] arr = member[i].split("#");
            if (arr[1].charAt(7) == '1') {
                gender[i] = "남자";
            } else if (arr[1].charAt(7) == '2') {
                gender[i] = "여자";
            }
        }
        return gender;
    }

    //지역
    public String[] locate(String[] member) {
        for (int i = 0; i < member.length; i++) {
            String[] arr = member[i].split("#");
            if (arr[2].substring(0, 3).equals("051")) {
                locate[i] = "부산";
            } else if (arr[2].substring(0, 2).equals("02")) {
                locate[i] = "서울";
            } else if (arr[2].substring(0, 3).equals("031")) {
                locate[i] = "경기도";
            }
        }
        return locate;
    }

    //띠
    public String[] ddi(String[] member) {
        int idx;
        for (int i = 0; i < member.length; i++) {
            String[] arr = member[i].split("#");
            int jumin = Integer.parseInt(arr[1].substring(0, 2));

            if (jumin > 23) {
                idx = (jumin + 3) % 12;
            } else {
                idx = (jumin + 7) % 12;
            }
            ddi[i] = this.ddis[idx];
        }
        return ddi;
    }

    //나이 평균
    public double yearAver(String[] member) {
        int sum = 0;
        for (int i : year(member)) {
            sum += i;
        }
        return sum / (member.length * 1.0);
    }

    //나이 별 정렬
    public static int[] sort(String[] member) {
        Map<String, Integer[]> m = new HashMap<>();
        for (int i = 0; i < member.length; i++) {
            String id = member[i];
            // 생년월일 추출
            String birthYear = id.substring(4, 6);
            if(Integer.parseInt(birthYear) > 23){
                birthYear = "19" + birthYear;
            }else{
                birthYear = "20" + birthYear;
            }
            // 현재 년도에서 생년월일을 빼서 나이 계산
            int age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(birthYear) + 1;
            m.put(id, new Integer[]{i, age});
        }

        // 나이를 기준으로 정렬
        List<String> sortedKeys = new ArrayList<>(m.keySet());
        Collections.sort(sortedKeys, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return m.get(o1)[1] - m.get(o2)[1]; // Map의 value 배열의 두 번째 값(나이)으로 비교
            }
        });
        
        //idxs 배열에 정렬한 index값(m.get(key)[0])을 넣음
        for (int i = 0; i < sortedKeys.size(); i++) {
            idxs[i] = m.get(sortedKeys.get(i))[0];
        }
        return idxs;
    }



    //성씨 별 인원수
    public void list(String[] member) {
        HashMap<String, Integer> list = new HashMap<>();
        for (int i = 0; i < member.length; i++) {
            String sung = member[i].substring(0, 1);
            list.put(sung, list.getOrDefault(sung, 0) + 1);
        }

        for (Map.Entry<String, Integer> value : list.entrySet()) {
            System.out.println(value.getKey() + "씨의 수 : " + value.getValue());
        }
    }

    public void playAll(String[] member) {
        name(member);
        year(member);
        gender(member);
        locate(member);
        ddi(member);

    }


    public static void main(String[] args) {
        ObjectEx3 test = new ObjectEx3();
        ObjectEx3 test2 = new ObjectEx3();
        test.playAll(member);
        for (int i = 0; i < member.length; i++) {
            System.out.println("이름 : " + test.name[i]);
            System.out.println("나이 : " + test.year.get(i));
            System.out.println("성별 : " + test.gender[i]);
            System.out.println("지역 : " + test.locate[i]);
            System.out.println("띠 : " + test.ddi[i]);
            System.out.println();
        }
        test.birth(member);
        for (int i = 0; i < test.birthDay.size(); i++) {
            System.out.println("오늘 생일인 사람 : " + test.birthDay.get(i));
        }
        System.out.println();
        test.list(member);
        System.out.println();
        test.year.clear();
        System.out.println("나이 평균 : " + test.yearAver(member));
        System.out.println("========================================");
        test2.playAll(member);

        System.out.println("나이 순 정렬");
        System.out.println();
        sort(member);

        for(int i = 0; i < member.length; i++){
            int index = idxs[i];
            System.out.println("이름 : " + test2.name[index]);
            System.out.println("나이 : " + test2.year.get(index));
            System.out.println("성별 : " + test2.gender[index]);
            System.out.println("지역 : " + test2.locate[index]);
            System.out.println("띠 : " + test2.ddi[index]);
            System.out.println();
        }



    }
}
