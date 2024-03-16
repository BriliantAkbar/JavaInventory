package JavaInventory;
public class BarangElektronik extends Barang {
    private double harga;

    public BarangElektronik(String kodeBarang, String namaBarang, double harga) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
    }

    @Override
    public double hitungNilai() {
        return harga;
    }
}
