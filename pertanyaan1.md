pertanyan-percobaan ke 1

1. jelaskan fungsi kode program berikut 

    if (data[j-1] > data[j]) {
        temp = data[j-1];
        data[j-1] = data[j];
        data[j] = temp;
    }

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort ! 

3. Pada insertion sort, jelaskan maksud dari kondisi pada perulangan 
    while (j >= 0 && data[j] > temp)

4. Pada insertion sort, apakah tujuan dari perintah data[j+1] = data[j] ?

jawab : 

1. Fungsi kode program tersebut adalah untuk membandingkan dua elemen dalam array dan menukar posisi mereka jika elemen sebelumnya lebih besar dari elemen saat ini. Ini adalah bagian dari algoritma bubble sort yang digunakan untuk mengurutkan data dalam urutan menaik.

2. Kode program untuk algoritma pencarian nilai minimum pada selection sort adalah sebagai berikut:

    int minIndex = i; // Asumsikan elemen pertama sebagai minimum
    for (int j = i + 1; j < n; j++) {
        if (data[j] < data[minIndex]) {
            minIndex = j; // Update indeks minimum jika ditemukan elemen yang lebih kecil
        }
    }
    // Tukar elemen minimum dengan elemen pertama
    int temp = data[i];
    data[i] = data[minIndex];
    data[minIndex] = temp;

3. Kondisi pada perulangan while (j >= 0 && data[j] > temp) digunakan untuk memastikan bahwa kita tidak keluar dari batas array (j >= 0) dan untuk membandingkan elemen saat ini dengan nilai sementara (temp). Jika elemen saat ini lebih besar dari temp, maka kita perlu menggeser elemen tersebut ke kanan untuk memberikan ruang bagi temp yang akan ditempatkan pada posisi yang benar.

4. Tujuan dari perintah data[j+1] = data[j] adalah untuk menggeser elemen saat ini ke kanan, sehingga memberikan ruang bagi nilai sementara (temp) yang akan ditempatkan pada posisi yang benar dalam array. Ini adalah bagian dari proses penyisipan dalam insertion sort, di mana kita memindahkan elemen-elemen yang lebih besar ke kanan untuk membuat ruang bagi elemen yang sedang diproses.
