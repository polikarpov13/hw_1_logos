package hw_1;

public class ApplicationClass {
	public static void main(String[] args) {
		//task1
		
		byte b = 1;
		int i1 = 2;
		double d = 3;
		long l = 4;
		short s = 5;
		float f = 6;
		boolean bool = true;
		String str = "Example";
		
		//task2
		
		Byte b1 = b;
		Float f1 = f;
		
//		System.out.println("Min : " + b1);
//		System.out.println("Max : " + f1);
		
		//task3
		
		int [] array = new int [10];
		
		for(int i = 0;i < array.length;i++) {
			array[i] = i;
		}
		
		for(int i = 0;i < array.length;i++)
			System.out.println(array[i]);
		
		int max = array[0];
		int min = array[0];
		
		for(int i = 0;i < array.length;i++) {
			if(array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
		}
		
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
}
