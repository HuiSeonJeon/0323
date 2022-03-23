package pro0321;

//점심메뉴 고르는 프로그램 20211219 전희선
import java.util.Scanner;

public class pro4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("**********************************************************************");
		System.out.println("1. 김밥, 2. 오므라이스, 3. 백반, 4. 라면, 5. 떡볶이, 6. 볶음밥, 7. 선택 안 함, Q/q. 프로그램 종료");
		System.out.println("  3000        4500    3000    2500     5000      5500");
		System.out.println("**********************************************************************");

		String menu, menuName = "선택 안 함";
		int price = 0, change, pay;

		System.out.print("점심 메뉴를 고르세요 >>>");
		menu = sc.next();

		switch (menu) {
		case "1":
			menuName = "김밥";
			price = 3000;
			break;
		case "2":
			menuName = "오므라이스";
			price = 4500;
			break;
		case "3":
			menuName = "백반";
			price = 3000;
			break;
		case "4":
			menuName = "라면";
			price = 2500;
			break;
		case "5":
			menuName = "떡볶이";
			price = 5000;
			break;
		case "6":
			menuName = "볶음밥";
			price = 5500;
			break;
		case "7":
			System.out.println("메뉴 선택 안 함.");
			break;
		case "Q":
			System.out.println("프로그램 종료");
			System.exit(0);
		case "q":
			System.out.println("프로그램 종료");
			System.exit(0);
		default:
			System.out.println("메뉴를 잘 못 선택했습니다.");
		}
		
		String sideMenu = null, smname = "선택 안 함";
		int sidePrice = 0;
		
		System.out.println("***************************************************");
		System.out.println("1. 커피, 2. 생수, 3. 콜라, 4. 과일주스 5. 식혜 6. 사이드 메뉴 선택 안함");
		System.out.println("  1500     500     800      2500   2000");
		System.out.println("***************************************************");
		
		System.out.print("사이드 메뉴를 고르세요 >>>");
		sideMenu = sc.next();
		
		switch (sideMenu) {
		case "1":
			smname = "커피";
			sidePrice = 1500;
			break;
		case "2":
			smname = "생수";
			sidePrice = 500;
			break;
		case "3":
			smname = "콜라";
			sidePrice = 800;
			break;
		case "4":
			smname = "과일주스";
			sidePrice = 2500;
			break;
		case "5":
			smname = "식혜";
			sidePrice = 2000;
			break;
		default:
			System.out.println("사이드 메뉴 선택 안 함.");
		}

		System.out.println("주문한 메뉴 : " + menuName + "\t가격 : " + price);
		System.out.println("사이드 메뉴 : " + smname + "\t가격 : " + sidePrice);
		System.out.println("총 금액 : " + (price +sidePrice));
		System.out.print("주문하시려면 돈을 넣어주세요 >>> ");
		pay = sc.nextInt();
		change = pay - (price +sidePrice);
		
		System.out.println();
		System.out.println("************영수증*************");
		System.out.println("지불액 : " + pay + "\t거스름돈 : " + change);

	}

}
