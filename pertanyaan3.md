Pertanyaan percobaan ke 3

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
3. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
   int idxMin = i;
   for (int j = i + 1; j < listMhs.length; j++) {
       if (listMhs[j].ipk < listMhs[idxMin].ipk) {
           idxMin = j;
       }
   }
   Untuk apakah proses tersebut, jelaskan!

jawab:

1. a. Syarat dari perulangan i adalah i < listMhs.length - 1 karena pada saat i mencapai listMhs.length - 1, elemen terakhir sudah berada pada posisi yang benar setelah proses bubble sort. Oleh karena itu, tidak perlu melakukan perulangan lagi untuk elemen terakhir.

b. Syarat dari perulangan j adalah j < listMhs.length - i
karena pada setiap iterasi i, elemen terbesar akan "menggelembung" ke posisiakhir array. Oleh karena itu, pada iterasi berikutnya, kita tidak perlu memeriksa elemen yang sudah berada di posisi akhir, sehingga batas atas untuk j berkurang sebanyak i.

c. Jika banyak data di dalam listMhs adalah 50, maka perulangan i akan berlangsung sebanyak 49 kali (dari 0 hingga 48). Tahap bubble sort yang ditempuh adalah 49 tahap, karena pada setiap tahap, elemen terbesar akan dipindahkan ke posisi akhir array.

2. Untuk memodifikasi program agar data mahasiswa bersifat dinamis, kita dapat menggunakan Scanner untuk mengambil input dari keyboard. Berikut adalah contoh modifikasi program:

import java.util.Scanner;
public class Main {
    static Mahasiswa[] listMhs;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        n = scanner.nextInt();
        listMhs = new Mahasiswa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = scanner.next();
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Kelas: ");
            String kelas = scanner.next();
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            listMhs[i] = new Mahasiswa(nim, nama, kelas, ipk);
        }

        insertionSort();
        // Cetak hasil sorting
    }

    static void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}



3. Proses tersebut digunakan untuk mencari indeks dari elemen dengan nilai terkecil (minimum) dalam array listMhs mulai dari indeks i hingga akhir array. Variabel idxMin awalnya diatur ke indeks i, kemudian loop for membandingkan setiap elemen berikutnya (listMhs[j]) dengan elemen yang saat ini dianggap minimum (listMhs[idxMin]). Jika ditemukan elemen yang lebih kecil, maka idxMin diperbarui dengan indeks j. Setelah loop selesai, idxMin akan menunjuk ke indeks elemen dengan nilai terkecil dalam rentang yang diperiksa.