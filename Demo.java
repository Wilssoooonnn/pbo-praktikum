import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // PRAKTIKUM 2.3
        // ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();

        // Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom, M.Kom", "199402");
        // Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        // TenagaPendidikan tendik1 = new TenagaPendidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        // TenagaPendidikan tendik2 = new TenagaPendidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // daftarPegawai.add(dosen1);
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tendik1);
        // daftarPegawai.add(tendik2);
        // System.out.println("Jumlah Pegawai: " + daftarPegawai.size());

        // PRAKTIKUM 2.4
        // LANGKAH 2
        // Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom, M.Kom", "199402");
        // System.out.println(dosen1.nip);
        // System.out.println(dosen1.nama);
        // System.out.println(dosen1.nidn);
        // dosen1.mengajar();

        // LANGKAH 5
        // Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom, M.Kom", "199402");
        // Pegawai pegawai1 = dosen1;
        
        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // System.out.println(pegawai1.nidn);
        // pegawai1.mengajar();

        // LANGKAH 6
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom, M.Kom", "199402");
        Pegawai pegawai1 = dosen1;
        
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();
    }
}
