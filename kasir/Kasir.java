package kasir;

public class Kasir {
    private String nama;

    public double totalPesanan(Pelanggan p) {
        double total = 0;
        for(int i=0; i < p.getJumlahPesanan(); i++) {
            total += p.getPesanan()[i].getHarga();
        }

        return total;
    }
}
