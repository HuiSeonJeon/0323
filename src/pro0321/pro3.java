package pro0321;
//���� ó�� ���α׷�
//20211219 ����
import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j1, j2, j3, j4;
		double avg;
		String grade;
		
		System.out.println("�ڹ� ���α׷��� ������ ����");
		System.out.println("�⼮����, ��������, �߰��������, �⸻������� ������ �Է�");

		j1 = sc.nextInt();
		j2 = sc.nextInt();
		j3 = sc.nextInt();
		j4 = sc.nextInt();
		
		avg = j1+j2+j3+j4;
		
		//���� ó��
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
			grade= "�Է��� Ȯ���ϼ���";
		}
		else {
			grade = "F ������ϼ���";
		}
		
		System.out.println("�ڹ� ���α׷��� ����ǥ");
		System.out.println("�⼮ : "+ j1 + "\t���� : " + j2 + "\t�߰� : " + j3 + "\t�⸻ : " + j4);
		if(avg % 10 >= 5) {
			System.out.println("���� : "+avg+"\t���� : " + grade+"+");
		}
		else {
			System.out.println("���� : "+avg+"\t���� : " + grade+"0");
		}
	}

}
