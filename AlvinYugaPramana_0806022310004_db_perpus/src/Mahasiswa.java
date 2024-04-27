public class Mahasiswa extends Client{
    private int NIM;

    public Mahasiswa(){};

    public Mahasiswa(int nim, String nama, String fakultas, String prodi, int id_member, String username, String password) {
        super(nama, fakultas, prodi, id_member, username, password);
        this.NIM = nim;
    }
       
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int nim) {
        NIM = nim;
    }
    
}
