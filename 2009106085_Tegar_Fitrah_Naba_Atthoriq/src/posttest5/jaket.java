package posttest5;

public final class jaket extends pakaian{
    public final String tipej = "jaket";
    private String model;
    
    protected jaket(String tipe, String model, String ukuran, String warna, int jumlah){
        super(ukuran, warna, jumlah);
        this.model = model;
    }
    
    protected void setmodel(String capmodel){
        model = capmodel;
    }
    protected String getmodel(){
        return model;
    }
    protected void buat(int jj){
        System.out.println("| membuat " + jj + " jaket...");
    }
    
    @Override
    void selesai(){
        System.out.println("| Selesai membuat jaket...");
    }
}