import java.time.LocalDate;

public class Manusia {
    // inisiasi objek yang ada pada class manusia
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean Menikah;

    // membuat constructor dari class manusia
    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.Menikah = menikah;
    }

    public Manusia(String nama2, double jenisKelamin2, double menikah2) {
    }

    public Manusia(String nama2, String nIK2, boolean jenisKelamin2, boolean menikah2, double gaji) {
    }

    public Manusia(String nama2, String nIK2, boolean jenisKelamin2, boolean menikah2, double gaji,
            LocalDate tahunMasuk, int jumlahAnak) {
    }

    // membuat setter dan getter untuk objek nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // membuat setter dari objek NIK
    public void setNIK(String nIK) {
        NIK = nIK;
    }

    // membuat getter dari objek NIK
    public String getNIK() {
        return NIK;
    }

    // membuat setter dari objek jenisKelamin
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // membuat getter dari objek jenisKelamin
    public boolean getJenisKelamin(boolean jenisKelamin) {
        return jenisKelamin;
    }

    // membuat setter dari objek menikah
    public void setMenikah(boolean Menikah) {
        this.Menikah = Menikah;
    }

    // membuat getter dari objek menikah
    public boolean getMenikah(boolean Menikah) {
        return Menikah;
    }

    // membuat getter tunjangan
    public double getTunjangan() {
        if (Menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    // membuat getter pendapatan
    public double getPendapatan() {
        return getTunjangan();
    }

    // membuat methode toString untuk menampilkan data atau objek yang dipanggil
    public String toString() {
        return "nama                : " + nama + "\nNIK                 : " + NIK + "\nJenis Kelamin       : " + (jenisKelamin ? "Laki-laki" : "Perempuan")
                + "\nPendapatan          : $" + getPendapatan();
    }

}
