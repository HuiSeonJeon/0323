package pro0321;

//���ɸ޴� ���� ���α׷� 20211219 ����
import java.util.Scanner;

public class pro4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("**********************************************************************");
		System.out.println("1. ���, 2. ���Ƕ��̽�, 3. ���, 4. ���, 5. ������, 6. ������, 7. ���� �� ��, Q/q. ���α׷� ����");
		System.out.println("  3000        4500    3000    2500     5000      5500");
		System.out.println("**********************************************************************");

		String menu, menuName = "���� �� ��";
		int price = 0, change, pay;

		System.out.print("���� �޴��� ������ >>>");
		menu = sc.next();

		switch (menu) {
		case "1":
			menuName = "���";
			price = 3000;
			break;
		case "2":
			menuName = "���Ƕ��̽�";
			price = 4500;
			break;
		case "3":
			menuName = "���";
			price = 3000;
			break;
		case "4":
			menuName = "���";
			price = 2500;
			break;
		case "5":
			menuName = "������";
			price = 5000;
			break;
		case "6":
			menuName = "������";
			price = 5500;
			break;
		case "7":
			System.out.println("�޴� ���� �� ��.");
			break;
		case "Q":
			System.out.println("���α׷� ����");
			System.exit(0);
		case "q":
			System.out.println("���α׷� ����");
			System.exit(0);
		default:
			System.out.println("�޴��� �� �� �����߽��ϴ�.");
		}
		
		String sideMenu = null, smname = "���� �� ��";
		int sidePrice = 0;
		
		System.out.println("***************************************************");
		System.out.println("1. Ŀ��, 2. ����, 3. �ݶ�, 4. �����ֽ� 5. ���� 6. ���̵� �޴� ���� ����");
		System.out.println("  1500     500     800      2500   2000");
		System.out.println("***************************************************");
		
		System.out.print("���̵� �޴��� ������ >>>");
		sideMenu = sc.next();
		
		switch (sideMenu) {
		case "1":
			smname = "Ŀ��";
			sidePrice = 1500;
			break;
		case "2":
			smname = "����";
			sidePrice = 500;
			break;
		case "3":
			smname = "�ݶ�";
			sidePrice = 800;
			break;
		case "4":
			smname = "�����ֽ�";
			sidePrice = 2500;
			break;
		case "5":
			smname = "����";
			sidePrice = 2000;
			break;
		default:
			System.out.println("���̵� �޴� ���� �� ��.");
		}

		System.out.println("�ֹ��� �޴� : " + menuName + "\t���� : " + price);
		System.out.println("���̵� �޴� : " + smname + "\t���� : " + sidePrice);
		System.out.println("�� �ݾ� : " + (price +sidePrice));
		System.out.print("�ֹ��Ͻ÷��� ���� �־��ּ��� >>> ");
		pay = sc.nextInt();
		change = pay - (price +sidePrice);
		
		System.out.println();
		System.out.println("************������*************");
		System.out.println("���Ҿ� : " + pay + "\t�Ž����� : " + change);

	}

}
