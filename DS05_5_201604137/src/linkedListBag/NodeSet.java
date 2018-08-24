package linkedListBag;

import java.util.ArrayList;
import java.util.List;

public class NodeSet implements Set {
	private Node head; // 0번째 데이터로 아무것도 안들어있음. 노드의 시작을 가리키기만 하는 역할
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

		// 삭제하고자 하는 데이터가 있는지 확인하는 과정(데이터 존재하면 found==true
		while (currNode != null && !found) {
			if (currNode.getData().equals(data)) {
				found = true;
			} else {
				prevNode = currNode;
				currNode = currNode.getNext();
			}
		}

		// 삭제하고자 하는 데이터가 존재하는 경우 next변경
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

	// 노드를 하나씩 움직이면서 원하는 데이터가 포함되어있는지 확인하는 과정
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

	// 노드를 움직이면서 노드에 있는 데이터를 반환해줌
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
		// 1.i,j가 size보다 큰지 확인 + 0번째 노드를 건드리려고 하는지 확인(head)
		if (i > size || j > size || i == 0 || j == 0) {
			return false;
		} else { 
			// 값 추출부분
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
				searchNode = searchNode.getNext(); // 다음노드
				k++;
			}

			// 추가부분
			searchNode = this.head;
			k = 1;
			while (searchNode != null) {
				if (k == i) {
					searchNode.setData(jData);
				}
				
			
			if (k == j) {
				searchNode.setData(iData);
			}

			searchNode = searchNode.getNext(); // 다음노드
			k++;
			}
		}

		return true;
	}

}
