package linkedListBag;
import java.io.*;
import java.util.Scanner;

public class TestNodeSet {

	NodeSet ns = new NodeSet();
	
	public TestNodeSet() {}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.추가");
			System.out.println("2.삭제");
			System.out.println("3.확인");
			System.out.println("4.내용이 있는지 확인");
			System.out.println("5.스왑");
			System.out.println("6.종료");
			
			int menu = scan.nextInt();
			if(menu==6) break;
			
			switch(menu) {
				case 1:
					System.out.print("추가 할 값을 입력하세요:");
					String addData = scan.next();
					ns.add(addData);
					break;
				case 2:
					System.out.print("삭제 할 값을 입력하세요:");
					String delData = scan.next();
					ns.remove(delData);
					break;
				case 3:
					System.out.println(ns.checkNode());
					break;
				case 4:
					System.out.print("확인하고 싶은 값을 입력하세요:");
					String checkData=scan.next();
					ns.contains(checkData); 
					break;
				case 5:
					System.out.print("swap하고 싶은 값의 번호를 입력하세요:");
					int i=scan.nextInt();
					int j=scan.nextInt();
					ns.swap(i,j);
					break;
			}
			
		}
	}
	
	
}
