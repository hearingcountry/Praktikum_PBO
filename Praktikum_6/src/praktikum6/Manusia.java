package praktikum6;
public class Manusia {
    private String nama;
    private String NIK;
    private String jenisKelamin;
    private boolean menikah;
    private double tunjangan;
    private double pendapatan;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        setNama(nama);
        setNIK(NIK);
        setJenisKelamin(jenisKelamin);
        setMenikah(menikah);
        setTunjangan();
    }

    public void setNama(String nama) {
       this.nama = nama;
    }

    public String getNama() {
       return nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        if(jenisKelamin == true){
            this.jenisKelamin = "Laki-laki";
        } else {
            this.jenisKelamin = "Perempuan";
        }
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public void setTunjangan() {
        if (jenisKelamin.equalsIgnoreCase("Laki-laki") && menikah == true) {
            tunjangan = 25.0;
        } 
        else if(jenisKelamin.equalsIgnoreCase("Perempuan") && menikah == true) {
            tunjangan = 20.0;
        }
        else{
            tunjangan = 15.0;
        }
    }

    public double getTunjangan() {
        return tunjangan;
    }
    public void setPendapatan() {
        if (jenisKelamin.equalsIgnoreCase("Laki-laki") && menikah == true) {
            pendapatan = 25.0;
        } 
        else if(jenisKelamin.equalsIgnoreCase("Perempuan") && menikah == true) {
            pendapatan = 20.0;
        }
        else{
            pendapatan = 15.0;
        }
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void ToString(){
        System.out.println("\nObjek Manusia");
        System.out.println("==============================");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIK\t\t: " + getNIK());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Pendapatan\t: " + getTunjangan() + "$");
    }
}

