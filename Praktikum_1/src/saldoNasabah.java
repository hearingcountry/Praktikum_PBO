import java.io.*;
import java.util.*;

public class saldoNasabah {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double masuk = scan.nextDouble();
       double setor = scan.nextDouble();
       System.out.println(bank(masuk, setor));
    }
    
    public static double bank(double a, double b){
        double biaya_admin = 7000;
        double total = (a + b);
        total -= biaya_admin;
        double bonus = total * 0.0005;
        double hasil_akhir = total + bonus;
        return hasil_akhir;
    }
}