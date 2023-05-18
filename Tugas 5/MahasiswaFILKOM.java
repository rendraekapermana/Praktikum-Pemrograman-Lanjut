//extends berfungsi untuk memanggil objek yang ada pada class yang ingin dipanggil contohnya manusia

public class MahasiswaFILKOM extends Manusia {
    // inisiasi objek pada class MahasiswaFILKOM
    private String NIM;
    private double IPK;

    // membuat constructor dari class MahasiswaFILKOM
    public MahasiswaFILKOM(String nama, boolean jenisKelamin,String NIK, boolean Menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, Menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    // membuat setter dari objek NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // membuat getter dari objek NIM
    public String getNIM() {
        return NIM;
    }

    // membuat setter dari objek IPK
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    // membuat getter dari objek IPK
    public double getIPK() {
        return IPK;
    }

    // membuat getter dari objek Status
    public String getStatus() {
        String prodi;
        int angkatan;

        // pada NIM.substring akan diambil nilai dari index ke 6 dan 7
        String prodiCode = NIM.substring(6, 7);
        // lalu pada switch ini mengambil dari nilai substring yang ada pada index ke 6 dan 7 untuk menentukan prodinya
        switch (prodiCode) {
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "unknown";
                break;
        }
        // Integer.parseInt adalah methode untuk mengubah String ke integer
        // lalu NIM.substring disitu digunakan untuk mencari tahun angkatan dan setelah itu angka yang didapat di tambah 2000
        angkatan = Integer.parseInt(NIM.substring(0,2)) + 2000;
        return prodi + ", " + angkatan;
    }

    // membuat getter dari objek beasiswa
    public double getBeasiswa(){
        if(IPK >= 3.0  && IPK <= 3.5){
            return 50;
        } else if (IPK >= 3.5 && IPK <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    // membuat methode toString untuk menampilkan data atau nilai yang dipanggil
    public String toString(){
        return super.toString() + "\nNIM                 : " + NIM + "\nIPK                 : " + IPK + "\nStatus              : " + getStatus();
    }
}
