import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data karyawan
        System.out.println("=== INFORMASI KARYAWAN ===");
        System.out.print("Masukkan nama karyawan: ");
        String name =scanner.nextLine();

        System.out.print("Masukkan nomor registrasi karyawan: ");
        int registrationNumber = scanner.nextInt();

        System.out.print("Masukkan gaji per bulan karyawan: RP ");
        int salaryPerMonth = scanner.nextInt();

        System.out.print("Masukkan jumlah invoice belanjaan: ");
        int numInvoices = scanner.nextInt();

        System.out.println("");
        System.out.println("=== LIST PRODUK ===");
        Invoice[] invoices = new Invoice[numInvoices];
        for (int i = 0; i < numInvoices; i++) {
            System.out.println("Masukkan informasi invoice ke-" + (i + 1) + ":");
            System.out.print("Nama produk: ");
            String productName = scanner.next();

            System.out.print("Jumlah produk: ");
            int quantity = scanner.nextInt();

            System.out.print("Harga per item: ");
            int pricePerItem = scanner.nextInt();
            
            System.out.println("");

            invoices[i] = new Invoice(productName, quantity, pricePerItem);
        }

        // Membuat objek Employee
        Employee employee = new Employee(registrationNumber, "", salaryPerMonth, invoices);

        // Menampilkan informasi karyawan
        System.out.println("Informasi Karyawan:");
        System.out.println("Nomor Registrasi: " + employee.getRegistrationNumber());
        System.out.println("Nama: " + employee.getName());
        System.out.println("Gaji per Bulan: " + employee.getSalaryPerMonth());

        // Menampilkan detail belanjaan dan total gaji setelah dipotong belanjaan
        System.out.println("Detail Belanjaan:");
        Invoice[] employeeInvoices = employee.getInvoices();
        for (int i = 0; i < employeeInvoices.length; i++) {
            Invoice invoice = employeeInvoices[i];
            System.out.println("Invoice ke-" + (i + 1));
            System.out.println("Nama Produk: " + invoice.getProductName());
            System.out.println("Jumlah: " + invoice.getQuantity());
            System.out.println("Harga per Item: " + invoice.getPricePerItem());
            System.out.println("Total: " + invoice.getPayableAmount());
            System.out.println();
        }

        System.out.println("Total Gaji Setelah Potongan Belanjaan: " + employee.getPayableAmount());

        scanner.close();
    }
}