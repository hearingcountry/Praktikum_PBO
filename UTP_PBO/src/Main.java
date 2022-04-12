//Nama Praktikan : Dicky Surya Nanda
//Kelas Praktikan : PTI - B

import java.util.Scanner;

class Main {

    // Daftar Admin
    static Admin[] admins = new Admin[2];

    // Daftar Layanan
    static Layanan[] layanans = new Layanan[5];

    // Daftar Antrian
    static Antrian[] antrians = new Antrian[10];

    // Scanner
    static final Scanner Sc = new Scanner(System.in);

    // Helper index in antrian
    static int indexAntrian;

    // Main Function
    public static void main(String args[]) {
        Helper.initialize();
        // Authentication
        boolean isAuthenticated = false;
        String username, password;
        do {
            System.out.println("Selamat datang pada laman login terminal sederhana!");
            System.out.printf("Username\t: ");
            username = Sc.nextLine();
            System.out.printf("Password\t: ");
            password = Sc.nextLine();
            isAuthenticated = Helper.authentication(username, password);
        } while (!isAuthenticated);

        // Menu terminal
        boolean loopMenu = true;
        do {
            System.out.println("Selamat datang pada aplikasi terminal sederhana!");
            System.out.println("Silakan pilih salah satu menu di bawah ini:");
            System.out.println("1. Menampilkan semua antrian pada hari ini");
            System.out.println("2. Menambahkan antrian");
            System.out.println("3. Log Out dari sistem");

            System.out.print("Masukan Anda: ");
            String choice = Sc.nextLine();
            switch (choice) {
                case "1":
                    showAllAntrian();
                    break;

                case "2":
                    addAnAntrian();
                    break;

                case "3":
                    loopMenu = false;
                    Sc.close();
                    break;
                default:
                    System.out
                            .println("Sistem menerima masukan yang tidak valid. Harap coba masukan angka yang tertera");
                    break;
            }
        } while (loopMenu);
    }

    // Function to showAllAntrian
    // Jangan diubah
    private static void showAllAntrian() {
        System.out
                .println("==========================================================================================");
        if (antrians[0] == null) {
            System.out.println("Tidak ada daftar layanan");
        }
        for (Antrian antrian : antrians) {
            if (antrian == null) {
                break;
            }

            // Print to string
            System.out.println(antrian.toString());
        }
        System.out
                .println("==========================================================================================");
    }

    // Function to addAnAtrian
    // Jangan diubah
    private static void addAnAntrian() {
        showAllLayanan();

        String name, phoneNumber, licenseNumber;
        System.out.printf("Masukan Nama Pemesan\t: ");
        name = Sc.nextLine();
        System.out.printf("Masukan Nomor Telepon\t: ");
        phoneNumber = Sc.nextLine();
        System.out.printf("Masukan Nomor Plat\t: ");
        licenseNumber = Sc.nextLine();
        // Add new antrian
        Antrian antrian = new Antrian(name, phoneNumber, licenseNumber);
        // indexAntrian++;

        // Dowhile
        boolean loopMenu = true;
        int indexAdd = 0;
        do {
            if (indexAdd == 3) {
                loopMenu = false;
                System.out.println("Mohon maaf, maksimum layanan per orang adalah 3 layanan");
                break;
            }
            System.out.print("Masukkan Nomor Layanan yang ingin ditambahkan: ");
            int nomorLayanan = Sc.nextInt();
            Sc.nextLine();
            antrian.addLayanan(layanans[(nomorLayanan - 1)]);

            System.out.println("Apakah Anda masih ingin menambahkan layanan? (y/n)");
            char lanjut = Sc.next().charAt(0);
            Sc.nextLine();

            switch (lanjut) {
                case 'y':
                    System.out.println("Silakan isi kembali!");
                    indexAdd++;
                    break;
                case 'n':
                    loopMenu = false;
                    break;

                default:
                    System.out.println("Masukan Anda tidak valid! Menghentikan menu memasukkan layanan.");
                    loopMenu = false;
                    break;
            }

        } while (loopMenu);
        antrians[indexAntrian] = antrian;
        indexAntrian++;
    }

    // Function to showAllLayanan
    // Jangan diubah
    private static void showAllLayanan() {
        System.out.println("Daftar Layanan");
        int index = 1;
        for (Layanan layanan : layanans) {
            if (layanan == null) {
                break;
            }

            // Print to string
            System.out.println("----------------------------------------------------------\n");
            System.out.printf("Layanan Nomor\t: %d\n", index);
            System.out.println(layanan.toString());
            System.out.println("----------------------------------------------------------\n");
            index++;
        }
    }
}