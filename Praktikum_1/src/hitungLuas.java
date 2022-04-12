import java.io.*;
import java.util.*;

public class hitungLuas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        if(input == 1){
            int sisi = scan.nextInt();
            System.out.println(persegi(sisi));
        }
        else if(input == 2){
            int alas = scan.nextInt();
            int tinggi = scan.nextInt();
            System.out.println(segitiga(alas, tinggi));
        }
        else if(input == 3){
            int jari = scan.nextInt();
            System.out.println(lingkaran(jari));
        }
        else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    
    static int persegi(int a){
        return a*a;
    }
    
    static int segitiga(int a, int b){
        return (a*b)/2;
    }
    
    static double lingkaran(double a){
        double hasil;
        if(a%7 == 0){
            hasil = 22/7 * a * a;
        }
        else{
            hasil = 3.14 * a * a;
        }
        return hasil;
    }
}
