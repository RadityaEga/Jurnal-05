import java.util.*;

    public class Queue {
        private Node front, rear;
        private int size;

        public Queue() {
            front = null;
            rear = null;
            size = 0;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public int getSize() {
            return size;
        }

        public void insert (String data) {
            Node bptr = new Node(data, null);
            if (rear == null) {
                front = bptr;
                rear = bptr;
            }

            else {
                rear.setLink(bptr);
                rear = rear.getLink();
            }
            size++;
        }

        public String remove() {
            if(isEmpty()) throw new NoSuchElementException("Underflow Exception");
            Node ptr = front;
            front = ptr.getLink();
            if (front == null)
                rear = null;
            size--;
            return ptr.getData();
        }

        public String peek() {
            if (isEmpty()) throw new NoSuchElementException("Underflow Exception");
            return front.getData();
        }

        public void display() {
            System.out.print("Menampilkan Nama Pekerjaan = ");
            if (size == 0) {
                System.out.print("Kosong");
                return;
            }
            Node ptr = front;
            while (ptr != rear.getLink()) {
                System.out.print(ptr.getData() + " || ");
                ptr = ptr.getLink();
            }
            System.out.println();
        }
    }
