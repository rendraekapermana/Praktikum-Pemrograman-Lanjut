import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // membuat constructor dari class Pekerja
    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean Menikah, double gaji, LocalDate tahunMasuk,
            int jumlahAnak) {
        super(nama, NIK, jenisKelamin, Menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // membuat setter dari objek gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // membuat getter dari objek gaji
    public double getGaji() {
        return gaji;
    }

    // membuat setter dari objek tahunMasuk
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    // membuat getter dari objek tahunMasuk
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    // membuat setter dari JumlahAnak
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // membuat getter dari JumlahAnak
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    // membuat getter bonus
    public double getBonus() {
        int tahunKerja = LocalDate.now().getYear() - tahunMasuk.getYear();

        if (tahunKerja >= 0 && tahunKerja <= 5) {
            return gaji * 0.05;
        } else if (tahunKerja >= 5 && tahunKerja <= 10) {
            return gaji * 0.1;
        } else if (tahunKerja >= 10) {
            return gaji * 0.15;
        } else {
            return 0;
        }
    }

    // membuat getter pendapatan
    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }

    // membuat methode toString untuk menampilkan data atau nilai yang dipanggil
    public String toString() {
        return super.toString() + "\nTahun Masuk         : " + tahunMasuk.getYear() + "\nJumlah Anak         : " + jumlahAnak
                + "\nGaji                : $" + gaji;
    }

}
