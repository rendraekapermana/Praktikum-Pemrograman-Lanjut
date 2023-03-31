import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di program game pertempuran");
        System.out.println("==========================================");

        Hero hero1 = new Hero();
        System.out.print("Masukkan nama hero 1: ");
        hero1.setName(input.nextLine());
        System.out.print("Masukkan HP hero 1: ");
        hero1.setHp(input.nextDouble());
        System.out.print("Masukkan attack hero 1: ");
        hero1.setAtk(input.nextDouble());
        System.out.print("Masukkan defense hero 1: ");
        hero1.setDefense(input.nextDouble());

        System.out.println("");

        System.out.print("Masukkan nama hero 2: ");
        String name = input.next();
        System.out.print("Masukkan HP hero 2: ");
        double hp = input.nextDouble();
        System.out.print("Masukkan attack hero 2: ");
        double atk = input.nextDouble();
        System.out.print("Masukkan defense hero 2: ");
        double defense = input.nextDouble();
        Hero hero2 = new Hero(name, hp, atk, defense);
        System.out.println("");

        int round = 1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("===================================");
            System.out.println("Ronde " + round + ":");
            hero1.attack(hero2);
            if (hero2.getHp() > 0) {
                hero2.attack(hero1);
            }
            round++;
        }

        if (hero1.getHp() > 0) {
            System.out.println("Pertarungan telah usai!");
            System.out.println(hero2.getName() + " kalah!");
            System.out.println("==========================");
            System.out.println(hero1.getName() + " menang!");
        } else {
            System.out.println("Pertarungan telah usai!");
            System.out.println(hero1.getName() + " kalah!");
            System.out.println("==========================");
            System.out.println(hero2.getName() + " menang!");
        }

        input.close();
    }
}
