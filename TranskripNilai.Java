public class TranskripNilai {
    private Mahasiswa mahasiswa;
    private KartuHasilStudi kartuHasilStudi;

    public TranskripNilai(Mahasiswa mahasiswa, KartuHasilStudi kartuHasilStudi) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() { return mahasiswa; }
    public KartuHasilStudi getKartuHasilStudi() { return kartuHasilStudi; }

    public double hitungIPK() {
        return 0.0; 
    }
}