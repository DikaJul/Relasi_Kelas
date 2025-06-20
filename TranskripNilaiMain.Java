public class TranskripNilaiMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("2241760011", "Ade Sukendar");

        KartuHasilStudi khs = new KartuHasilStudi();
        khs.tambahMatakuliah(new Matakuliah("IF101", "Pemrograman", 3));
        khs.tambahMatakuliah(new Matakuliah("IF102", "Struktur Data", 2));

        TranskripNilai transkrip = new TranskripNilai(mhs, khs);

        System.out.println("Mahasiswa: " + transkrip.getMahasiswa().getNama());
        System.out.println("IPK: " + transkrip.hitungIPK());
    }
}
