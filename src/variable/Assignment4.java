package variable;

public class Assignment4 {
	
	public static void main(String[] args) {
		
		//if - else
		int i = 0;
		
		if(i == 1) {
			System.out.println("if-1");
		}else {
			System.out.println("else-1");
		}
		
		//if - else if - else
		int j = 10;
		
		if(j == 1) {
			System.out.println("if-2");
		}else if(j == 2) {
			System.out.println("else if");
		}else {
			System.out.println("else-2");
		}
		
		//switch-case-default
		int k = 2;
		switch(k) {
			case 1:
				System.out.println("case 1");
				break;
			
			case 2:
				System.out.println("case 2");
				break;
				
			default :
				System.out.println("default");
		
		}
		
		//while
		int l = 0;
		while(l < 5) {
			System.out.println(l++);
		}
		
		//do-while
		int p = 1;
		
		do {
			System.out.println(p++ + "번 실행");
		}while(p < 10);
	}
}
