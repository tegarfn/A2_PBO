package posttest4;

class jaket extends pakaian{
    private String model;
    
    public jaket(String tipe, String model, String ukuran, String warna, int jumlah){
        super(tipe, ukuran, warna, jumlah);
        this.model = model;
    }
    
    public void setmodel(String capmodel){
        model = capmodel;
    }
    public String getmodel(){
        return model;
    }
    void buat(int jj){
        System.out.println("| membuat " + jj + " jaket...");
    }
    void selesai(){
        System.out.println("| Selesai membuat jaket...");
    }
}