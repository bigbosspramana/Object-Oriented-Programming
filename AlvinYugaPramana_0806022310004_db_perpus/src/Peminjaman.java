public class Peminjaman {
    int kd_peminjaman;
    String tgl_peminjaman;

    public Peminjaman(int kd_peminjaman, String tgl_peminjaman) {
        this.kd_peminjaman = kd_peminjaman;
        this.tgl_peminjaman = tgl_peminjaman;
    }

    public int getKd_peminjaman() {
        return kd_peminjaman;
    }

    public void setKd_peminjaman(int kd_peminjaman) {
        this.kd_peminjaman = kd_peminjaman;
    }

    public String getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    public void setTgl_peminjaman(String tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }
    
}
