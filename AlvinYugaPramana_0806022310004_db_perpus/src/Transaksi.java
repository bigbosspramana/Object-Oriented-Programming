public class Transaksi {
    private int id_transaksi;
    private int id_member;
    private int id_buku;
    private int kd_cd;
    private Pustakawan pustakawan;
    private String tgl_pinjam;
    private String tgl_pengembalian;

    public Transaksi(int id_transaksi, int id_member, Pustakawan pustakawan, String tgl_pinjam, String tgl_pengembalian, int id_buku, int kd_cd) {
        this.id_transaksi = id_transaksi;
        this.id_member = id_member;
        this.pustakawan = pustakawan;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_pengembalian = tgl_pengembalian;
        this.id_buku = id_buku;
        this.kd_cd = kd_cd;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }
    
    public int getMember() {
        return id_member;
    }
    public void setMember(int id_member) {
        this.id_member = id_member;
    }
    public Pustakawan getPustakawan() {
        return pustakawan;
    }
    public void setPustakawan(Pustakawan pustakawan) {
        this.pustakawan = pustakawan;
    }
    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(String tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public int getKd_cd() {
        return kd_cd;
    }

    public void setKd_cd(int kd_cd) {
        this.kd_cd = kd_cd;
    }

}
