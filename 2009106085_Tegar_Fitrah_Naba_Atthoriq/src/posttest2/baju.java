package posttest2;

class baju {
    String model;
    String ukuran;
    String warna;
    int jumlah;
    
    public baju(String model, String ukuran, String warna, int jumlah){
        this.model = model;
        this.ukuran = ukuran;
        this.warna = warna;
        this.jumlah = jumlah;
    }
    
    void buatBaju(){
        System.out.println("membuat " + jumlah + " baju...");
    }
    void buatSelesai(){
        System.out.println("Selesai dibuat silahkan ke menu [2] Lihat");
    }
}
