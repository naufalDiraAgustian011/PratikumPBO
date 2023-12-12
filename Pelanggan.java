public class Pelanggan implements iNdamart{
    public String nama;
    public String noHP;
    public String alamat;

    public Pelanggan (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    @Override
    public void buatFaktur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetakFaktur'");
    }

    @Override
    public Integer totalHarga() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalBayar'");
    }


    
}
