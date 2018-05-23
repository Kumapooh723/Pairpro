import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("入力："+input);

		System.out.println("出力："+translateEng(input));

	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		int length = String.valueOf(n).length();
		String eng = null;
		eng=two(n);
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve" };
		if (length == 3 && String.valueOf(n).matches("[1-9][0-9][0-9]")) {
			String f=String.valueOf(n).substring(0,1);
			int num=Integer.parseInt(f);
			String e=f+"00";
			eng = a[num] + " " + "hundred"+" "+"and"+" "+two(n-Integer.parseInt(e));
			// ここを変えていけば100以上もできるはず

		}

		else
			switch (n) {
			case 0:
				eng = a[0];
				break;
			case 1:
				eng = a[1];
				break;
			case 2:
				eng = a[2];
				break;
			case 3:
				eng = a[3];
				break;
			case 4:
				eng = a[4];
				break;
			case 5:
				eng = a[5];
				break;
			case 6:
				eng = a[6];
				break;
			case 7:
				eng = a[7];
				break;
			case 8:
				eng = a[8];
				break;
			case 9:
				eng = a[9];
				break;
			case 10:
				eng = a[10];
				break;
			case 11:
				eng = a[11];
				break;
			case 12:
				eng = a[12];
				break;
			}
		return eng;
	}
	
	static String two(int n) {
		String eng = null;
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve" };
		String[] b = { "teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		int length = String.valueOf(n).length();
		int m = 0;
		if (length == 2 && n > 12) {
			if (13 <= n && n <= 19) {

				if (n == 13)
					eng = "thir" + b[0];
				if (n == 14)
					eng = a[4] + b[0];
				if (n == 15)
					eng = "fif" + b[0];
				if (n == 16)
					eng = a[6] + b[0];
				if (n == 17)
					eng = a[7] + b[0];
				if (n == 18)
					eng = "eigh" + b[0];
				if (n == 19)
					eng = a[9] + b[0];
			}
			if (20 <= n && n <= 29) {
				m = n - 20;
				if (m == 0)
					eng = b[1];
				else
					eng = b[1] + " " + a[m];
			}
			if (30 <= n && n <= 39) {
				m = n - 30;
				if (m == 0)
					eng = b[2];
				else
					eng = b[2] + " " + a[m];
			}
			if (40 <= n && n <= 49) {
				m = n - 40;
				if (m == 0)
					eng = b[3];
				else
					eng = b[3] + " " + a[m];
			}
			if (50 <= n && n <= 59) {

				m = n - 50;
				if (m == 0)
					eng = b[4];
				else
					eng = b[4] + " " + a[m];
			}

			if (60 <= n && n <= 69) {

				m = n - 60;
				if (m == 0)
					eng = b[5];
				else
					eng = b[5] + " " + a[m];
			}
			if (70 <= n && n <= 79) {
				m = n - 70;
				if (m == 0)
					eng = b[6];
				else
					eng = b[6] + " " + a[m];

			}
			if (80 <= n && n <= 89) {

				m = n - 80;
				if (m == 0)
					eng = b[7];
				else
					eng = b[7] + " " + a[m];
			}

			if (90 <= n && n <= 99) {
				m = n - 90;
				if (m == 0)
					eng = b[8];
				else
					eng = b[8] + " " + a[m];

			}
		}
			return eng;
		
	
	}

}
