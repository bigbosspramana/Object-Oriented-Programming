public class EnchanceCantForLoop {
    public static void main (String []args) {
        // Membuat sebuah for yang di dalamnya sudah termasuk inisialisasi, syarat, dan increment
        for (int i = 1; i <= 10; i++) {
            // Pengkondisian berdasarkan syarat
            if (i % 2 != 0) {
                // Menampilkan hasil dari print
                System.out.println(i);
            }
        }
    }
}

// Kenapa kode ini, tidak bisa masuk dalam enchance loop. Karena dalam kode ini membutuhkan cek secara langsung agar dapat menentukan
// hasilnya ganjil atau tidak. saya menggunakan for loop dengan indeks i yang diiterasi dari 1 hingga 10. 
