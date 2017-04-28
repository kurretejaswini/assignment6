package world;

public class DoublyLinkedList {
	
		private Link head;
		private int size;

		public DoublyLinkedList() {
			head = null;
			size = 0;
		}

		public boolean addFront(int data) {
			if (head == null) {
				head = new Link(null, data, null);

			} else {
				Link newLink = new Link(null, data, head);
				head.previous = newLink;
				head = newLink;

			}
			size++;
			return true;
		}

		public boolean addLast(int data) {
			if (head == null) {
				head = new Link(null, data, null);

			} else {
				Link current = head;
				while (current.next != null) {
					current = current.next;
				}
				Link newLink = new Link(current, data, null);
				current.next = newLink;

			}
			size++;
			return true;
		}

		public boolean removeFront() {
			if (head == null)
				return false;

			head = head.next;
			head.previous = null;
			size--;
			return true;

		}

		public boolean removeEnd() {
			if (head == null)
				return false;
			if (head.next == null) {
				head = null;
				size--;
			}
			Link current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
			size--;
			return true;

		}

		public boolean insertAt(int data, int index) {
			if (head == null)
				return false;
			if (index < 1 || index > size)
				return false;
			Link current = head;
			int i = 1;
			while (i < index) {
				current = current.next;
				i++;
			}
			if (current.previous == null) {
				Link newLink = new Link(null, data, current);
				current.previous = newLink;
				head = newLink;
			} else {
				Link newLink = new Link(current.previous, data, current);
				current.previous.next = newLink;
				current.previous = newLink;

			}
			size++;
			return true;
		}

		public boolean removeAt(int index) {
			if (head == null)
				return false;
			if (index < 1 || index > size)
				return false;
			Link current = head;
			int i = 1;
			while (i < index) {
				current = current.next;
				i++;
			}
			if (current.next == null) {
				current.previous.next = null;

			} else if (current.previous == null) {
				current = current.next;
				current.previous = null;
				head = current;
			} else {
				current.previous.next = current.next;
				current.next.previous = current.previous;

			}
			size--;
			return true;
		}

		public int size() {
			return size;

		}

		public String toString() {
			Link current = head;
			String Result = "[";
			while (current != null) {
				Result += current.data + " ";

				current = current.next;
			}
			Result += "]";
			return Result;
		}

		public static void main(String[] args) {
			DoublyLinkedList lt = new DoublyLinkedList();
			lt.addFront(10);
			lt.addFront(15);
			lt.addFront(25);
			lt.addFront(65);
			lt.addFront(12);
			lt.addFront(60);
			lt.addFront(12);
			System.out.println(lt);
			lt.removeFront();
			System.out.println(lt);
			lt.removeEnd();
			System.out.println(lt);
			System.out.println(lt.size);
			DoublyLinkedList lt1 = new DoublyLinkedList();
			lt1.addLast(12);
			lt1.addLast(16);
			lt1.addLast(19);
			lt1.addLast(22);
			lt1.addLast(25);
			lt1.addLast(27);
			lt1.addLast(18);
			lt1.addLast(23);
			System.out.println(lt1);
			lt1.removeFront();
			System.out.println(lt1);
			lt1.removeEnd();
			System.out.println(lt1);
			System.out.println(lt1.size);
		}

	}



