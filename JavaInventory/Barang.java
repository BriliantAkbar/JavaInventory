package JavaInventory;
public abstract class Barang {
    private String kodeBarang;
    private String namaBarang;

    public Barang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public abstract double hitungNilai();

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }
}
