package pro0321;
//학점 처리 프로그램
//20211219 전희선
import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j1, j2, j3, j4;
		double avg;
		String grade;
		
		System.out.println("자바 프로그래밍 교과목 학점");
		System.out.println("출석점수, 과제점수, 중간고사점수, 기말고사점수 순으로 입력");

		j1 = sc.nextInt();
		j2 = sc.nextInt();
		j3 = sc.nextInt();
		j4 = sc.nextInt();
		
		avg = j1+j2+j3+j4;
		
		//조건 처리
		if(avg <= 100 && avg >= 90) {
			grade = "A";
		}
		else if(avg < 90 && avg >= 80) {
			grade = "B";
		}
		else if(avg < 80 && avg >= 70) {
			grade = "C";
		}
		else if(avg < 70 && avg >= 60) {
			grade = "D";
		}		
		else if(avg > 100) {
			grade= "입력을 확인하세요";
		}
		else {
			grade = "F 재수강하세요";
		}
		
		System.out.println("자바 프로그래밍 성적표");
		System.out.println("출석 : "+ j1 + "\t과제 : " + j2 + "\t중간 : " + j3 + "\t기말 : " + j4);
		if(avg % 10 >= 5) {
			System.out.println("총점 : "+avg+"\t학점 : " + grade+"+");
		}
		else {
			System.out.println("총점 : "+avg+"\t학점 : " + grade+"0");
		}
	}

}
