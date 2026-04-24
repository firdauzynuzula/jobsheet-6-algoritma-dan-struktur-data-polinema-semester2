Pertanyaan percobaan ke 3

Pertanyaan ke 1
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

    for (int i = 0; i < listMhs.length - 1; i++) {
        for (int j = 1; j < listMhs.length - i; j++) {
        }
    }
a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad)
yang terdiri dari nim, nama, kelas, dan ipk!

Pertanyaan ke 2
3. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
   int idxMin = i;
   for (int j = i + 1; j < listMhs.length; j++) {
       if (listMhs[j].ipk < listMhs[idxMin].ipk) {
           idxMin = j;
       }
   }
   Untuk apakah proses tersebut, jelaskan!

jawab:

1. 
a. Syarat dari perulangan i adalah i < listMhs.length - 1 karena pada setiap iterasi, kita membandingkan elemen saat ini dengan elemen berikutnya (listMhs[j]). Jika i mencapai listMhs.length - 1, maka tidak ada elemen berikutnya untuk dibandingkan, sehingga perulangan dapat dihentikan.
b. Syarat dari perulangan j adalah j < listMhs.length - i karena pada setiap iterasi, kita membandingkan elemen saat ini dengan elemen berikutnya (listMhs[j]). Seiring dengan bertambahnya nilai i, jumlah elemen yang perlu dibandingkan berkurang, sehingga j harus kurang dari listMhs.length - i untuk memastikan bahwa kita hanya membandingkan elemen yang belum diurutkan.
c. Jika banyak data di dalam listMhs adalah 50, maka perulangan i akan berlangsung sebanyak 49 kali (dari i = 0 hingga i = 48). Tahap bubble sort yang ditempuh adalah 49 tahap, karena pada setiap tahap, elemen terbesar akan "menggelembung" ke posisi yang benar di akhir array.

2. Untuk membuat data mahasiswa bersifat dinamis, kita dapat menggunakan Scanner untuk mengambil input dari keyboard. Berikut adalah contoh modifikasi program untuk memasukkan data mahasiswa:

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Mahasiswa[] listMhs = new Mahasiswa[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
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

            listMhs[i] = new Mahasiswa(nim, nama, kelas, ipk);
        }
    }
}


3. Proses tersebut digunakan untuk mencari indeks dari elemen dengan nilai terkecil (minimum) dalam array listMhs mulai dari indeks i hingga akhir array. Variabel idxMin awalnya diatur ke indeks i, kemudian loop for membandingkan setiap elemen berikutnya (listMhs[j]) dengan elemen yang saat ini dianggap minimum (listMhs[idxMin]). Jika ditemukan elemen yang lebih kecil, maka idxMin diperbarui dengan indeks j. Setelah loop selesai, idxMin akan menunjuk ke indeks elemen dengan nilai terkecil dalam rentang yang diperiksa.