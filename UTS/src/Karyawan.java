public class Karyawan {
    protected String nip;
    protected String nama;
    protected String alamat;
    protected String tgl;
    protected String jk;
    protected int tahun;
    protected int gaji = 2000000;
    private int gajil;
    private int gajit;

    public int lembur(){
        return gajil = 0;
    }

    public int mengajarLebih(){
        return gajit = 0;
    }

    public void cetakGaji(){
        System.out.println("Gaji          : Rp."+ gaji);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
