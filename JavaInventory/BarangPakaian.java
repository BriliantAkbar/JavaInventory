package JavaInventory;
public class BarangPakaian extends Barang {
    private double harga;
    private int jumlah;

    public BarangPakaian(String kodeBarang, String namaBarang, double harga, int jumlah) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    public double hitungNilai() {
        return harga * jumlah;
    }
}
