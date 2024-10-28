package baitap2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int inputKey = -1;
		while (inputKey != 0) {
			System.out.println("|------------------------MENU----------------------------------|");
			System.out.println("| 1. Chương trình in số chẵn                                   |");
			System.out.println("| 2. Chương trình in số lẽ                                     |");
			System.out.println("| 3. Chương trình tính tổng các số chẵn từ 1 đến n             |");
			System.out.println("| 4. Chương trình đếm các số chia hết cho 3 từ 0-1000          |");
			System.out.println("| 5. Chương trình tính tổng các số lớn hơn 0                   |");
			System.out.println("| 0. Thoát                                                     |");
			System.out.println("|--------------------------------------------------------------|");
			Scanner console = new Scanner(System.in);
			System.out.print("Vui lòng chọn một số : ");
			inputKey = console.nextInt();
			switch (inputKey) {
			case 0:
				System.out.println("Tạm biệt!");
				break;
			case 1:
				inSoChan();
				break;
			case 2:
				inSoLe();
				break;
			case 3:
				tongCacSoChanTu1DenN();
				break;
			case 4:
				coBaoNhieuSo();
				break;
			case 5:
				tongCacSoLonHon0();
				break;
			default:
				System.out.println("Hãy chọn lại!");
				break;
			}
		}
	}

	private static void tongCacSoLonHon0() {
		// TODO Auto-generated method stub
		int sum = 0;
		int number;

		while (true) {
			System.out.print("Nhập một số (0 hoặc số âm để dừng): ");
			number = new Scanner(System.in).nextInt();

			if (number <= 0) {
				break;
			}

			sum += number;
		}

		System.out.println("Tổng các số lớn hơn 0 là: " + sum);

	}

	private static void coBaoNhieuSo() {
		// TODO Auto-generated method stub
		int count = 0;
		int i = 0;

		while (i <= 1000) {
			if (i % 3 == 0) {
				count++;
			}
			i++;
		}

		System.out.println("Số lượng các số chia hết cho 3 từ 0 đến 1000 là(while): " + count);

		int count1 = 0;

		for (int j = 0; j <= 1000; j++) {
			if (j % 3 == 0) {
				count1++;
			}
		}

		System.out.println("Số lượng các số chia hết cho 3 từ 0 đến 1000 là(for): " + count1);

	}

	private static void tongCacSoChanTu1DenN() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số n: ");
		int n = scanner.nextInt();

		int sum = 0;
		int i = 2;

		while (i <= n) {
			sum += i;
			i += 2;
		}

		System.out.println("Tổng các số chẵn từ 1 đến " + n + "(while) là: " + sum);

		int sum1 = 0;

		for (int j = 2; j <= n; j += 2) {
			sum1 += j; //
		}

		System.out.println("Tổng các số chẵn từ 1 đến " + n + "(for) là: " + sum1);

	}

	private static void inSoLe() {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println("Dùng while");
		while (i < 100) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println("\nDùng for");
		for (int j = 1; j < 100; j++) {
			if (j % 2 != 0) {
				System.out.print(j + "\s");
			}
		}
		System.out.println("");

	}

	private static void inSoChan() {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println("Dùng while");
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println("\nDùng for");
		for (int j = 1; j < 100; j++) {
			if (j % 2 == 0) {
				System.out.print(j + "\s");
			}
		}
		System.out.println("");
	}
}
