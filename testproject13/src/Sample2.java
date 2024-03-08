
public class Sample2 {

	public static void main(String[] args) {
		// while文の応用
		// do while文
		
		// 初期値が5で、1ずつ減る場合
		int i = 5;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
		
		System.out.println("\n");
		
		// 初期値が1で、2ずつ増える場合
		int a = 1;
		do {
			System.out.println(a);
			a+=2;
		} while (a <= 10);
		
		System.out.println("\n");
		
		// 初期値が10で、3ずつ減る場合
		int j = 10;
		do {
			System.out.println(j);
			j-=3;
		} while (j >= 1);

	}

}
