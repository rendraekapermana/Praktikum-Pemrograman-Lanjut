public class Book {
    private String judul;
    private String penulis;
    private String kategori;
    private String tahunTerbit;
    private String penerbit;
    private String isbn;
    private String pages;
    private String berat;
    private String panjang;
    private String lebar;
    private String sinopsis;

    public Book(String judul, String penulis, String kategori, String tahunTerbit, String penerbit, String isbn,
            String pages, String berat, String panjang, String lebar, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.isbn = isbn;
        this.pages = pages;
        this.berat = berat;
        this.panjang = panjang;
        this.lebar = lebar;
        this.sinopsis = sinopsis;
    }

    public String getJudul(){
        return judul;
    }

    private int hitungKata() {
        String[] words = sinopsis.split("\s+");
        return words.length;
    }

    public Book copy(){
        return new Book(judul, penulis, kategori, tahunTerbit, penerbit, isbn, pages, berat, panjang, lebar, sinopsis);
    }

    public void printDetail() {
        System.out.println("Judul                           : " + judul);
        System.out.println("Penulis                         : " + penulis);
        System.out.println("Kategori                        : " + kategori);
        System.out.println("Tahun Terbit                    : " + tahunTerbit);
        System.out.println("Penerbit                        : " + penerbit);
        System.out.println("ISBN                            : " + isbn);
        System.out.println("Pages                           : " + pages);
        System.out.println("Berat                           : " + berat);
        System.out.println("Panjang                         : " + panjang);
        System.out.println("Lebar                           : " + lebar);
        System.out.println("Sinopsis                        : " + sinopsis);
        System.out.println("Jumlah kata                     : " + hitungKata());
    }
}
