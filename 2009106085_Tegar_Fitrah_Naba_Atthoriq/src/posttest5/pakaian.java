package posttest5;

public abstract class pakaian {
    protected String tipe, ukuran, warna;
    protected int jumlah;
    
    protected pakaian(String ukuran, String warna, int jumlah){
        this.ukuran = ukuran;
        this.warna = warna;
        this.jumlah = jumlah;
    }
    
    protected void setukuran(String capukuran){
        ukuran = capukuran;
    }
    protected String getukuran(){
        return ukuran;
    }
    protected void setwarna(String capwarna){
        warna = capwarna;
    }
    protected String getwarna(){
        return warna;
    }
    protected void setjumlah(int capjumlah){
        jumlah = capjumlah;
    }
    protected int getjumlah(){
        return jumlah;
    }
    abstract void selesai();
}