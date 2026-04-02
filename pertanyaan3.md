Pertanyaan percobaan ke 3

1. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
   int idxMin = i;
   for (int j = i + 1; j < listMhs.length; j++) {
       if (listMhs[j].ipk < listMhs[idxMin].ipk) {
           idxMin = j;
       }
   }
   Untuk apakah proses tersebut, jelaskan!

jawab:

1. Proses tersebut digunakan untuk mencari indeks dari elemen dengan nilai terkecil (minimum) dalam array listMhs mulai dari indeks i hingga akhir array. Variabel idxMin awalnya diatur ke indeks i, kemudian loop for membandingkan setiap elemen berikutnya (listMhs[j]) dengan elemen yang saat ini dianggap minimum (listMhs[idxMin]). Jika ditemukan elemen yang lebih kecil, maka idxMin diperbarui dengan indeks j. Setelah loop selesai, idxMin akan menunjuk ke indeks elemen dengan nilai terkecil dalam rentang yang diperiksa.