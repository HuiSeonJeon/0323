package pro0321;

import java.util.Scanner;

public class hw0321 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x, y = null;
		int i;
		
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		System.out.print("ö�� >> ");
		x = sc.next();
		
		System.out.print("���� >> ");
		y = sc.next();
		
		if (x.equals("����")) {
			if (y.equals("����")) {
				i = 1;
			}
			else if (y.equals("����")) {
				i = 2;
			}
			else if (y.equals("��")) {
				i = 3;
			}
		}
		

	}

}
