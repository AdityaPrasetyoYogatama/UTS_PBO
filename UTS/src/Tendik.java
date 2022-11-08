public class Tendik extends Karyawan{
    private int gajil;

    public int lembur(int jam){
        return gajil = jam * 50000;
    }

    @Override
    public void cetakGaji(){
        System.out.println("Gaji          : Rp."+ (gaji + gajil));
    }
}
