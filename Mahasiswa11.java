public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Constructor default
    Mahasiswa11() {
    }

    // Constructor dengan parameter
    Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformarsi(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
