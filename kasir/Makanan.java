package kasir; 

public class Makanan {
    private String nama; 
    private double harga;

    public Makanan(String n, double h) {
        this.nama = n;
        this.harga = h;
    }

    public double getHarga() {
        return this.harga;
    }
}
