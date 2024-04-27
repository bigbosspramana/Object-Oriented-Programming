public class Pembayaran {
    int kd_bayar;
    int jml_bayar;

    public Pembayaran(int kd_bayar, int jml_bayar) {
        this.kd_bayar = kd_bayar;
        this.jml_bayar = jml_bayar;
    }

    public int getKd_bayar() {
        return kd_bayar;
    }

    public void setKd_bayar(int kd_bayar) {
        this.kd_bayar = kd_bayar;
    }

    public int getJml_bayar() {
        return jml_bayar;
    }

    public void setJml_bayar(int jml_bayar) {
        this.jml_bayar = jml_bayar;
    }
    
}
