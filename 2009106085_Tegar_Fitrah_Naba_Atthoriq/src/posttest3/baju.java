package posttest3;

class baju {
    String model;
    private String ukuran;
    private String warna;
    private int jumlah;
    
    public void setmodel(String capmodel){
        model = capmodel;
    }
    public String getmodel(){
        return model;
    }
    public void setukuran(String capukuran){
       ukuran = capukuran;
    }
    public String getukuran(){
       return ukuran;
    }
    public void setwarna(String capwarna){
       warna = capwarna;
    }
    public String getwarna(){
       return warna;
    }
    public void setjumlah(int capjumlah){
       jumlah = capjumlah;
    }
    public int getjumlah(){
       return jumlah;
    }
    
    void buatBaju(){
        System.out.println("| membuat " + jumlah + " baju...");
    }
    void buatSelesai(){
        System.out.println("| Selesai dibuat. silahkan ke menu [2]");
    }
}
