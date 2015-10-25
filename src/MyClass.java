import java.util.Scanner;

public class MyClass {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите последовательность S");
		String buffer = in.nextLine();
		char[] s = buffer.toCharArray();
		System.out.println("Введите искомую последовательность");
		buffer = in.nextLine();
		char[] find = buffer.toCharArray();
		int position = 0;
		mainloop:
		for (int i=0; i<s.length;++i) {
			if (s[i]==find[0]) {
				int counter = i+1;
				for (int j=1;j<find.length;++j) {
					if (s[counter]!=find[j]) break;
					if (j == find.length-1){ position = counter - j + 1; break mainloop;}
					++counter;
				}
			}
		}
		if (position==0) System.out.println("Не входит");
		else System.out.println("Начальная позиция: " + position);
		
	}
}
