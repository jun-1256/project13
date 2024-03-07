
public class Do_while {

	public static void main(String[] args) {
		// while文の応用
		// do while文
		// do while文は 必ず一度は実行させたい処理がある場合に 使用します。
		//	初期値;
		
		// do while文の書き方
		//	do {
		//		処理内容;
		//		増減式; 
		//	} while (条件式);
		
		// (例)
		// int i = 1;
		// do {
		//		System.out.println(i);
		//		i--;
		// } while (i > 1);
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		
		System.out.println("\n");
		
		int a = 5;
		do {
			System.out.println(a);
			a++;
		} while (a < 10);

	}

}
