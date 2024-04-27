public class Pustakawan {
    private int id_pustakawan;
    private String username;
    private String password;
    private boolean j_kel;
    private String email;
    private String nama;

    public Pustakawan(){};

    public Pustakawan(int id_pustakawan, String username, String password, boolean j_kel, String email, String nama) {
        this.id_pustakawan = id_pustakawan;
        this.username = username;
        this.password = password;
        this.j_kel = j_kel;
        this.email = email;
        this.nama = nama;
    }

    public int getId_pustakawan() {
        return id_pustakawan;
    }

    public void setId_pustakawan(int id_pustakawan) {
        this.id_pustakawan = id_pustakawan;
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

    public boolean isJ_kel() {
        return j_kel;
    }

    public void setJ_kel(boolean j_kel) {
        this.j_kel = j_kel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean checkCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

}
