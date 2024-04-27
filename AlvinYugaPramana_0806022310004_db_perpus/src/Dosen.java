public class Dosen extends Client {
    private int NIK;

    public Dosen(){};

    public Dosen(int nik, String nama, String fakultas, String prodi, int id_member, String username, String password) {
        super(nama, fakultas, prodi, id_member, username, password);
        this.NIK = nik;
    }

    public int getNIK() {
        return NIK;
    }

    public void setNIK(int nik) {
        NIK = nik;
    }

}
