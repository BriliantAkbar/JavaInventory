package JavaInventory;
import java.util.ArrayList;
import java.util.List;

public class InventarisApp<T extends Barang> {
    private List<T> inventaris = new ArrayList<>();

    public void tambahBarang(T barang) {
        inventaris.add(barang);
    }

    public void tampilkanBarang() {
        for (T barang : inventaris) {
            System.out.println("Kode: " + barang.getKodeBarang() + ", Nama: " + barang.getNamaBarang() + ", Nilai: " + barang.hitungNilai());
        }
    }

    public double hitungTotalNilai() {
        double total = 0.0;
        for (T barang : inventaris) {
            total += barang.hitungNilai();
        }
        return total;
    }

    public double hitungRataRata() {
        if (inventaris.isEmpty()) {
            throw new ArithmeticException("Tidak dapat menghitung rata-rata karena inventaris kosong");
        }
        return hitungTotalNilai() / inventaris.size();
    }
}
