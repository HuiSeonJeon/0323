package pro0321; // 20211219 ����
import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int g1, g2, g3, g4, total;
		double avg;
		
		System.out.print("����ó����� 4���� ���� ���ʴ�� �Է� >>> ");
		
		g1 = sc.nextInt();
		g2 = sc.nextInt();
		g3 = sc.nextInt();
		g4 = sc.nextInt();
		
		total = g1 + g2 + g3 + g4;
		
		avg = (double)total / 4;
		
		if (avg >= 70) {
			System.out.println("��� : " + avg + "�� �հ��ϼ̽��ϴ�.");
		}
		else {
			System.out.println("��� : " + avg + "�� ���հ��ϼ̽��ϴ�.");
		}
		

	}

}
