package uts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class nomor3 {
    static InputStreamReader inp = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inp);
    static ArrayList<Integer> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        
        System.out.print("Masukkan angka pertama : ");
        int a = Integer.parseInt(input.readLine());
        list.add(a);
        System.out.print("Masukkan angka kedua : ");
        int b = Integer.parseInt(input.readLine());
        list.add(b);
        System.out.print("Masukkan angka ketiga : ");
        int c = Integer.parseInt(input.readLine());
        list.add(c);
        
        Collections.sort(list);
        
        System.out.println("Setelah Sorting :");
        for(int i: list){
            System.out.print(i);
        }
    }
}
