import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat rupiah = new DecimalFormat("###,###,###,###.##");

        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Kue Coklat", 10000, 10);
        kueArray[1] = new KuePesanan("Kue Susu", 10000, 10);
        kueArray[2] = new KuePesanan("Kue Keju", 10000, 10);
        kueArray[3] = new KuePesanan("Kue Strawberry", 10000, 10);
        kueArray[4] = new KuePesanan("Kue Lapis", 10000, 10);
        kueArray[5] = new KuePesanan("Kue Bolu", 10000, 10);
        kueArray[6] = new KuePesanan("Kue Donut", 10000, 10);
        kueArray[7] = new KuePesanan("Kue Vanilla", 10000, 10);
        kueArray[8] = new KuePesanan("Kue Nastar", 10000, 10);
        kueArray[9] = new KuePesanan("Kue Cucur", 10000, 10);
        kueArray[10] = new KueJadi("Kue Lemper", 100000, 1);
        kueArray[11] = new KueJadi("Kue Lupis", 10000, 1);
        kueArray[12] = new KueJadi("Kue Putu", 10000, 1);
        kueArray[13] = new KueJadi("Kue Lumpur", 10000, 1);
        kueArray[14] = new KueJadi("Kue Apem", 10000, 1);
        kueArray[15] = new KueJadi("Kue Muffin", 10000, 1);
        kueArray[16] = new KueJadi("Kue Sus", 10000, 1);
        kueArray[17] = new KueJadi("Kue Serabi", 10000, 1);
        kueArray[18] = new KueJadi("Kue Red Velvet", 10000, 1);
        kueArray[19] = new KueJadi("Kue Kastengel", 10000, 1);

        System.out.println("=== DAFTAR KUE ===");
        for (Kue kue : kueArray) {
            System.out.println(kue.getClass().getSimpleName() + kue.toString());
        }

        System.out.println("=== TOTAL HARGA KUE ===");
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }

        System.out.println("Total Harga Semua Kue       : " + rupiah.format(totalHarga));
        System.out.println("");

        System.out.println("=== TOTAL HARGA & BERAT KUE PESANANAN ===");
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;

        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).berat;
            }
        }

        System.out.println("Total Harga Kue Pesananan   : " + rupiah.format(totalHargaKuePesanan));
        System.out.println("Total Berat Kue Pesananan   : " + totalBeratKuePesanan);
        System.out.println("");

        System.out.println("=== TOTAL HARGA & JUMLAH KUE JADI ===");
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;

        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi){
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).jumlah;
            }
        }

        System.out.println("Total Harga Kue Jadi        : " + rupiah.format(totalHargaKueJadi));
        System.out.println("Total Harga Jumlah Jadi     : " + totalJumlahKueJadi);
        System.out.println("");

        System.out.println("=== KUE HARGA TERBESAR ===");
        double hargaTerbesar = 0;
        Kue kueTerbesar = null;

        for (Kue kue : kueArray) {
            if(kue.hitungHarga() > hargaTerbesar){
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Kue dengan harga terbesar: " + kueTerbesar.toString());
    }
}
