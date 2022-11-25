package kasir; 

public class Pelanggan {
    private int nomorMeja; 
    private Makanan[] makanan = new Makanan[100];
    private int nomorPesanan = 0;

    public Pelanggan(int n) {
        this.nomorMeja = n;
    }

    public Makanan[] pesan(Makanan[] m) {
        this.makanan = m;
        this.nomorPesanan = m.length;

        return this.makanan;
    }
    

    public Makanan[] pesan(Makanan m) {
        this.makanan[this.nomorPesanan] = m;
        this.nomorPesanan++;

        return this.makanan;
    }

    public Makanan[] getPesanan() {
        return this.makanan;
    }

    public int getJumlahPesanan() {
        return this.nomorPesanan;
    }

    public double bayar(double hargaMakanan, double uang) {
        double kembalian = hargaMakanan - uang;

        return kembalian;
    }
    
    
}   