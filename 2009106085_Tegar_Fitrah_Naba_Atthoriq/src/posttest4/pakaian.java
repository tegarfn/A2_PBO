package posttest4;

class pakaian {
    protected final String tipe;
    protected String ukuran, warna;
    protected int jumlah;
    
    public pakaian(String tipe, String ukuran, String warna, int jumlah){
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.warna = warna;
        this.jumlah = jumlah;
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
}