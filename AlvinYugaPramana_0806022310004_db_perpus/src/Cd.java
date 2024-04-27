public class Cd {
    int kd_cd;
    String judul;
    String thn_terbit;
    int jml_total;
    int jml_tersedia;
    int jml_pinjam;
    int jml_rusak;

    public Cd (){};
    
    public Cd(int kd_cd, String judul, String thn_terbit, int jml_total, int jml_tersedia, int jml_pinjam,
        int jml_rusak) {
    this.kd_cd = kd_cd;
    this.judul = judul;
    this.thn_terbit = thn_terbit;
    this.jml_total = jml_total;
    this.jml_tersedia = jml_tersedia;
    this.jml_pinjam = jml_pinjam;
    this.jml_rusak = jml_rusak;
    }

    public int getKd_cd() {
        return kd_cd;
    }

    public void setKd_cd(int kd_cd) {
        this.kd_cd = kd_cd;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getThn_terbit() {
        return thn_terbit;
    }

    public void setThn_terbit(String thn_terbit) {
        this.thn_terbit = thn_terbit;
    }

    public int getJml_total() {
        return jml_total;
    }
    
    public void setJml_total(int jml_total) {
        this.jml_total = jml_total;
    }

    public int getJml_tersedia() {
        return jml_tersedia;
    }

    public void setJml_tersedia(int jml_tersedia) {
        this.jml_tersedia = jml_tersedia;
    }

    public int getJml_pinjam() {
        return jml_pinjam;
    }

    public void setJml_pinjam(int jml_pinjam) {
        this.jml_pinjam = jml_pinjam;
    }

    public int getJml_rusak() {
        return jml_rusak;
    }

    public void setJml_rusak(int jml_rusak) {
        this.jml_rusak = jml_rusak;
    }

}
    