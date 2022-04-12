import java.util.*;

public class luasArea {
    int luasPersegi;
    int luasSegitiga;
    static int inputUser;
    double luasLingkaran;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        inputUser = input.nextInt();
        if(inputUser == 1){
            int sisi= input.nextInt();
            luasArea persegi = new luasArea(sisi);
            persegi.cetak(); 
        }
        else if(inputUser == 2){
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            luasArea segitiga = new luasArea(alas,tinggi);
            segitiga.cetak();
        }
        else if(inputUser == 3){
            double jarijari = input.nextInt();
            luasArea lingkaran = new luasArea(jarijari);
            lingkaran.cetak();
        }
        else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    
    public luasArea (int sisi){
        this.luasPersegi = sisi*sisi;
    }
    public luasArea (int alas, int tinggi){
        this.luasSegitiga = (alas * tinggi)/2;
    }
    public luasArea (double jarijari){
        if (jarijari % 7 == 0){
            double phi = 22/7;
            double lingkaran = phi * jarijari * jarijari;
            this.luasLingkaran= (int) lingkaran;
        }else{
            double phi = 3.14;
            double lingkaran = phi * jarijari * jarijari;
            this.luasLingkaran= (int) lingkaran;
        }
    }
        
    void cetak(){
        if(inputUser == 1){
            System.out.println(luasPersegi);
        }else if(inputUser == 2){
            System.out.println(luasSegitiga);
        }else if(inputUser == 3){
            System.out.println(luasLingkaran);
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
