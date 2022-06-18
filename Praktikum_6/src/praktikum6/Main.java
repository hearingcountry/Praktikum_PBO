package praktikum6;

public class Main {
    public static void main(String[] args) throws Exception {
        // Objek Manusia
        Manusia Andi = new Manusia("Andi", "123456789", true, true);
        Andi.ToString();

        Manusia Budi = new Manusia("Budi", "234567890", true, false);
        Budi.ToString();
        
        Manusia Eka = new Manusia("Eka", "345678901", false, true);
        Eka.ToString();

        // Objek Mahaiswa Filkom
        MahasiswaFilkom yoga = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        yoga.ToString();

        MahasiswaFilkom iqbal = new MahasiswaFilkom("Ahmad Iqbal", "351923848239", true, false, "195150701111019", 3.40);
        iqbal.ToString(); 

        MahasiswaFilkom kiki = new MahasiswaFilkom("Kiki", "321343431456", false, false, "1792375238478", 4.0);
        kiki.ToString();      

        // Objek Pekerja
        Pekerja maulana = new Pekerja(7, 22, "195102439283", "Maulana", "351717969", true, true);
        maulana.ToString();

        Pekerja hidayat = new Pekerja(10, 28, "216102639283", "Hidayat", "361546472", true, true);
        hidayat.ToString();

        Pekerja sari = new Pekerja(6, 12, "34756384234", "Sari", "21345464", false, true);
        sari.ToString();

        // Objek Manajer
        Manajer lyra = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        lyra.ToString();

        Manajer ardi = new Manajer(8, 30, "114546456464", "Ardi", "4234632452", true, false, 1200);
        ardi.ToString();

        Manajer rina = new Manajer(7, 25, "123465464564", "Rina", "3231451423", false, false, 1000);
        rina.ToString();
    }
}
