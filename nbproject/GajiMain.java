package gaji;
public class GajiMain {
    public static void main(String[] args) {
        SE main = new SE();
        System.out.println("Total Gaji Karyawan Software Engineer Dibawah 5 Tahun per bulan : " +main.GajiTot());
        PM coy = new PM();
        System.out.println("Total Gaji Karyawan Project Manager Diatas 10 Tahun per bulan   : " +coy.GajiTot10());
    }
    
}
