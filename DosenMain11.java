import java.util.Scanner;

public class DosenMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen11 data = new DataDosen11();
        int pilih;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - termuda ke tertua)");
            System.out.println("4. Sorting DSC (Insertion Sort - tertua ke termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    data.tambah(new Dosen11(kode, nama, jk, usia));
                    System.out.println("Data berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("\n--- Data Setelah Sorting ASC (Bubble Sort) ---");
                    data.tampil();
                    break;
                case 4:
                    data.SortingDSC();
                    System.out.println("\n--- Data Setelah Sorting DSC (Insertion Sort) ---");
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);

        sc.close();
    }
}
