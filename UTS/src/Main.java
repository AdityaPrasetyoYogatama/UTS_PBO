public class Main {
    public static void main(String[] args) {

       Tendik ten = new Tendik();
       ten.setNip("1234");
       ten.setNama("Bu Tendik");
       ten.setAlamat("Jogja");
       ten.setTgl("21-12-1998");
       ten.setJk("Perempuan");
       ten.setTahun(2020);
       ten.lembur(20);

       System.out.println("============ Tendik =============");
       System.out.println("NIP           : " + ten.getNip());
       System.out.println("Nama          : " + ten.getNama());
       System.out.println("Alamat        : " + ten.getAlamat());
       System.out.println("Tgl Lahir     : " + ten.getTgl());
       System.out.println("Jenis Kelamin : " + ten.getJk());
       System.out.println("Tahun Masuk   : " + ten.getTahun());
       ten.cetakGaji();

       Dosen dos = new Dosen();
       dos.setNip("4321");
       dos.setNama("Pak Dosen");
       dos.setAlamat("Jogja");
       dos.setTgl("21-12-1970");
       dos.setJk("Laki-Laki");
       dos.setTahun(1995);
       dos.setJurusan("INFORMATIKA");
       dos.setNidn("2169");
       dos.mengajarlebih(6);

       System.out.println("============= Dosen =============");
       System.out.println("NIP           : " + dos.getNip());
       System.out.println("NIDN          : " + dos.getNidn());
       System.out.println("Jurusan       : " + dos.getJurusan());
       System.out.println("Nama          : " + dos.getNama());
       System.out.println("Alamat        : " + dos.getAlamat());
       System.out.println("Tgl Lahir     : " + dos.getTgl());
       System.out.println("Jenis Kelamin : " + dos.getJk());
       System.out.println("Tahun Masuk   : " + dos.getTahun());
       dos.cetakGaji();
    }
}