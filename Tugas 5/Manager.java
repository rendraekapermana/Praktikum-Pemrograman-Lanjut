import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    // membuat constructor dari class Manager
    public Manager (String nama, String NIK, boolean jenisKelamin, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen){
        super(nama, NIK, jenisKelamin, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // membuat setter dari objek departemen
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // membuat getter dari objek departemen
    public String getDepartemen() {
        return departemen;
    }

    public double getPendapatan() {
        return super.getPendapatan() * 0.1;
    }

    public String toString() {
        return super.toString() + "\nDepartemen          : " + departemen;
    }
    
}
