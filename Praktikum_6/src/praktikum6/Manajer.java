package praktikum6;

public class Manajer extends Pekerja{

    private int lamaKerja;

    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        setLamaKerja(lamaKerja);
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void ToString(){
        System.out.println("\nObjek Manager");
        System.out.println("==============================");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIK\t\t: " + getNIK());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Pendapatan\t: " + ((getGaji() + getBonus()) + 15) + "$");
        System.out.println("Bonus\t\t: " + (getBonus() + (getBonus() * 0.3)) + "$");
        System.out.println("Gaji\t\t: " + getGaji() + "$");
        System.out.println("Status\t\t: " + getStatus());
        System.out.println("Lama Kerja\t: " + getLamaKerja() + " hari");
    }
    
}
