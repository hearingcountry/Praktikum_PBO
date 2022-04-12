import java.util.Scanner;

class Baju{
    String jenis;
    int harga;
    int jumlah;

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;


    void hargaa(){
        if(jumlah > 100){
            this.harga = 950000;
        }
        else{
            this.harga = bajua;
        }
    }

    void hargab(){
        if(jumlah > 100){
            this.harga = 120000;
        }
        else{
            this.harga = bajub;
        }
    }

    void hargac(){
        if(jumlah > 100){
            this.harga = 160000;
        }
        else{
            this.harga = bajuc;
        }
    }

    void display(){
        if(jenis.equalsIgnoreCase("a"))
            hargaa();
        else if(jenis.equalsIgnoreCase("b"))
            hargab();
        else if(jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang Anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }

    void menu(){
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajua);
        System.out.println("Baju B dengan harga " + bajub);
        System.out.println("Baju C dengan harga " + bajuc);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Baju baju = new Baju();
        baju.menu();
        System.out.print("Baju yang akan Anda beli bertipe : ");
        baju.jenis = input.nextLine();

        System.out.print("Jumlah baju yang akan Anda beli adalah : ");
        baju.jumlah = input.nextInt();

        baju.display();
        input.close();
    }
}
