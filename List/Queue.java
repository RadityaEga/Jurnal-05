import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

    public class Queue {
       private LinkList Todo;
        public Queue() {
            Todo=new LinkList();
        }
        
        public void insert(String data) {
            Todo.tambahkanData(data);
            System.out.println("Todo Berhasil Ditambahkan");
        }
        
        public String delete() {
            return Todo.hapusData();
        }
        
        public boolean isQueueEmpty() {
            return Todo.isEmpty();
        }
        
        public void display() {
            Todo.displayList();
        }
        
        public String peek() {
            return Todo.peekFirst();
        }
    }
