package variable;

import java.util.*;

public class Assignment5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		int[] dates= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days = {"월","화","수","목","금","토","일"};
		System.out.print("년을 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		int date = sc.nextInt();
		
		cnt = ((year-1)*365) + youn(year) + date;
		
		for(int i = 0; i < month-1; i++) {
			cnt += dates[i];
			if(month > 2 && yunDal(year)) {
				cnt ++;
			}
		}
		
		System.out.println(days[(cnt-1)%7]);
	}
	
	//윤년 횟수
	public static int youn(int y) {
		int sum = 0;
		sum += y/4 - y/100 + y/400;
		return sum;
	}
	
	//운년 판별
	public static boolean yunDal(int year) {
		return year%4==0 && year%100 !=0 || year%400==0;
	}

}
