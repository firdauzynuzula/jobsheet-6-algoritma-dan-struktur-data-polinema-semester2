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

1. Kode program tersebut merupakan bagian dari algoritma bubble sort. Fungsi dari kode tersebut adalah untuk membandingkan dua elemen yang berdekatan dalam array (data[j-1] dan data[j]) dan menukar posisi mereka jika elemen sebelumnya (data[j-1]) lebih besar daripada elemen saat ini (data[j]). Proses ini akan terus dilakukan hingga seluruh array terurut dengan benar.

2. Kode program yang merupakan algoritma pencarian nilai minimum pada selection sort adalah sebagai berikut:

    for (int i = 0; i < n-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < n; j++) {
            if (data[j] < data[minIndex]) {
                minIndex = j;
            }
        }
        // Tukar elemen terkecil dengan elemen pertama
        int temp = data[minIndex];
        data[minIndex] = data[i];
        data[i] = temp;
    }

3. Kondisi pada perulangan while (j >= 0 && data[j] > temp) dalam insertion sort memiliki dua tujuan. Pertama, kondisi j >= 0 memastikan bahwa indeks j tidak keluar dari batas array saat melakukan pergeseran elemen. Kedua, kondisi data[j] > temp memastikan bahwa elemen yang sedang dibandingkan (data[j]) lebih besar daripada nilai sementara (temp) yang sedang disisipkan. Jika kedua kondisi tersebut terpenuhi, maka elemen data[j] akan digeser ke kanan untuk memberikan ruang bagi nilai temp yang akan disisipkan pada posisi yang benar.

4. Tujuan dari perintah data[j+1] = data[j] dalam insertion sort adalah untuk menggeser elemen-elemen yang lebih besar dari nilai sementara (temp) ke kanan. Hal ini dilakukan untuk membuat ruang bagi nilai temp yang akan disisipkan pada posisi yang benar dalam array. Dengan menggeser elemen-elemen yang lebih besar ke kanan, kita memastikan bahwa nilai temp dapat ditempatkan pada posisi yang sesuai sehingga array tetap terurut setelah proses penyisipan selesai.