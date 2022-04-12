import java.io.*;
import java.util.*;

public class suratKaisar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int key = input.nextInt();
        System.out.println(enkripsi(str, key));
    }
    
    public static String enkripsi(String stringInput, int kode) {
        String output = "";
        for(int i = 0; i < stringInput.length(); i++) {
                char c = (char)(stringInput.charAt(i));
            if (c >= 'A' && c <= 'Z') {     
                output += (char)((c - 'A' + kode) % 26 + 'A');
            }else if (c >= 'a' && c <= 'z') {
                output += (char)((c - 'a' + kode) % 26 + 'a');
            }else {
                output += c;
            }
        }
        return output.toString();
    }
}