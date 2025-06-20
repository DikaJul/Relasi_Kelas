public class MesinATM {
    private KartuDebit kartu;

    public void masukkanKartu(KartuDebit kartu) {
        this.kartu = kartu;
    }

    public void otentikasiKartu(String inputPin) {
        if (kartu != null && kartu.otentikasi(inputPin)) {
            System.out.println("Menu Utama");
        } else {
            System.out.println("No. PIN tidak sesuai");
        }
    }
}
