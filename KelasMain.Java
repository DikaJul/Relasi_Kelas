public class KelasMain {
    public static void main(String[] args) {
        KartuDebit kartu = new KartuDebit("1234567890", "123");
        MesinATM atm = new MesinATM();

        atm.masukkanKartu(kartu);
        atm.otentikasiKartu("111"); 
        atm.otentikasiKartu("123"); 
    }
}
