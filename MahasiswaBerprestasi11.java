public class MahasiswaBerprestasi11 {
    Mahasiswa11[] listMhs = new Mahasiswa11[5];
    int idx;

    void tambah(Mahasiswa11 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil() {
        for (Mahasiswa11 m : listMhs) {
            m.tampilInformarsi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    // Tukar
                    Mahasiswa11 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Tukar
            Mahasiswa11 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void SelectionSortDescending() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[idxMax].ipk) {
                    idxMax = j;
                }
            }
            // Tukar
            Mahasiswa11 temp = listMhs[idxMax];
            listMhs[idxMax] = listMhs[i];
            listMhs[i] = temp;
        }
    }
}
