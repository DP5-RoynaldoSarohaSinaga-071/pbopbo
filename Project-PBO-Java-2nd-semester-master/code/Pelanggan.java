import java.time.LocalDate;
class Pelanggan {
    private String nama, alamat, nomorTelepon;
    public int jumlahPenumpang;
    private LocalDate tanggalAwal, tanggalAkhir;
    public Pemesanan pemesanan;

    public Pelanggan(){
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public LocalDate getTanggalAwal() {
        return tanggalAwal;
    }

    public void setTanggalAwal(LocalDate tanggal) {
        this.tanggalAwal = tanggal;
    }

    public LocalDate getTanggalAkhir() {
        return tanggalAkhir;
    }

    public void setTanggalAkhir(LocalDate tanggal) {
        this.tanggalAkhir = tanggal;
    }
}
