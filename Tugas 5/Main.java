import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Testcase Manusia
        Manusia manusia1 = new Manusia("Budi", "1234567890",true , true);
        Manusia manusia2 = new Manusia("Siti", "0987654321", false, true);
        Manusia manusia3 = new Manusia("Joko", "1357924680", true, false);
        System.out.println("=== Testcase Manusia ===");
        System.out.println("Manusia 1:");
        System.out.println(manusia1.toString());
        System.out.println();
        System.out.println("Manusia 2:");
        System.out.println(manusia2.toString());
        System.out.println();
        System.out.println("Manusia 3:");
        System.out.println(manusia3.toString());
        System.out.println();


        // Testcase Mahasiswa FILKOM
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("Udin Petot", true, "192275668125", false, "205150707111077", 2.8);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("Sari Wati", false, "124141244124", false, "2122124889124", 3.2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("Rendra Eka Permana", true, "124141244124", false, "225150707111077", 4);
        System.out.println("=== Testcase Mahasiswa FILKOM ===");
        System.out.println("Mahasiswa FILKOM 1: ");
        System.out.println(mahasiswaFILKOM1.toString());
        System.out.println();
        System.out.println("Mahasiswa FILKOM 2: ");
        System.out.println(mahasiswaFILKOM2.toString());
        System.out.println();
        System.out.println("Mahasiswa FILKOM 3: ");
        System.out.println(mahasiswaFILKOM3.toString());
        System.out.println();

        
        // Testcase Pekerja
        Pekerja pekerja1 = new Pekerja("Jarwo Kiwil", "198786752011", true, false, 1000, LocalDate.of(2021,8,26), 2);
        Pekerja pekerja2 = new Pekerja("Jawir Kendil", "22456789555015", true, true, 1000, LocalDate.of(2014,6,18), 0);
        Pekerja pekerja3 = new Pekerja("Siti Komariah", "2167675450015", false, true, 1000, LocalDate.of(2003,2,22), 10);
        System.out.println("=== Testcase Pekerja ===");
        System.out.println("Pekerja 1: ");
        System.out.println(pekerja1.toString());
        System.out.println();
        System.out.println("Pekerja 2: ");
        System.out.println(pekerja2.toString());
        System.out.println();
        System.out.println("Pekerja 3: ");
        System.out.println(pekerja3.toString());
        System.out.println();


        // Testcase Manager
        Manager Manager1 = new Manager("Evan Sitompul", "1956567879201", true, false, 7500, LocalDate.of(2022, 3, 19),2, "HRD");
        System.out.println("=== Testcase Manager ===");
        System.out.println("Manager 1: ");
        System.out.println(Manager1.toString());
        System.out.println();
    }
}