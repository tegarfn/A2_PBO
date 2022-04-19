package posttest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main{
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(isr);
    static ArrayList<baju> listbaju = new ArrayList<>();
    static ArrayList<jaket> listjaket = new ArrayList<>();
    
    static void menu() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|              =====   MENU   =====             |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   [1] Tambah                                  |");
        System.out.println("|   [2] Lihat                                   |");
        System.out.println("|   [3] Ubah                                    |");
        System.out.println("|   [4] Hapus                                   |");
        System.out.println("|   [5] Keluar                                  |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Menu : ");
        int select = Integer.valueOf(input.readLine());
        
        switch(select){
            case 1 -> tambah();
            case 2 -> tampil();
            case 3 -> edit();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("| Tidak ada pilihan..."); 
        }
    }
    
    static void tambah() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|         =====   TAMBAH PAKAIAN   =====        |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Tipe Pakaian :                        |");
        System.out.println("|   [1] Baju                                    |");
        System.out.println("|   [2] Jaket                                   |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        int select = Integer.valueOf(input.readLine());
        
        switch(select){
            case 1 -> tambahbaju(); 
            case 2 -> tambahjaket();
            default -> System.out.println("| Tidak ada pilihan..."); 
            }
        }
    
    static void tambahbaju() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|          =====   TAMBAH BAJU   =====          |");
        System.out.println("+-----------------------------------------------+");
        String tipe = "Baju";
        System.out.print("| Model : ");
        String model = input.readLine();
        System.out.print("| Ukuran : ");
        String ukuran = input.readLine();
        System.out.print("| Warna : ");
        String warna = input.readLine();
        System.out.print("| Jumlah : ");
        int jumlah = Integer.parseInt(input.readLine());
        baju b = new baju(tipe, model, ukuran, warna, jumlah);
        b.buat(jumlah);
        b.selesai();
        listbaju.add(b);
    }
    static void tambahjaket()throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|          =====   TAMBAH JAKET   =====         |");
        System.out.println("+-----------------------------------------------+");
        String tipe = "Jaket";
        System.out.print("| Model : ");
        String model = input.readLine();
        System.out.print("| Ukuran : ");
        String ukuran = input.readLine();
        System.out.print("| Warna : ");
        String warna = input.readLine();
        System.out.print("| Jumlah : ");
        int jumlah = Integer.parseInt(input.readLine());
        jaket j = new jaket(tipe, model, ukuran, warna, jumlah);
        j.buat(jumlah);
        j.selesai();
        listjaket.add(j);
    }
    
    static void tampil() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|         =====   LIHAT PESANAN   =====         |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Tipe Pakaian :                        |");
        System.out.println("|   [1] Baju                                    |");
        System.out.println("|   [2] Jaket                                   |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        int select = Integer.valueOf(input.readLine());
        switch(select){
            case 1 -> tampilbaju();
            case 2 -> tampiljaket();
        }
    }
    
    static void tampilbaju(){
        if(listbaju.isEmpty()){
            System.out.println("| Tidak ada data...");
        }else{
            System.out.println("+-----------------------------------------------+");
            System.out.println("|           =====   LIST BAJU   =====           |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("| No.\ttipe\tModel\tUkuran\tWarna\tJumlah\t  |");
            for(int i = 0; i < listbaju.size(); i++){
                System.out.print("| " + (i + 1) + "\t");
                System.out.print(listbaju.get(i).tipe + "\t");
                System.out.print(listbaju.get(i).getmodel() + "\t");
                System.out.print(listbaju.get(i).getukuran() + "\t");
                System.out.print(listbaju.get(i).getwarna() + "\t");
                System.out.println(listbaju.get(i).getjumlah() + "\t  |");
            }
        }
    }
    
    static void tampiljaket(){
        if(listjaket.isEmpty()){
            System.out.println("| Tidak ada data...");
        }else{
            System.out.println("+-----------------------------------------------+");
            System.out.println("|           =====   LIST JAKET   =====          |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("| No.\ttipe\tModel\tUkuran\tWarna\tJumlah\t  |");
            for(int i = 0; i < listjaket.size(); i++){
                System.out.print("| " + (i + 1) + "\t");
                System.out.print(listjaket.get(i).tipe + "\t");
                System.out.print(listjaket.get(i).getmodel() + "\t");
                System.out.print(listjaket.get(i).getukuran() + "\t");
                System.out.print(listjaket.get(i).getwarna() + "\t");
                System.out.println(listjaket.get(i).getjumlah() + "\t |");
            }
        }
    }
    
    static void edit() throws IOException{
        int pilih, select;
        System.out.println("+-----------------------------------------------+");
        System.out.println("|          =====   UBAH PESANAN   =====         |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Tipe Pakaian :                        |");
        System.out.println("|   [1] Baju                                    |");
        System.out.println("|   [2] Jaket                                   |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        pilih = Integer.parseInt(input.readLine());
        switch (pilih) {
            case 1 -> {
                tampilbaju();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor Pesanan : ");
                select = Integer.parseInt(input.readLine());
                select--;
                System.out.print("| Model : ");
                listbaju.get(select).setmodel(input.readLine());
                System.out.print("| Ukuran : ");
                listbaju.get(select).setukuran(input.readLine());
                System.out.print("| Warna : ");
                listbaju.get(select).setwarna(input.readLine());
                System.out.print("| Jumlah : ");
                listbaju.get(select).setjumlah(Integer.parseInt(input.readLine()));
                System.out.println("| Pesanan telah diperbarui...");
            }
            case 2 -> {
                tampiljaket();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor Pesanan : ");
                select = Integer.parseInt(input.readLine());
                select--;
                System.out.print("| Model : ");
                listjaket.get(select).setmodel(input.readLine());
                System.out.print("| Ukuran : ");
                listjaket.get(select).setukuran(input.readLine());
                System.out.print("| Warna : ");
                listjaket.get(select).setwarna(input.readLine());
                System.out.print("| Jumlah : ");
                listjaket.get(select).setjumlah(Integer.parseInt(input.readLine()));
                System.out.println("| Pesanan telah diperbarui...");
            }
            default -> System.out.println("| Tidak ada pilihan...");
        }
    }
    
    static void hapus() throws IOException{
        int pilih, select;
        System.out.println("+-----------------------------------------------+");
        System.out.println("|         =====   HAPUS PESANAN   =====         |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Tipe Pakaian :                        |");
        System.out.println("|   [1] Baju                                    |");
        System.out.println("|   [2] Jaket                                   |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        pilih = Integer.parseInt(input.readLine());
        switch (pilih) {
            case 1 -> {
                tampilbaju();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor Pesanan : ");
                select = Integer.parseInt(input.readLine());
                select--;
                listbaju.remove(select);
                System.out.println("| Pesanan telah dihapus...");
            }
            case 2 -> {
                tampiljaket();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor Pesanan : ");
                select = Integer.parseInt(input.readLine());
                select--;
                listjaket.remove(select);
                System.out.println("| Pesanan telah dihapus...");
            }
            default -> System.out.println("| Tidak ada pilihan...");
        }
    }
    
    public static void main(String[] args) throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|               Selamat datang di               |");
        System.out.println("|               GERAI KAOS TIARA                |");
        while(true){
            menu();
        }
    }
}