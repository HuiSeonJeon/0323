package pro0321; // 20211219 전희선
import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int g1, g2, g3, g4, total;
		double avg;
		
		System.out.print("정보처리기사 4과목 성적 차례대로 입력 >>> ");
		
		g1 = sc.nextInt();
		g2 = sc.nextInt();
		g3 = sc.nextInt();
		g4 = sc.nextInt();
		
		total = g1 + g2 + g3 + g4;
		
		avg = (double)total / 4;
		
		if (avg >= 70) {
			System.out.println("평균 : " + avg + "로 합격하셨습니다.");
		}
		else {
			System.out.println("평균 : " + avg + "로 불합격하셨습니다.");
		}
		

	}

}
