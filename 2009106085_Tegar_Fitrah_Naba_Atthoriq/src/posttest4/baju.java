package posttest4;

class baju extends pakaian{
    private String model;
    
    public baju(String tipe, String model, String ukuran, String warna, int jumlah){
        super(tipe, ukuran, warna, jumlah);
        this.model = model;
    }
    
    public void setmodel(String capmodel){
        model = capmodel;
    }
    public String getmodel(){
        return model;
    }
    void buat(int jb){
        System.out.println("| membuat " + jb + " baju...");
    }
    void selesai(){
        System.out.println("| Selesai membuat baju...");
    }
}