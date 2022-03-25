import java.util.*;

    public class Soal02 {
        public static void main(String[] args) {
            Queue todoList = new Queue();
            Scanner input = new Scanner(System.in);
            int pilihan;

            do {
                System.out.println("Pilih Menu ");
                System.out.println("1. Menambah nama pekerjaan yang harus dilakukan");
                System.out.println("2. Menampilkan nama pekerjaan yang harus diselesaikan terlebih dahulu");
                System.out.println("3. Menghapus pekerjaan yang sudah diselesaikan");
                System.out.println("4. Menampilkan seluruh isi to-do list");
                System.out.println("5. keluar");

                pilihan = input.nextInt();

                if (pilihan == 1) {
                    System.out.println("Masukan nama Pekerjaan");
                    String todo = input.next();
                    todoList.insert(todo);
                }

                else if (pilihan == 2) {
                    if (todoList.isQueueEmpty()) {
                        System.out.println("Pekerjaan kosong harap tambahkan pekerjaan!");
                    }
                    else {
                        System.out.println("Pekerjaan yang harus segera diselesaikan");
                        String todoAwal = todoList.peek();
                        System.out.println("Pekerjaan pertama " + todoAwal);
                    }
                }

                else if (pilihan == 3) {
                    if (todoList.isQueueEmpty()) {
                        System.out.println("Pekerjaan Kosong harap tambahkan Pekerjaan");
                    }

                    else {
                        todoList.delete();
                    }
                }

                else if (pilihan == 4) {
                    if (todoList.isQueueEmpty()) {
                        System.out.println("Pekerjaan Kosong harap tambahkan Pekerjaan");
                    }

                    else {
                        todoList.display();
                    }
                }
            }
                while (pilihan < 5);
        }
    }

