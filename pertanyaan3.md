Pertanyaan percobaan ke 4

1. Ubahlah fungsi pada InsertionSort dibawah ini:
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }


sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.

jawab:

1. Untuk mengubah fungsi InsertionSort agar dapat melakukan sorting secara descending, kita perlu mengubah kondisi pada while loop dari `listMhs[j - 1].ipk > temp.ipk` menjadi `listMhs[j - 1].ipk < temp.ipk`. Berikut adalah fungsi yang telah diubah:


void insertionSort() {
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
Dengan perubahan ini, elemen dengan IPK yang lebih tinggi akan ditempatkan sebelum elemen dengan IPK yang lebih rendah, sehingga menghasilkan urutan descending.