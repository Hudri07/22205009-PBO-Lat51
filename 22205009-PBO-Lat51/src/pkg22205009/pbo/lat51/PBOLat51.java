package pkg22205009.pbo.lat51;

// Import Scanner untuk membaca input dari pengguna
import java.util.Scanner;
/**
 * Nama         : Asmalik Hudri
 * Prodi        : Teknik Informatika
 * Semester     : 3
 * Matakuliah   : Pemrograman Berorientasi Objek (PBO)
 */

// Kelas dasar yang merepresentasikan karyawan
class Karyawan {

    // Properti yang dilindungi (protected) agar dapat diakses oleh kelas turunan
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    //Getter untuk mendapatkan nilai NIK
    public String getNIK() {
        return nik;
    }

    // Setter untuk mengatur nilai NIK
    public void setNik(String nik) {
        this.nik = nik;
    }

    // Getter untuk mendapatkan nilai nama
    public String getNama() {
        return nama;
    }

    // Setter untuk mengatur nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mendapatkan nilai jabatan.
    public String getJabatan() {
        return jabatan;
    }

    // Setter untuk mengatur nilai jabatan
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Getter untuk mendapatkan nilai golongan
    public int getGolongan() {
        return golongan;
    }

    //Setter untuk mengatur nilai golongan
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}

// Kelas turunan Manager yang merupakan spesialisasi dari karyawan
class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    // Getter untuk Mendapatkan nilai variabel kehadiran.
    public int getKehadiran() {
        return kehadiran;
    }

    // Setter untuk Mengatur nilai variabel kehadiran.
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    // Metode untuk menghitung tunjangan kehadiran
    public float tunjannganKehadiran(int hadir) {
        tunjanganKehadiran = kehadiran * 10000;
        return tunjanganKehadiran;
    }

    // Metode untuk menghitung tunjangan jabatan
    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }

    // Metode untuk menghitung tunjangan golongan
    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) {
            tunjanganGolongan = 500000;
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000;
        } else {
            tunjanganGolongan = 0;
        }
        
        return tunjanganGolongan;
    }

}

// Kelas utama yang berisi metode main untuk menjalankan program
public class PBOLat51{

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        Manager m = new Manager();  // Membuat objek Manager
        
        System.out.println("===Program Perhitungan Gaji Karyawan====");
        
        // Meminta input dari pengguna untuk data karyawan
        System.out.print("Masukkan NIK : ");
        m.setNik(scanner.nextLine());
        
        System.out.print("Masukkan Nama: ");
        m.setNama(scanner.nextLine());
        
        System.out.print("Masukkan Golongan (1/2/3) : ");
        m.setGolongan(scanner.nextInt());
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        m.setJabatan(scanner.next());
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        m.setKehadiran(scanner.nextInt());
        
        // Menampilkan informasi karyawan dan hasil perhitungan tunjangan
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + m.getNIK());
        System.out.println("NAMA\t: " + m.getNama());
        System.out.println("GOLONGAN: " + m.getGolongan());
        System.out.println("JABATAN\t: " + m.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + m.tunjannganKehadiran(m.getKehadiran()));
    }
}