import java.util.*;

    public class Soal02 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Queue lq = new Queue();

            char character;
            System.out.println("Pilih Menu");
            System.out.println("1. Menambah nama pekerjaan yang harus dilakukan");
            System.out.println("2. Menampilkan nama pekerjaan yang harus diselesaikan terlebih dahulu");
            System.out.println("3. Menghapus pekerjaan yang sudah diselesaikan");
            System.out.println("4. Menampilkan seluruh isi to-do list");

            do {
                System.out.print("Pilih Menu: ");
                int pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("Masukkan nama pekerjaan: ");
                        lq.insert(input.next());
                        break;
                    case 2:
                        try {
                            System.out.println("Peek Element = " + lq.peek());
                        }

                        catch (Exception e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Hapus Element = " + lq.remove());
                        }

                        catch (Exception e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 4:
                        Queue.printQueue();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Salah Masukkan!");
                        break;
                }
                lq.display();
                System.out.println("Apakah ingin melanjutkan ('Ya' Atau 'Tidak') :");
                character = input.next().charAt(0);
            }

            while (character == 'Y' || character == 'y');

        }
    }
