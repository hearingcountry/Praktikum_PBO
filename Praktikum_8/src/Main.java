import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Game Defend FILKOM!!");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        int role = 0;
        int count = 0;
        boolean start = true;
        // perulangan untuk memilih menu yang benar
        while (true) {
            start = true;
            System.out.println("List daftar karakter : "
                    + "\n1. Magician"
                    + "\n2. Healer"
                    + "\n3. Warrior");
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
            try {
                String roles = input.nextLine();
                role = Integer.valueOf(roles);
            } catch (Exception e) {
                start = false;
            }

            if (start && role > 0 && role < 4) {
                break;
            }

            else if (!start) {
                System.out.println("Tolong masukkan angka ya !!");
            }

            else {
                System.out.println("Tolong pilih karakter yang tersedia !!");
            }
        }
        // Instansiasi objek titan
        Titan tn = new Titan();
        Character cr = null;
        System.out.printf("Selamat datang, %s !%n",
                nama);
        // pengecekan role
        switch (role) {
            case 1:
                cr = new Magician();
                cr.info();
                break;
            case 2:
                cr = new Healer();
                ((Healer) cr).info();
                break;
            case 3:
                cr = new Warrior();
                ((Warrior) cr).info();
                break;
            default:
        }
        while (tn.getHP() > 0 && cr.getHP() > 0) {
            count++;
            System.out.printf("========== TURN %d==========%n", count);
            System.out.println("Enemy's HP\t: " +
                    tn.getHP());
            System.out.printf("%s's HP\t: %d%n",
                    nama, cr.getHP());
            if (count % 2 == 0 && cr instanceof Healer) {
                ((Healer) cr).heal();
            }
            if (tn.attack() == true) {
                cr.receiveDamage(tn.getAttack());
            }
            if (cr.attack() == true) {
                tn.receiveDamage(cr.getAttack());
            }
        }
        if (tn.getHP() <= 0) {
            tn.setHP(0);
        } else if (cr.getHP() <= 0) {
            cr.setHP(0);
        }
        String hasil = tn.getHP() <= 0 ? nama : "Titan";
        System.out.println(hasil + " menang\n");
        System.out.println("========== PLAYER ==========");
        cr.info();
        System.out.println("\n========== MUSUH ==========");
        tn.info();
    }
}