package posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main{
    static InputStreamReader inp = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inp);
    static ArrayList<baju> list = new ArrayList<>();
    
    static void menu() throws IOException{
        System.out.println("+---------------------------------------+");
        System.out.println("|          =====   MENU   =====         |");
        System.out.println("+---------------------------------------+");
        System.out.println("|   [1] Tambah                          |");
        System.out.println("|   [2] Lihat                           |");
        System.out.println("|   [3] Ubah                            |");
        System.out.println("|   [4] Hapus                           |");
        System.out.println("|   [5] Keluar                          |");
        System.out.println("+---------------------------------------+");
        System.out.print("Pilih Menu : ");
        int select = Integer.valueOf(input.readLine());
        
        switch(select){
            case 1 -> tambah();
            case 2 -> tampil();
            case 3 -> edit();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("Tidak ada pilihan..."); 
        }
    }
    
    static void tambah() throws IOException{
        baju createBaju = new baju();
        System.out.println("+---------------------------------------+");
        System.out.println("|      =====   TAMBAH BAJU   =====      |");
        System.out.println("+---------------------------------------+");
        System.out.print("| Model baju : ");
        createBaju.setmodel(input.readLine());
        System.out.print("| Ukuran : ");
        createBaju.setukuran(input.readLine());
        System.out.print("| Warna : ");
        createBaju.setwarna(input.readLine());
        System.out.print("| Jumlah : ");
        createBaju.setjumlah(Integer.parseInt(input.readLine()));
        createBaju.buatBaju();
        createBaju.buatSelesai();
        list.add(createBaju);
    }
    
    static void tampil(){
        if(list.isEmpty()){
            System.out.println("Tidak ada data...");
        }
        
        else{
            System.out.println("+---------------------------------------+");
            System.out.println("|      =====   LIST PESANAN   =====     |");
            System.out.println("+---------------------------------------+");
            System.out.println("| No.\tModel\tUkuran\tWarna\tJumlah   |");
            
            for(int i = 0; i < list.size(); i++){
                System.out.println("| " + (i + 1) + "\t" + list.get(i).getmodel() + "\t" + list.get(i).getukuran() + "\t" + list.get(i).getwarna() + "\t" + list.get(i).getjumlah() + "\t |");
            }
        }
    }
    
    static void edit() throws IOException{
        int select;
        tampil();
        System.out.println("+---------------------------------------+");
        System.out.println("|      =====   UBAH PESANAN   =====     |");
        System.out.println("+---------------------------------------+");
        System.out.print("| Pilih nomor pesanan : ");
        
        select = Integer.parseInt(input.readLine());
        select--;
        System.out.print("| Model baju : ");
        list.get(select).setmodel(input.readLine());
        System.out.print("| Ukuran : ");
        list.get(select).setukuran(input.readLine());
        System.out.print("| Warna : ");
        list.get(select).setwarna(input.readLine());
        System.out.print("| Jumlah : ");
        list.get(select).setjumlah(Integer.parseInt(input.readLine()));
        System.out.println("| Pesanan telah diperbarui...           |");
        System.out.println("+---------------------------------------+");
    }
    
    static void hapus() throws IOException{
        int select;
        tampil();
        System.out.println("+---------------------------------------+");
        System.out.println("|     =====   HAPUS PESANAN   =====     |");
        System.out.println("+---------------------------------------+");
        System.out.print("| Pilih nomor pesanan : ");
        
        select = Integer.parseInt(input.readLine());
        select--;
        list.remove(select);
    }
    
    public static void main(String[] args) throws IOException{
        System.out.println("+---------------------------------------+");
        System.out.println("|           Selamat datang di           |");
        System.out.println("|           GERAI KAOS TIARA            |");
        while(true){
            menu();
        }
    }
}

