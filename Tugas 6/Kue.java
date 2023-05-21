import java.text.DecimalFormat;

abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    DecimalFormat rupiah = new DecimalFormat("###,###,###,###.##");

    public String toString() {
        return "\nNama     : " + nama + " \nHarga    : RP " + rupiah.format(harga) + "\n";
    }

}