import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int JaketA = 100000;
        final int JaketB = 125000;
        final int JaketC = 175000;

        System.out.print("Masukkan jumlah Jaket A yang ingin dibeli: ");
        int JumlahJaketA = input.nextInt();

        System.out.print("Masukkan jumlah Jaket B yang ingin dibeli: ");
        int JumlahJaketB = input.nextInt();

        System.out.print("Masukkan jumlah Jaket C yang ingin dibeli: ");
        int JumlahJaketC = input.nextInt();

        int  totalHargaA = 95000 * JumlahJaketA;
        int totalHargaB = 120000 * JumlahJaketB;
        int totalHargaC = 160000 * JumlahJaketC;

        String HargaJaketA = String.format("%,d", JaketA * JumlahJaketA);
        String HargaJaketB = String.format("%,d", JaketB * JumlahJaketB);
        String HargaJaketC = String.format("%,d", JaketC * JumlahJaketC);

        String HargaDiskonA = String.format("%,d", totalHargaA);
        String HargaDiskonB = String.format("%,d", totalHargaB);
        String HargaDiskonC = String.format("%,d", totalHargaC);



        if(JumlahJaketA > 100){
            System.out.println("Total harga jaket A: " +  HargaDiskonA);
        } else {
            System.out.println("Total harga jaket A: " + HargaJaketA);
        }

        if(JumlahJaketB > 100){
            System.out.println("Total harga jaket B: " +  HargaDiskonB );
        } else {
            System.out.println("Total harga jaket B: " + HargaJaketB);
        }

        if(JumlahJaketC > 100){
            System.out.println("Total harga jaket C: " +   HargaDiskonC);
        } else {
            System.out.println("Total harga jaket C: " + HargaJaketC);
        }
    input.close();
    }
}