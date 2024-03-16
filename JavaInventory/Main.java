package JavaInventory;
public class Main {
    public static void main(String[] args) {
        InventarisApp<Barang> inventarisApp = new InventarisApp<>();
        inventarisApp.tambahBarang(new BarangElektronik("E001", "Laptop", 500.0));
        inventarisApp.tambahBarang(new BarangPakaian("P001", "Kemeja", 100.0, 3));
        inventarisApp.tambahBarang(new BarangPakaian("P002", "Celana", 80.0, 2));

        inventarisApp.tampilkanBarang();
        System.out.println("Total nilai inventaris: " + inventarisApp.hitungTotalNilai());

        try {
            System.out.println("Rata-rata nilai inventaris: " + inventarisApp.hitungRataRata());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
