package TopInterviewQustions;

import java.util.Hashtable;

public class LRUCache {
	
	class DLinkedNode{
		DLinkedNode next;
		DLinkedNode prev;
		int value;
		int key;
	}
	
	public void addNode(DLinkedNode node) {
		node.prev = head;
		node.next = head.next;
		
		head.next.prev = node;
		head.next = node;
	}
	
	public void removeNode(DLinkedNode node) {
		DLinkedNode next = node.next;
		DLinkedNode prev = node.prev;
		
		prev.next = next;
		next.prev = prev;
	}
	
	public void moveToHead(DLinkedNode node) {
		removeNode(node);
		addNode(node);
	}
	
	public DLinkedNode popTail() {
		DLinkedNode res = tail.prev;
		removeNode(res);
		return res;
	}
	
	DLinkedNode head, tail;
	Hashtable<Integer, DLinkedNode> cache = new Hashtable<>();
	private int size;
	private int capacity;
	
	public LRUCache(int capacity) {
		head = new DLinkedNode();
		tail = new DLinkedNode();
		
		this.capacity = capacity;
		this.size = 0;
		
		head.next = tail;
		tail.prev = head;
	}
	
	public int get(int key) {
		DLinkedNode node = cache.get(key);
		
		if(node != null) {
			moveToHead(node);
			return node.value;
		}
		
		return -1;
	} 
	
	public void put(int key, int value) {
		DLinkedNode node = cache.get(key);
		
		if(node == null) {
			DLinkedNode newNode = new DLinkedNode();
			newNode.key = key;
			newNode.value = value;
			
			cache.put(key, newNode);
			size++;
			
			if(size > capacity) {
				DLinkedNode tail = popTail();
				cache.remove(tail.key);
				size--;
			}
		}else {
			node.value = value;
			moveToHead(node);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
