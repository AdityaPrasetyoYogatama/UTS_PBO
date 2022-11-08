public class Dosen extends Karyawan{
    private String jurusan;
    private String nidn;
    private int gajit;

    public void mengajarlebih(int sks){
        gajit = sks * 100000;
    }

    @Override
    public void cetakGaji(){
        System.out.println("Gaji          : Rp."+ (gaji + gajit));
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
}
