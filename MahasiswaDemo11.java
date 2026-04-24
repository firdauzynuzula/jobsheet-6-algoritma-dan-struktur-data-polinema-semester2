import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();

        Scanner scanner = new Scanner(System.in);

        Mahasiswa11[] listMhs = new Mahasiswa11[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            listMhs[i] = new Mahasiswa11(nim, nama, kelas, ipk);
        }
        list.tambah(listMhs[0]);
        list.tambah(listMhs[1]);
        list.tambah(listMhs[2]);
        list.tambah(listMhs[3]);
        list.tambah(listMhs[4]);

        System.out.println("Data mahasiswa sebelum disorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah  terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah  terurut menggunakan SELECTION SORT (DESC) : ");
        list.SelectionSortDescending();
        list.tampil();

        scanner.close();
    }
}
