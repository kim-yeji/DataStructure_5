package linkedListBag;
import java.io.*;
import java.util.Scanner;

public class TestNodeSet {

	NodeSet ns = new NodeSet();
	
	public TestNodeSet() {}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.Ȯ��");
			System.out.println("4.������ �ִ��� Ȯ��");
			System.out.println("5.����");
			System.out.println("6.����");
			
			int menu = scan.nextInt();
			if(menu==6) break;
			
			switch(menu) {
				case 1:
					System.out.print("�߰� �� ���� �Է��ϼ���:");
					String addData = scan.next();
					ns.add(addData);
					break;
				case 2:
					System.out.print("���� �� ���� �Է��ϼ���:");
					String delData = scan.next();
					ns.remove(delData);
					break;
				case 3:
					System.out.println(ns.checkNode());
					break;
				case 4:
					System.out.print("Ȯ���ϰ� ���� ���� �Է��ϼ���:");
					String checkData=scan.next();
					ns.contains(checkData); 
					break;
				case 5:
					System.out.print("swap�ϰ� ���� ���� ��ȣ�� �Է��ϼ���:");
					int i=scan.nextInt();
					int j=scan.nextInt();
					ns.swap(i,j);
					break;
			}
			
		}
	}
	
	
}
