package posttest5;

public final class baju extends pakaian{
    public final String tipeb = "Baju";
    private String model;
    
    protected baju(String tipe, String model, String ukuran, String warna, int jumlah){
        super(ukuran, warna, jumlah);
        this.model = model;
    }
    
    protected void setmodel(String capmodel){
        model = capmodel;
    }
    protected String getmodel(){
        return model;
    }
    protected void buat(int jb){
        System.out.println("| membuat " + jb + " baju...");
    }
    
    @Override
    void selesai(){
        System.out.println("| Selesai membuat baju...");
    }
}