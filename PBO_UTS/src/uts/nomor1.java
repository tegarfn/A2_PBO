package uts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nomor1 {
    static InputStreamReader inp = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inp);
    
    public static void main (String[] args) throws IOException{
        System.out.print("Masukkan Jumlah Anak Ayam : ");
        int jumlah = Integer.parseInt(input.readLine());
        
        for(int i = jumlah; i >= 1; i--){
            System.out.println("Tek kotek kotek kotek….");
            System.out.println("Anak ayam turun berkotek");
            System.out.println("Anak ayam turun " + i);
            System.out.println("Mati satu tinggal " + (i-1));
            System.out.println("");
        }
    }
}
