public class Pengembalian {
    int kd_pengembalian;
    String tgl_pengembalian;

    public Pengembalian(int kd_pengembalian, String tgl_pengembalian) {
        this.kd_pengembalian = kd_pengembalian;
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public int getKd_pengembalian() {
        return kd_pengembalian;
    }

    public void setKd_pengembalian(int kd_pengembalian) {
        this.kd_pengembalian = kd_pengembalian;
    }
    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(String tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

}
