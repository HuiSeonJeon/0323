package pro0321;

import java.util.Scanner;

public class hw0321 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x, y = null;
		int i;
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		System.out.print("철수 >> ");
		x = sc.next();
		
		System.out.print("영희 >> ");
		y = sc.next();
		
		if (x.equals("가위")) {
			if (y.equals("가위")) {
				i = 1;
			}
			else if (y.equals("바위")) {
				i = 2;
			}
			else if (y.equals("보")) {
				i = 3;
			}
		}
		

	}

}
