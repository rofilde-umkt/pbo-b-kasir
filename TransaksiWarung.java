import kasir.Makanan;
import kasir.Pelanggan;
import kasir.Kasir;

public class TransaksiWarung {
    public static void main(String[] args) {
        Makanan soto = new Makanan("Soto Betawi", 50000);
        Makanan coto = new Makanan("Coto ", 38000);
        Makanan bakso = new Makanan("Bakso Malang", 15000);
        Makanan sate = new Makanan("Sate Madura", 35000);

        Pelanggan udin = new Pelanggan(12);
        Kasir siti = new Kasir();

        udin.pesan(coto);
        udin.pesan(bakso);
        double totalHarga = siti.totalPesanan(udin);
        double kembalian = udin.bayar(totalHarga, 200000);
        System.out.println("Total Pesanan Udin " + totalHarga);
        System.out.println("Uang udin " + 200000);
        System.out.println("Kembalian Udin " + kembalian);
    }
}
