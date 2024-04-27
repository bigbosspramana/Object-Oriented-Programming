import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Transaksi> arrayTransaksiMahasiswa = new ArrayList<Transaksi>();
        ArrayList<Transaksi> arrayTransaksiDosen = new ArrayList<Transaksi>();
        ArrayList<Client> arrayMember = new ArrayList<Client>();
        ArrayList<Mahasiswa> arrayMahasiswa = new ArrayList<Mahasiswa>();
        ArrayList<Dosen> arrayDosen = new ArrayList<Dosen>();
        ArrayList<Pustakawan> arrayPustakawan = new ArrayList<Pustakawan>();
        ArrayList<Buku> arrayBuku = new ArrayList<Buku>();
        ArrayList<Cd> arrayCD = new ArrayList<Cd>();

        boolean inputValid = false;
        while (!inputValid) {
            try {
                // Scanner scanner = new Scanner(System.in);
                System.out.println("========================");
                System.out.println("      Perpustakaan      ");
                System.out.println("========================");
                System.out.println("1) Pustakawan");
                System.out.println("2) Dosen");
                System.out.println("3) Mahasiswa");
                System.out.println("4) Exit");

                System.out.print("Pilihan : ");
                int choice = Integer.parseInt(scanner.nextLine());

                boolean inputValid1 = true;

                //while (inputValid1) {
                    try {
                        switch (choice) {
                         case 1 :
                            boolean pustakawan_menu = true;
                            while (pustakawan_menu) {
                                System.out.println("=====================");
                                System.out.println("      Pustakawan     ");
                                System.out.println("=====================");
                                System.out.println("1) Sign Up");
                                System.out.println("2) Log In");
                                System.out.println("3) Exit");
                                System.out.print("Pilih : ");
                                int pus1 = Integer.parseInt(scanner.nextLine());
    
                                switch (pus1) {
                                    case 1 : 
                                        System.out.println("======================");
                                        System.out.println("        Sign Up       ");
                                        System.out.println("======================");
                                        System.out.println("Masukkan ID Pustakawan : ");
                                        int id_pustakawan = Integer.parseInt(scanner.nextLine());
                                        System.out.println("Masukkan Username : ");
                                        String username = scanner.nextLine();
                                        System.out.println("Masukkan Password : ");
                                        String password = scanner.nextLine();
                                        System.out.println("Masukkan Jenis Kelamin : ");
                                        boolean j_kel  = scanner.nextBoolean();
                                        System.out.println("Masukkan Email : ");
                                        String email = scanner.nextLine();
                                        System.out.println(("Masukkan Nama : "));
                                        String nama = scanner.nextLine();
                                        Pustakawan pustakawan1 = new Pustakawan(id_pustakawan, username, password, j_kel, email, nama);
                                        arrayPustakawan.add(pustakawan1);
                                        System.out.println("Akun Kamu berhasil di Tambahkan. ");
                                        pustakawan_menu = false;
                                        break;
    
                                    case 2 :
                                        System.out.println("======================");
                                        System.out.println("        Log In        ");
                                        System.out.println("======================");
                                        System.out.println("Masukkan Username : ");
                                        String user1 = scanner.nextLine();
                                        System.out.println("Masukkan Password : ");
                                        String pass1 = scanner.nextLine();
    
                                        boolean loggedIn = false; // Initialize loggedIn variable
                                        for (Pustakawan pustakawan : arrayPustakawan) {
                                            if (pustakawan.checkCredentials(user1, pass1)) {
                                                System.out.println("Log in successful. Welcome, " + pustakawan.getUsername() + "!");
                                                loggedIn = true;
                                                pustakawan_menu = false;
                                                while (!pustakawan_menu) {
                                                    System.out.println("================================");
                                                System.out.println("        Hello, Pustakawan " + pustakawan.getNama() + "         ");
                                                System.out.println("================================");
                                                System.out.println("1) Tambah Buku");
                                                System.out.println("2) Tambah CD");
                                                System.out.println("3) Check Member");
                                                System.out.println("4) Check Buku");
                                                System.out.println("5) Check CD");
                                                System.out.println("6) Check Peminjaman Member");
                                                System.out.println("Pilihan : ");
                                                int choice2 = Integer.parseInt(scanner.nextLine());

                                                switch (choice2) {
                                                    case 1:
                                                        arrayBuku.add(new Buku(611, "Buku1", "2005", "2013", "Cover", 3, 5, 12, 20));
                                                        arrayBuku.add(new Buku(612, "Buku2", "2004", "2013", "Cover", 5, 3, 12, 20));
                                                        arrayBuku.add(new Buku(613, "Buku3", "2005", "2015", "Cover", 6, 4, 10, 20));
                                                        arrayBuku.add(new Buku(614, "Buku4", "2004", "2013", "Cover", 4, 6, 10, 20));
                                                        arrayBuku.add(new Buku(615, "Buku5", "2004", "2014", "Cover", 5, 5, 10, 20));
                                                        System.out.println("=====================");
                                                        System.out.println("      Tambah Buku    ");
                                                        System.out.println("=====================");
                                                        App.tbl_buku(arrayBuku);
                                                        System.out.println("Masukkan ID Buku : ");
                                                        int id_buku = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Judul : ");
                                                        String judul = scanner.nextLine();
                                                        System.out.println("Masukkan Tahun Terbit : ");
                                                        String thn_terbit = scanner.nextLine();
                                                        System.out.println("Masukkan Edisi : ");
                                                        String edisi = scanner.nextLine();
                                                        System.out.println("Masukkan Jenis Sampul : ");
                                                        String jns_sampul = scanner.nextLine();
                                                        System.out.println("Masukkan Jumlah Rusak : ");
                                                        int jml_rusak = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Jumlah Pinjam : ");
                                                        int jml_pinjam = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Jumlah Tersedia : ");
                                                        int jml_tersedia = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Jumlah Total : ");
                                                        int jml_total = Integer.parseInt(scanner.nextLine());
                                                        Buku bukuBaru = new Buku(id_buku, judul, thn_terbit, edisi, jns_sampul, jml_rusak, jml_pinjam, jml_tersedia, jml_total);
                                                        arrayBuku.add(bukuBaru);
                                                        System.out.println("Buku berhasil ditambahkan.");
                                                        break; 

                                                    case 2 :
                                                        arrayCD.add(new Cd(501, "CD1", "2005", 30, 20, 5, 5));
                                                        arrayCD.add(new Cd(502, "CD2", "2004", 30, 15, 12, 8));
                                                        arrayCD.add(new Cd(503, "CD3", "2005", 30, 25, 2, 3));
                                                        arrayCD.add(new Cd(504, "CD4", "2004", 30, 15, 5, 10));
                                                        arrayCD.add(new Cd(505, "CD5", "2004", 30, 20, 20, 10));
                                                        System.out.println("=====================");
                                                        System.out.println("       Tambah CD     ");
                                                        System.out.println("=====================");
                                                        App.tbl_cd(arrayCD);
                                                        System.out.println("Masukkan ID CD : ");
                                                        int kd_cd = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Judul : ");
                                                        String judulCD = scanner.nextLine();
                                                        System.out.println("Masukkan Tahun Terbit : ");
                                                        String thn_terbitCD = scanner.nextLine();
                                                        System.out.println("Masukkan Jumlah Total : ");
                                                        int jml_totalCD = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Jumlah Tersedia : ");
                                                        int jml_tersediaCD = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Jumlah Pinjam : ");
                                                        int jml_pinjamCD = Integer.parseInt(scanner.nextLine());
                                                        System.out.println("Masukkan Jumlah Rusak : ");
                                                        int jml_rusakCD = Integer.parseInt(scanner.nextLine());
                                                        Cd CDBaru = new Cd(kd_cd, judulCD, thn_terbitCD, jml_totalCD, jml_tersediaCD, jml_pinjamCD, jml_rusakCD);
                                                        arrayCD.add(CDBaru);
                                                        System.out.println("CD Berhasil di tambahkan!");
                                                        break;

                                                    case 3 :
                                                        arrayMember.addAll(arrayDosen);
                                                        arrayMember.addAll(arrayMahasiswa);
                                                        System.out.println("======================");
                                                        System.out.println("      Check Member    ");
                                                        System.out.println("======================");
                                                        System.out.println("+----------------+----------------+----------------+----------------+----------------+----------------+----------------+");
                                                        System.out.println("|      Nama      |    Fakultas    |      Prodi     |   ID Member    |    Username    |    Password    |    NIK/NIM     |");
                                                        System.out.println("+----------------+----------------+----------------+----------------+----------------+----------------+----------------+");
                                                        for (Client member : arrayMember) {
                                                            String idSpesifik = "";
                                                            if (member instanceof Dosen) {
                                                                idSpesifik = String.valueOf(((Dosen) member).getNIK());
                                                            } else if (member instanceof Mahasiswa) {
                                                                idSpesifik = String.valueOf(((Mahasiswa) member).getNIM());
                                                            }
                                                            System.out.printf("| %-14s | %-14s | %-14s | %-14d | %-14s | %-14s | %-14s |\n", 
                                                                member.getNama(), member.getFakultas(), member.getProdi(), 
                                                                member.getId_member(), member.getUsername(), member.getPassword(), idSpesifik);
                                                        }
                                                        System.out.println("+----------------+----------------+----------------+----------------+----------------+----------------+");
                                                        break;

                                                    case 4 :
                                                        System.out.println("======================");
                                                        System.out.println("      Check Buku      ");
                                                        System.out.println("======================");
                                                        App.tbl_buku(arrayBuku);
                                                    
                                                    case 5 :
                                                        System.out.println("======================");
                                                        System.out.println("      Check CD      ");
                                                        System.out.println("======================");
                                                        App.tbl_cd(arrayCD);

                                                    case 6 :


                                                    default:
                                                        break;
                                                }
                                                break;
                                                }
                                            }
                                        }
        
                                        if (loggedIn) {
                                            System.out.println("Invalid username or password.");
                                        }
    
                                    case 3 :
                                        pustakawan_menu = false; 
                                        break;
                            }
                            
                            }
                            
                         case 2 : 
                         boolean dosen_menu = true;
                            while (dosen_menu) {
                                System.out.println("================");
                                System.out.println("      Dosen     ");
                                System.out.println("================");
                                System.out.println("1) Sign Up");
                                System.out.println("2) Log In");
                                System.out.println("3) Exit");
                                System.out.print("Pilih : ");
                                int dos1 = Integer.parseInt(scanner.nextLine());

                                switch (dos1) {
                                    case 1 :
                                        System.out.println("======================");
                                        System.out.println("        Sign Up       ");
                                        System.out.println("======================");
                                        System.out.println("Masukkan ID Member : ");
                                        int id_member = Integer.parseInt(scanner.nextLine());
                                        System.out.println("Masukkan NIK : ");
                                        int NIK = Integer.parseInt(scanner.nextLine());
                                        System.out.println("Masukkan Nama : ");
                                        String nama = scanner.nextLine();
                                        System.out.println("Masukkan Username : ");
                                        String username = scanner.nextLine();
                                        System.out.println("Masukkan Password : ");
                                        String password = scanner.nextLine();
                                        System.out.println("Masukkan Prodi : ");
                                        String prodi = scanner.nextLine();
                                        System.out.println("Masukkan Fakultas : ");
                                        String fakultas = scanner.nextLine();
                                        Dosen dosen1 = new Dosen(NIK, nama, fakultas, prodi, id_member, username, password);
                                        arrayDosen.add(dosen1);
                                        System.out.println("Akun Kamu Berhasil Di Tambahkan!");
                                        dosen_menu = false;
                                        break;
    
                                    case 2 : 
                                        System.out.println("======================");
                                        System.out.println("        Log In        ");
                                        System.out.println("======================");
                                        System.out.println("Masukkan Username : ");
                                        String user1 = scanner.nextLine();
                                        System.out.println("Masukkan Password : ");
                                        String pass1 = scanner.nextLine();
    
                                        boolean loggedIn = false; // Initialize loggedIn variable
                                        for (Dosen dosen : arrayDosen) {
                                            if (dosen.checkCredentials(user1, pass1)) {
                                                System.out.println("Log in successful. Welcome, " + dosen.getUsername() + "!");
                                                loggedIn = true;
                                                dosen_menu = false;
                                                while (!dosen_menu) {
                                                    System.out.println("======================");
                                                    System.out.println("        Hello, Pak/Bu" + dosen.getNama() + "         ");
                                                    System.out.println("======================");
                                                    System.out.println("1) Pinjam Buku");
                                                    System.out.println("2) Pinjam CD");
                                                    System.out.println("3) Check List Peminjaman");
                                                    System.out.println("4) Exit");
                                                    System.out.println("Pilihan : ");
                                                    int choice3 = Integer.parseInt(scanner.nextLine());

                                                    switch (choice3) {
                                                        case 1 :
                                                            App.tbl_buku(arrayBuku);
                                                            int i = 0;
                                                            if (i >= 0) {
                                                                int id_transaksi = i++;
                                                                return;
                                                            };
                                                            System.out.println("Masukkan ID Buku : ");
                                                            int id_buku = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan ID Member : ");
                                                            int id_member1 = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan Tanggal Pinjam : ");
                                                            String tgl_pinjam = scanner.nextLine();
                                                            System.out.println("Masukkan Tanggal Pengembalian : ");
                                                            String tgl_pengembalian = scanner.nextLine();
                                                            Transaksi transaksi1 = new Transaksi((arrayTransaksiDosen.size() > 0)? arrayTransaksiDosen.getLast().getId_transaksi() + 1 : 0, id_member1,
                                                            arrayPustakawan.get(0), tgl_pinjam, tgl_pengembalian, id_buku, 0);
                                                            arrayTransaksiDosen.add(transaksi1);
                                                            break;

                                                        case 2 : 
                                                            App.tbl_cd(arrayCD);
                                                            System.out.println("Masukkan ID Buku : ");
                                                            int kd_cd = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan ID Member : ");
                                                            int id_member2 = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan Tanggal Pinjam : ");
                                                            String tgl_pinjam1 = scanner.nextLine();
                                                            System.out.println("Masukkan Tanggal Pengembalian : ");
                                                            String tgl_pengembalian1 = scanner.nextLine();
                                                            Transaksi transaksi2 = new Transaksi((arrayTransaksiDosen.size() > 0)? arrayTransaksiDosen.getLast().getId_transaksi() + 1 : 0, id_member2,
                                                            arrayPustakawan.get(0), tgl_pinjam1, tgl_pengembalian1, 0, kd_cd);
                                                            arrayTransaksiDosen.add(transaksi2);

                                                        case 3 :
                                                        System.out.println("=================================");
                                                        System.out.println("     Data Transaksi Dosen     ");
                                                        System.out.println("=================================");
                                                        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "ID Transaksi", "ID Member", "ID Buku", "ID CD", "Tanggal Pinjam", "Tanggal Pengembalian");
                                                        for (Transaksi transaksi : arrayTransaksiDosen) {
                                                            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", transaksi.getId_transaksi(), transaksi.getMember(), transaksi.getId_buku(), transaksi.getKd_cd(), transaksi.getTgl_pinjam(), transaksi.getTgl_pengembalian());
                                                        }

                                                        case 4 :
                                                         break;

                                                        default:
                                                            break;
                                                    }
                                                }
                                            }
                                        }
    
                                        if (!loggedIn) {
                                            System.out.println("Invalid username or password.");
                                        }
                                    
                                    case 3 :
                                        dosen_menu = false;
                                        
                                        
                                }
                            }

                         case 3 :
                            boolean mah_menu = true;
                            while (mah_menu) {
                                System.out.println("================");
                                System.out.println("    Mahasiswa   ");
                                System.out.println("================");
                                System.out.println("1) Sign Up");
                                System.out.println("2) Log In");
                                System.out.println("3) Exit");
                                System.out.print("Pilih : ");
                                int mah1 = Integer.parseInt(scanner.nextLine());
                            
                            switch (mah1) {
                                case 1 :
                                    System.out.println("======================");
                                    System.out.println("        Sign Up       ");
                                    System.out.println("======================");
                                    System.out.println("Masukkan ID Member : ");
                                    int id_member = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Masukkan NIM : ");
                                    int NIM = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Masukkan Nama : ");
                                    String nama = scanner.nextLine();
                                    System.out.println("Masukkan Username : ");
                                    String username = scanner.nextLine();
                                    System.out.println("Masukkan Password : ");
                                    String password = scanner.nextLine();
                                    System.out.println("Masukkan Prodi : ");
                                    String prodi = scanner.nextLine();
                                    System.out.println("Masukkan Fakultas : ");
                                    String fakultas = scanner.nextLine();
                                    Mahasiswa mahasiswa1 = new Mahasiswa(NIM, nama, fakultas, prodi, id_member, username, password);
                                    arrayMahasiswa.add(mahasiswa1); 
                                    mah_menu = false;
                                    break;

                                case 2 : 
                                    System.out.println("======================");
                                    System.out.println("        Log In        ");
                                    System.out.println("======================");
                                    System.out.println("Masukkan Username : ");
                                    String user1 = scanner.nextLine();
                                    System.out.println("Masukkan Password : ");
                                    String pass1 = scanner.nextLine();

                                    boolean loggedIn = false; // Initialize loggedIn variable
                                    for (Mahasiswa mahasiswa : arrayMahasiswa) {
                                        if (mahasiswa.checkCredentials(user1, pass1)) {
                                            System.out.println("Log in successful. Welcome, " + mahasiswa.getUsername() + "!");
                                            loggedIn = true;
                                            mah_menu = false;
                                                while (!mah_menu) {
                                                    System.out.println("======================");
                                                    System.out.println("        Hello," + mahasiswa.getNama() + "         ");
                                                    System.out.println("======================");
                                                    System.out.println("1) Pinjam Buku");
                                                    System.out.println("2) Pinjam CD");
                                                    System.out.println("3) Check List Peminjaman");
                                                    System.out.println("4) Exit");
                                                    System.out.println("Pilihan : ");
                                                    int choice3 = Integer.parseInt(scanner.nextLine());

                                                    switch (choice3) {
                                                        case 1 :
                                                            App.tbl_buku(arrayBuku);
                                                            int i = 0;
                                                            if (i >= 0) {
                                                                int id_transaksi = i++;
                                                                return;
                                                            };
                                                            System.out.println("Masukkan ID Buku : ");
                                                            int id_buku = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan ID Member : ");
                                                            int id_member1 = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan Tanggal Pinjam : ");
                                                            String tgl_pinjam = scanner.nextLine();
                                                            System.out.println("Masukkan Tanggal Pengembalian : ");
                                                            String tgl_pengembalian = scanner.nextLine();
                                                            Transaksi transaksi1 = new Transaksi((arrayTransaksiMahasiswa.size() > 0)? arrayTransaksiMahasiswa.getLast().getId_transaksi() + 1 : 0, id_member1,
                                                            arrayPustakawan.get(0), tgl_pinjam, tgl_pengembalian, id_buku, 0);
                                                            arrayTransaksiMahasiswa.add(transaksi1);
                                                            break;

                                                        case 2 : 
                                                            App.tbl_cd(arrayCD);
                                                            System.out.println("Masukkan ID Buku : ");
                                                            int kd_cd = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan ID Member : ");
                                                            int id_member2 = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Masukkan Tanggal Pinjam : ");
                                                            String tgl_pinjam1 = scanner.nextLine();
                                                            System.out.println("Masukkan Tanggal Pengembalian : ");
                                                            String tgl_pengembalian1 = scanner.nextLine();
                                                            Transaksi transaksi2 = new Transaksi((arrayTransaksiMahasiswa.size() > 0)? arrayTransaksiMahasiswa.getLast().getId_transaksi() + 1 : 0, id_member2,
                                                            arrayPustakawan.get(0), tgl_pinjam1, tgl_pengembalian1, 0, kd_cd);
                                                            arrayTransaksiMahasiswa.add(transaksi2);

                                                        case 3 :
                                                        System.out.println("=================================");
                                                        System.out.println("    Data Transaksi Mahasiswa     ");
                                                        System.out.println("=================================");
                                                        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "ID Transaksi", "ID Member", "ID Buku", "ID CD", "Tanggal Pinjam", "Tanggal Pengembalian");
                                                        for (Transaksi transaksi : arrayTransaksiDosen) {
                                                            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", transaksi.getId_transaksi(), transaksi.getMember(), transaksi.getId_buku(), transaksi.getKd_cd(), transaksi.getTgl_pinjam(), transaksi.getTgl_pengembalian());
                                                        }

                                                        case 4 :
                                                         break;

                                                        default:
                                                            break;
                                                    }
                                            break;
                                        }
                                    }

                                    if (!loggedIn) {
                                        System.out.println("Invalid username or password.");
                                    }
                                    }

                                case 3 :
                                    mah_menu = false;
                                    break;
                            }
                            
                            }

                            case 4 :
                             break;

                            default : 
                             break;
                        }
                    } catch (Exception e) {
                        System.out.println("ERROR");
                    }
                //}
            } catch (Exception e) {
                    System.out.println("ERROR");
            }
                
        }        
}

    public static void tbl_buku(ArrayList<Buku> arrayBuku) {
        System.out.println("+------+-------+------------+-------------+------------+------------+------------+");
        System.out.println("| ID   | Judul | Tahun Terbit | Jml Total   | Jml Tersedia| Jml Pinjam | Jml Rusak  |");
        System.out.println("+------+-------+------------+-------------+------------+------------+------------+");
        for (Buku buku : arrayBuku) {
            System.out.printf("| %4d | %-5s | %-15s | %-11d | %-10d | %-10d | %-10d |\n",
                    buku.getISBN_ISSN(), buku.getJudul(), buku.getThn_terbit(), buku.getJml_total(),
                    buku.getJml_tersedia(), buku.getJml_pinjam(), buku.getJml_rusak());
        }
        System.out.println("+------+-------+------------+-------------+------------+------------+------------+");
    }

    public static void tbl_cd(ArrayList<Cd> arrayCD) {
        System.out.println("+------+-------+------------+------------+------------+------------+");
        System.out.println("| ID   | Judul | Tahun Terbit | Jml Total   | Jml Tersedia| Jml Pinjam | Jml Rusak  |");
        System.out.println("+------+-------+------------+------------+------------+------------+------------+");
        for (Cd cd : arrayCD) {
            System.out.printf("| %4d | %-5s | %-15s | %-11d | %-10d | %-10d | %-10d |\n",
                    cd.getKd_cd(), cd.getJudul(), cd.getThn_terbit(), cd.getJml_total(), cd.getJml_tersedia(),
                    cd.getJml_pinjam(), cd.getJml_rusak());
        }
        System.out.println("+------+-------+------------+------------+------------+------------+------------+");
    }
}
