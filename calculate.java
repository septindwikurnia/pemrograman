class kalkulator {
    // Atribut
    public double angka1,angka2;
    // Method
    public double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }
    public double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    void tampil(){
        System.out.println("Hasil penjumlahan: " + tambah(10,5));
        System.out.println("Hasil penjumlahan: " + kurang(10,5));
    }
}
public class calculate{
    public static void main(String[] args) {
        kalkulator obj = new kalkulator();
        obj.tampil();

    }
}
