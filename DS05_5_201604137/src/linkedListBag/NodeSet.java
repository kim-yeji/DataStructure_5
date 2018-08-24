package linkedListBag;

import java.util.ArrayList;
import java.util.List;

public class NodeSet implements Set {
	private Node head; // 0��° �����ͷ� �ƹ��͵� �ȵ������. ����� ������ ����Ű�⸸ �ϴ� ����
	private int size;

	public NodeSet() {
		this.head = new Node();
		this.size = 0;
	}

	@Override
	public boolean add(String data) {
		if (!this.contains(data)) {
			Node newNode = new Node(data);
			newNode.setNext(this.head);
			this.head = newNode;
			this.size++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(String data) {
		Node prevNode = null; // previosNode
		Node currNode = this.head; // currentNode
		boolean found = false;

		// �����ϰ��� �ϴ� �����Ͱ� �ִ��� Ȯ���ϴ� ����(������ �����ϸ� found==true
		while (currNode != null && !found) {
			if (currNode.getData().equals(data)) {
				found = true;
			} else {
				prevNode = currNode;
				currNode = currNode.getNext();
			}
		}

		// �����ϰ��� �ϴ� �����Ͱ� �����ϴ� ��� next����
		if (!found) {
			return false;
		} else {
			if (currNode == this.head) {
				this.head = this.head.getNext();
			} else {
				prevNode.setNext(currNode.getNext());
			}
			this.size--;
			return true;
		}
	}

	// ��带 �ϳ��� �����̸鼭 ���ϴ� �����Ͱ� ���ԵǾ��ִ��� Ȯ���ϴ� ����
	@Override
	public boolean contains(String data) {
		Node searchNode = this.head;
		while (searchNode != null) {
			if (searchNode.getData().equals(data)) {
				return true;
			}
			searchNode = searchNode.getNext();
		}

		return false;
	}

	// ��带 �����̸鼭 ��忡 �ִ� �����͸� ��ȯ����
	public String checkNode() {
		String content = "";
		Node searchNode = this.head;
		while (searchNode != null) {
			content += searchNode.getData();
			content += " ";
			searchNode = searchNode.getNext();
		}
		return content;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean swap(int i, int j) {
		// 1.i,j�� size���� ū�� Ȯ�� + 0��° ��带 �ǵ帮���� �ϴ��� Ȯ��(head)
		if (i > size || j > size || i == 0 || j == 0) {
			return false;
		} else { 
			// �� ����κ�
			String iData = "";
			String jData = "";
			Node searchNode = this.head;
			int k = 1;
			while (searchNode != null) {
				if (k == i) {
					iData = searchNode.getData();
				}
				if (k == j) {
					jData = searchNode.getData();
				}
				searchNode = searchNode.getNext(); // �������
				k++;
			}

			// �߰��κ�
			searchNode = this.head;
			k = 1;
			while (searchNode != null) {
				if (k == i) {
					searchNode.setData(jData);
				}
				
			
			if (k == j) {
				searchNode.setData(iData);
			}

			searchNode = searchNode.getNext(); // �������
			k++;
			}
		}

		return true;
	}

}
