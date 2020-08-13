package board;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> bodies = new ArrayList<String>();

		while (true) {
			String s = sc.nextLine();
			
			if(s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			} else if(s.equals("add")) {
				System.out.println("게시물 제목을 입력해주세요");
				String title = sc.nextLine();
				System.out.println("게시물 내용을 입력해주세요");
				String body = sc.nextLine();
				
				titles.add(title);
				bodies.add(body);
				
			} else if(s.equals("list")) {
				
				for(int i = 0; i < titles.size(); i++) {	
					System.out.println("제목 : " + titles.get(0));
					System.out.println("내용 : " + bodies.get(0));
					System.out.println("-----------------");
				}		
			}
			// 입력 받은 값이 exit 인지 확인하고 exit가 맞으면 종료

		}
	}

}
