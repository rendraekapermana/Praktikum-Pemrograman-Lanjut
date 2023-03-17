public class Buku {
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

    public Buku(String judul, String penulis, String kategori, String tahunTerbit, String penerbit, String isbn, String pages, String berat, String panjang, String lebar) {
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
    }
    

    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public String getKategori() {
        return kategori;
    }
    
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public String getTahunTerbit() {
        return tahunTerbit;
    }
    
    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getPenerbit() {
        return penerbit;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPages() {
        return pages;
    }
    
    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getBerat() {
        return berat;
    }
    
    public void setBerat(String berat) {
        this.berat = berat;
    }

    public String getPanjang() {
        return panjang;
    }
    
    public void setPanjang(String panjang) {
        this.panjang = panjang;
    }

    public String getLebar() {
        return lebar;
    }
    
    public void setLebar(String lebar) {
        this.lebar = lebar;
    }

    public String toString() {
        return "Judul           : " + judul + "\nPenulis         : " + penulis + "\nTahun Terbit    : " + tahunTerbit + "\nPenerbit        : " + penerbit + "\nISBN            : " + isbn + "\nPages           : " + pages + "\nBerat           : " + berat + " pounds " + "\nPanjang         : " + panjang + " inches " + "\nLebar           : " + lebar + " inches";
    }
}
