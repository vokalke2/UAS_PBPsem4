package toko;

public class Barang {
    private String kode_barang, nama_barang;
    private int harga_barang, stok_barang;

    public String getKode() {
        return kode_barang;
    }

    public void setKode(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama() {
        return nama_barang;
    }

    public void setNama(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga() {
        return harga_barang;
    }

    public void setHarga(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public int getStok() {
        return stok_barang;
    }

    public void setStok(int stok_barang) {
        this.stok_barang = stok_barang;
    }
}
