package praktikum6;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    
    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        setNIP(NIP);
        setJamKerja(jamKerja);
        setHariKerja(hariKerja);
        setGaji();
        setBonus();
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setGaji() {
        this.gaji = getJamKerja() * getHariKerja() * 15;
    }

    public double getGaji() {
        return gaji;
    }

    public void setBonus() {
        double bonusLembur = 0;
        double bonusLibur = 0;
        if (getHariKerja() > 20){
            if(getJamKerja() > 7){
                bonusLembur = 20 * (getJamKerja() - 7) * 7;
                bonusLibur = (getHariKerja() - 20) * getJamKerja() * 20;
            }
            else{
                bonusLembur = 0;
                bonusLibur = (getHariKerja() - 20) * getJamKerja() * 20;
            }
        }
        else{
            if(getJamKerja() > 7){
                bonusLembur = getHariKerja() * (getJamKerja() - 7) * 7;
                bonusLibur = 0;
            }
            else{
                bonusLembur = 0;
                bonusLibur = 0;
            }
        }
        this.bonus = bonusLembur + bonusLibur;
    }

    public double getBonus() {
        return bonus;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public String getStatus(){
        String nipPertama = NIP.substring(0, 1);
        String nipKetiga = NIP.substring(2, 3);
        String nipKetujuh = NIP.substring(6,7);
        switch(nipPertama){
            case "1":
                nipPertama = "Mondstadt";
                break;
            case "2":
                nipPertama = "Liyue";
                break;
            case "3":
                nipPertama = "Inazuma";
                break;
            case "4":
                nipPertama = "Sumeru";
                break;
            case "5":
                nipPertama = "Fontaine";
                break;
            case "6":
                nipPertama = "Natlan";
                break;
            case "7":
                nipPertama = "Snezhnaya";
                break;
        }

        switch(nipKetujuh){
            case "1":
                nipKetujuh = "Pemasaran";
                break;
            case "2":
                nipKetujuh = "Humas";
                break;
            case "3":
                nipKetujuh = "Riset";
                break;
            case "4":
                nipKetujuh = "Teknologi";
                break;
            case "5":
                nipKetujuh = "Personalia";
                break;
            case "6":
                nipKetujuh = "Akademik";
                break;
            case "7":
                nipKetujuh = "Administrasi";
                break;
            case "8":
                nipKetujuh = "Operasional";
                break;
            case "9":
                nipKetujuh = "Pembangunan";
                break;
        }

        return nipKetujuh + ", " + nipPertama + " cabang ke-" + nipKetiga;
    }

    @Override
    public void ToString() {
        System.out.println("\nObjek Pekerja");
        System.out.println("==============================");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIK\t\t: " + getNIK());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Pendapatan\t: " + (getGaji() + getBonus()) + "$");
        System.out.println("Bonus\t\t: " + getBonus() + "$");
        System.out.println("Gaji\t\t: " + getGaji() + "$");
        System.out.println("Status\t\t: " + getStatus());
    }
}
