import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  



public class Penjualan extends Pelanggan {
    public String namaBarang;
    public Integer hargaBarang;
    public Integer jumlahBarang;
    public Integer totalBayar;
    public String kodeBarang;
    public Integer noKasir;
    public static Integer noFaktur = 0;


    
    
    public Penjualan(String nama, String alamat, String kodeBarang, String namaBarang, Integer hargaBarang, Integer jumlahBarang,int noKasir){
        super(nama,alamat);
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.totalBayar = hargaBarang * jumlahBarang;
        this.noKasir = noKasir;
        buatFaktur();
    }

    @Override
    public void buatFaktur(){

        System.out.println(" ");
        System.out.println("$ NDAMART SUPERMARKET $");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();
        System.out.println("Tanggal        : " + dtf.format(now));
        DateTimeFormatter jam = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Waktu          : " + jam.format(now) + "WIB");
        System.err.println();
        System.out.println("========================================");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Alamat         : " + super.alamat);
        System.out.println("########################################");
        System.out.println("INFO PEMBELIAN BARANG");
        System.out.println("----------------------------------------");
        System.out.println("Kode Barang    : " + kodeBarang);
        System.out.println("Nama Barang    : "+ namaBarang);
        System.out.println("Jumlah Beli    : " + jumlahBarang);
        System.out.println("Total Bayar    :"+ totalBayar);
        System.out.println("########################################");
        System.out.println("Kasir          :  "+ noKasir);


    }
}