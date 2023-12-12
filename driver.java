import java.util.InputMismatchException;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        String n = "lanjut";
        Integer hargaBarang = 0;
        Integer jumlahBarang = 0;
        Integer noKasir = 0;

        
        LoginAkun baru = new LoginAkun();

        while(n.equals("lanjut")){
            boolean input = false;
            Scanner inputScanner = new Scanner(System.in);
            Scanner integer = new Scanner(System.in);
            System.out.print("nama Pelanggan   : ");
            String nama = inputScanner.nextLine();
            Scanner stringAlamat = new Scanner(System.in);
            System.out.print("Alamat           : ");
            String alamat = stringAlamat.nextLine();
            System.out.print("Kode barang      : ");
            String kodeBarang = inputScanner.next();
            System.out.print("Nama Barang      : ");
            String namaBarang = inputScanner.next();
            System.out.print("Harga Barang     : ");
            Scanner stringHarga = new Scanner(System.in);
            hargaBarang = integer.nextInt();
            System.out.print("Jumlah Barang    : ");
            jumlahBarang = integer.nextInt();

            input = false;
            int check = 0;
                do{
                        if(check>0)
                            System.out.println("Input ulang !!!");
                    check++;
                    try {
                        
                        System.out.println("No Kasir         : (1 sampai 3)");
                        noKasir = integer.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Masukkan Bilangan !!!");
                        integer.next();}
                }while(!input || noKasir>3 || noKasir<=0); 
            

            
            Penjualan penjualan  = new Penjualan(nama, alamat, kodeBarang, namaBarang, hargaBarang, jumlahBarang, noKasir-1);

            Scanner cout = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("ketik lanjut untuk melanjutkan");
            n = cout.next();
            System.out.println();
        }
    }
}