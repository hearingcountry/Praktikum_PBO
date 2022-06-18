package praktikum6;

public class MahasiswaFilkom  extends Manusia{
    private String NIM;
    private double IPK;
    private double beasiswa;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        setNIM(NIM);
        setIPK(IPK);
        setPendapatan();
        setBeasiswa();
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public double getIPK() {
        return IPK;
    }

    public void setBeasiswa() {
        if (IPK >= 3.0 && IPK <= 3.49) {
            beasiswa = 50;
        } else if (IPK >= 3.5 && IPK <= 4.0) {
            beasiswa = 75;
        }
        else{
            beasiswa = 0;
        }
    }

    public double getBeasiswa() {
        return beasiswa;
    }

    
    public String getStatus(){
        String ambilAngkatan = getNIM().substring(0, 2);
        String jurusan = getNIM().substring(6, 7);
        
        switch(jurusan){
            case "2":
            jurusan = "Teknik Meniup Gelembung";
            break;
            case "3":
                jurusan = "Teknik Berburu Ubur Ubur";
                break;
            case "4":   
                jurusan = "Sistem Perhamburgeran";
                break;
            case "6":
            jurusan = "Pendidikan Chum Bucket";
            break;
            case "7":   
            jurusan = "Teknologi Telepon Kerang";
            break;
        }
        return jurusan + ", " + "20" +ambilAngkatan;
    }
    
    @Override
    public void ToString(){
        System.out.println("\nObjek Mahasiswa Filkom");
        System.out.println("==============================");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIK\t\t: " + getNIK());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Pendapatan\t: " + (getPendapatan() + getBeasiswa())  + "$");
        System.out.println("NIM\t\t: " + getNIM());
        System.out.println("IPK\t\t: " + getIPK());
        System.out.println("Status\t\t: " + getStatus());
    }
}