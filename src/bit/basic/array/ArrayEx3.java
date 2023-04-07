package bit.basic.array;

import java.util.*;

public class ArrayEx3 {
	int[] n = new int[5];
	
	public boolean isFull() {
		if(n[n.length-1] == 0) {
			return false;
		}
		return true;
		
	}
	
	public boolean isEmpty(int idx) {
		if(n[idx] == 0) {
			return true;
		}
		return false;
	}
	
	public void increment() {	//배열 추가
		
	}
	
	public int search() {
		return 0;	//해당 index를 반환 못찾으면 -1반환
	}
	
	public void modify() {	//수정
		
	}
	
	public void delete() {	//삭제
		
	}
	
	public void add(int data) {
		
	}
	
	public void add(int fdata, int sdata) {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayEx3 a = new ArrayEx3();
		
		
	}
}
