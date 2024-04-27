public abstract class Client {
    private String nama;
    private String fakultas;
    private String prodi;
    private int id_member;
    private String username;
    private String password;

    public Client(){}

    public Client(String nama, String fakultas, String prodi, int id_member, String username, String password) {
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.id_member = id_member;
        this.username = username;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getId_member() {
        return id_member;
    }

    public void setId_member(int id_member) {
        this.id_member = id_member;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

}

