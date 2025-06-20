import java.util.ArrayList;

public class KartuHasilStudi {
    private ArrayList<Matakuliah> daftarMatakuliah = new ArrayList<>();

    public void tambahMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public ArrayList<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}