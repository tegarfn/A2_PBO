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
    void buat(){
        System.out.println("| membuat " + this.jumlah + " jaket...");
    }
}