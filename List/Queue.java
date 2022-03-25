 public class Queue {
        private LinkList Todo;
        public Queue() {
        Todo=new LinkList();
    }

    public void insert(String data) {
        Todo.tambahkanData(data);
        System.out.println("Pekerjaan Berhasil Ditambahkan");
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


