package bit.basic.array;


import java.util.ArrayList;

public class ArrayEx4 {
	
	public double[] getValue(int...x) {
		return new double[] {Math.sqrt(x[0]),Math.sqrt(x[1]),Math.sqrt(x[2])};

	}

	public void addValue(int[] x){	//1차원
		System.out.println("public void addValue(int[] x");
	}

	public int addValue(int[][] x){	//다차원
		System.out.println("public void addValue(int[][] x");
		return x[0][0];

	}

	public void arrayEx1(){
		int[][] m;
	}

	public void arrayEx2(){
		ArrayList<Integer> i = new ArrayList<>();
		i.add(10);

	}

	public static void main(String[] args) {
		ArrayEx4 a = new ArrayEx4();
		a.arrayEx1();


//		a.addValue(new int[][]{{10,20},{30,40}});
		/*for(double v:a.getValue(10,20,30)) {
			System.out.printf("%.2f\n",v);
		}*/
	}
}
